package com.cognizant;

import java.util.Arrays;

import static java.util.Arrays.asList;

public class LibraryManagementSystem {
  public static void main(String[] args) {
    
    /* Member objects: */
    Member member1 = new Member("Kelly", "Fornya");
    Member member2 = new Member("Holly", "Wood");
    Member member3 = new Member("Sia", "Attle");
    Member member4 = new Member("Thor", "Onto");
    Member member5 = new Member("Dakota", "North");
    
    /* PremiumMember objects: */
    PremiumMember pMember1 = new PremiumMember("Ellie", "Noie");
    PremiumMember pMember2 = new PremiumMember("Ary", "Zonah");
    PremiumMember pMember3 = new PremiumMember("Eta", "Lee");
    
    
    /* Book objects: */
    Book book1 = new Book("Flexible Rails", "Peter Armstrong", "1933988509", 3);
    Book book2 = new Book("Java Persistence with Hibernate", "Christian Bauer", "1932394885", 1);
    Book book3 = new Book("Ruby for Rails", "David A. Black", "1932394699", 7);
    Book book4 = new Book("Android in Practice", "Charlie Collins", "1935182927", 5);
    Book book5 = new Book("Data Munging with Perl", "David Cross", "1930110006", 0);
    Book book6 = new Book("SOA Governance in Action", "Jos Dirksen", "1617290270", 2);
    Book book7 = new Book("Handling Protocols with the Net Component", "Vikram Goyal", "1932394524", 3);
    Book book8 = new Book("OSGi in Action", "Richard S. Hall", "1933988916", 9);
    Book book9 = new Book("Agile ALM", "Michael Hüttermann", "1935182633", 1);
    Book book10 = new Book("Kermit 95+", "Kermit Project at Columbia University", "1930110057", 1);
    Book book11 = new Book("Microsoft Reporting Services in Action", "Teo Lachev", "1932394222", 5);
    
    /* EBook objects: */
    EBook ebook1 = new EBook("Coffeehouse", "Levi Asher", "1884777384", 12, "pdf", 500.23);
    EBook ebook2 = new EBook("PFC Programmer's Reference Manual", "Richard Brooks", "1884777554", 5,"epub", 258.12);
    EBook ebook3 = new EBook("Mobile Agents", "William R. Cockayne", "1884777368",  2, "pdf", 167.5);
    EBook ebook4 = new EBook("POJOs in Action", "Chris Richardson", "1932394583", 7, "mobi", 341.2);
    EBook ebook5 = new EBook("Essential Guide to Peoplesoft Development and Customization", "Tony DeLia", "1884777929", 10, "pdf", 800);
    
    /* Library object: */
    Library lib = new Library(
      asList(book1, book2, book3, book4, book5, book6, book7, book8, book9, book10,
              ebook1, ebook2, ebook3, ebook4, ebook5),
      asList(member1, member2, member3, member4,
              pMember1, pMember2, pMember3));
    
    System.out.println(lib.getBooks().toString());
    System.out.println(lib.getMembers().toString());
    
    /* ************ TESTING CODE (UNCOMMENT LINES BELOW TO TEST) ************* */
    
//    /* Test 0 */
//    System.out.println("\nTest 0: Create and populate a Library object.".toUpperCase());
//    System.out.println("Expected output:\nlib.books.toString() -> [Book{...}, ...]\nlib.members.toString() -> [Member{...}, ...]\n");
//    System.out.println("Actual output:");
//    System.out.println(lib.books.toString());
//    System.out.println(lib.members.toString());
//    System.out.println("\n**********\n");
//
//    /* Test 1 */
//    System.out.println("\nTest 1: Add a book to an existing book list.".toUpperCase());
//    System.out.println("Expected output:\nlib.books.size() -> 10\nlib.addBook(book11) -> true\nlib.books.size() -> 11\n");
//    System.out.println("Actual output:");
//    System.out.println(lib.getBooks().size());
//    System.out.println(lib.addBook(book11));
//    System.out.println(lib.getBooks().size());
//    System.out.println("\n**********\n");
//
//    /* Test 1.1 */
//    System.out.println("\nTest 1.1: Prevent book duplicates from being registered.".toUpperCase());
//    System.out.println("Expected output:\nlib.books.size() -> 11\nlib.addBook(book11) -> Book is already registered. | false\nlib.books.size() -> 11\n");
//    System.out.println("Actual output:");
//    System.out.println(lib.getBooks().size());
//    System.out.println(lib.addBook(book11));
//    System.out.println(lib.getBooks().size());
//    System.out.println("\n**********\n");
//
//    /* Test 2 */
//    System.out.println("\nTest 2: Add a member to an existing member list.".toUpperCase());
//    System.out.println("Expected output:\nlib.members.size() -> 4\nlib.registerMember(member5) -> true\nlib.members.size() -> 5\n");
//    System.out.println("Actual output:");
//    System.out.println(lib.getMembers().size());
//    System.out.println(lib.registerMember(member5));
//    System.out.println(lib.getMembers().size());
//    System.out.println("\n**********\n");
//
//    /* Test 2.1 */
//    System.out.println("\nTest 2.1: Prevent member duplicates from being registered.".toUpperCase());
//    System.out.println("Expected output:\nlib.members.size() -> 5\nlib.registerMember(member5) -> Member is already registered. | false\nlib.members.size() -> 5\n");
//    System.out.println("Actual output:");
//    System.out.println(lib.getMembers().size());
//    System.out.println(lib.registerMember(member5));
//    System.out.println(lib.getMembers().size());
//    System.out.println("\n**********\n");
//
//    /* Test 2.2 */
//    System.out.println("\nTest 2.2: Prevent members from borrowing more books than their allowed limit.".toUpperCase());
//    System.out.println("Expected output:\nlib.lendBook(book, member1) * 10 -> true * 10\nlib.lendBook(book1, member1) * 11 -> Member with ID ... may not borrow more than ... books. | false");
//    System.out.println("Actual output:");
//    System.out.println(lib.lendBook(book1, member1));
//    System.out.println(lib.lendBook(book2, member1));
//    System.out.println(lib.lendBook(book3, member1));
//    System.out.println(lib.lendBook(book4, member1));
//    System.out.println(lib.lendBook(book6, member1));
//    System.out.println(lib.lendBook(ebook1, member1));
//    System.out.println(lib.lendBook(ebook2, member1));
//    System.out.println(lib.lendBook(ebook3, member1));
//    System.out.println(lib.lendBook(ebook4, member1));
//    System.out.println(lib.lendBook(book8, member1));
//    System.out.println(lib.lendBook(book9, member1)); //Method should fail, print error message
//    System.out.println("\n**********\n");
//
//
//    /* Test 3 */
//    System.out.println("\nTest 3: Lend a book to a registered member.".toUpperCase());
//    System.out.println("Expected output:\nmember3.borrowedBooks = []\nlib.lendBook(book3, member3) -> true\nmember3.borrowedBooks = [Book{...}]\n");
//    System.out.println("Actual output:");
//    System.out.println(member3.getBorrowedBooks());
//    System.out.println(lib.lendBook(book3, member3));
//    System.out.println(member3.getBorrowedBooks());
//    System.out.println("\n**********\n");
//
//    /* Test 3.1 */
//    System.out.println("\nTest 3.1: Check book availability after lending.".toUpperCase());
//    System.out.println("Expected output:\nbook7.availability = 3\nlib.lendBook(book7, member1) -> true\nbook7.availability = 2\n");
//    System.out.println("Actual output:");
//    System.out.println(book7.getAvailability());
//    System.out.println(lib.lendBook(book7, member1));
//    System.out.println(book7.getAvailability());
//    System.out.println("\n**********\n");
//
//    /* Test 3.2 */
//    System.out.println("\nTest 3.2: Prevent non-members from borrowing books.".toUpperCase());
//    System.out.println("Expected output:\nlib.lendBook(book1, new Member(...)) -> Member with ID ... not found. | false\n");
//    System.out.println("Actual output:");
//    System.out.println(lib.lendBook(book1, new Member("John", "Doe")));
//    System.out.println("\n**********\n");
//
//    /* Test 3.3 */
//    System.out.println("\nTest 3.3: Prevent members from borrowing unregistered books.".toUpperCase());
//    System.out.println("Expected output:\nlib.lendBook(new Book(...), member3) -> Book with ISBN ... not found. | false\n");
//    System.out.println("Actual output:");
//    System.out.println(lib.lendBook(new Book("The Little Prince", "Antoine de Saint-Exupery", "1234567890", 3), member3));
//    System.out.println("\n**********\n");
//
//    /* Test 3.4 */
//    System.out.println("\nTest 3.4: Prevent unavailable books from being lent.".toUpperCase());
//    System.out.println("Expected output:\nbook5.availability = 0\nlib.lendBook(book5, member4) -> Book not available at the moment. | false\nbook5.availability = 0\n");
//    System.out.println("Actual output:");
//    System.out.println(book5.getAvailability());
//    System.out.println(lib.lendBook(book5, member4));
//    System.out.println(book5.getAvailability());
//    System.out.println("\n**********\n");
//
//    /* Test 4 */
//    System.out.println("\nTest 4: Return a book.".toUpperCase());
//    System.out.println("Expected output:\nmember3.burrowedBooks = [Book{...}]\nlib.returnBook(book3, member3) -> true\nmember3.burrowedBooks = []\n");
//    System.out.println("Actual output:");
//    System.out.println(member3.getBorrowedBooks());
//    System.out.println(lib.returnBook(book3, member3));
//    System.out.println(member3.getBorrowedBooks());
//    System.out.println("\n**********\n");
//
//    /* Test 4.1 */
//    System.out.println("\nTest 4.1: Check book availability after return.".toUpperCase());
//    System.out.println("Expected output:\nbook7.availability = 2\nlib.returnBook(book7, member1) -> true\nbook7.availability = 3\n");
//    System.out.println("Actual output:");
//    System.out.println(book7.getAvailability());
//    System.out.println(lib.returnBook(book7, member1));
//    System.out.println(book7.getAvailability());
//    System.out.println("\n**********\n");
//
//    /* Test 4.2 */
//    System.out.println("\nTest 4.2: Prevent non-members from returning books.".toUpperCase());
//    System.out.println("Expected output:\nlib.returnBook(book1, new Member(...)) -> Member with ID ... not found. | false\n");
//    System.out.println("Actual output:");
//    System.out.println(lib.returnBook(book1, new Member("John", "Doe")));
//    System.out.println("\n**********\n");
//
//    /* Test 4.3 */
//    System.out.println("\nTest 4.3: Prevent members from returning unregistered books.".toUpperCase());
//    System.out.println("Expected output:\nlib.returnBook(new Book(...), member3) -> Book with ISBN ... not found. | false\n");
//    System.out.println("Actual output:");
//    System.out.println(lib.returnBook(new Book("The Little Prince", "Antoine de Saint-Exupery", "1234567890", 3), member3));
//    System.out.println("\n**********\n");
//
//    /* Test 4.4 */
//    System.out.println("\nTest 4.4: Prevent members from returning books they haven't borrowed.".toUpperCase());
//    System.out.println("Expected output:\nmember2.borrowedBooks = []\nlib.returnBook(book10, member2) -> Member with ID ... has not borrowed book with ISBN ... . | false\nmember2.borrowedBooks = []\n");
//    System.out.println("Actual output:");
//    System.out.println(member2.getBorrowedBooks().toString());
//    System.out.println(lib.returnBook(book10, member2));
//    System.out.println(member2.getBorrowedBooks().toString());
//    System.out.println("\n**********\n");
//
//    /* Test 5 */
//    System.out.println("\nTest 5: EBooks can be lent and returned.".toUpperCase());
//    System.out.println("Expected output:\nmember2.borrowedBooks = []\nlib.lendBook(ebook3, member2) -> true\nmember2.borrowedBooks = [EBook{...}]\nlib.returnBook(ebook3, member2) -> true\nmember2.borrowedBooks = []\n");
//    System.out.println("Actual output:");
//    System.out.println(member2.getBorrowedBooks().toString());
//    System.out.println(lib.lendBook(ebook3, member2));
//    System.out.println(member2.getBorrowedBooks().toString());
//    System.out.println(lib.returnBook(ebook3, member2));
//    System.out.println(member2.getBorrowedBooks().toString());
//    System.out.println("\n**********\n");
//
//    /* Test 6 */
//    System.out.println("\nTest 6: Premium members can borrow more books than regular members.".toUpperCase());
//    System.out.println("Expected output:\nlib.lendBook(Book e, pMember1) * 11 -> true * 11 (no error messages)\n");
//    System.out.println("Actual output:");
//    System.out.println(lib.lendBook(book1, pMember1));
//    System.out.println(lib.lendBook(book2, pMember1));
//    System.out.println(lib.lendBook(book3, pMember1));
//    System.out.println(lib.lendBook(book4, pMember1));
//    System.out.println(lib.lendBook(book6, pMember1));
//    System.out.println(lib.lendBook(ebook1, pMember1));
//    System.out.println(lib.lendBook(ebook2, pMember1));
//    System.out.println(lib.lendBook(ebook3, pMember1));
//    System.out.println(lib.lendBook(ebook4, pMember1));
//    System.out.println(lib.lendBook(book8, pMember1));
//    System.out.println(lib.lendBook(book9, pMember1)); //Shouldn't print any error messages
//    System.out.println("\n**********\n");
  }//main()
}//LibraryManagementSystem