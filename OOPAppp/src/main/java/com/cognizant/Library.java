package com.cognizant;

import java.util.ArrayList;
import java.util.List;

public class Library {
  List<Book> books;
  List<Member> members;
  
  public Library(List<Book> books, List<Member> members) {
    this.books = books!=null? new ArrayList<>(books) : new ArrayList<>();
    this.members = members!=null? new ArrayList<>(members): new ArrayList<>();
  }//Library() - constructor
  
  /* Getters & Setters: */
  public List<Book> getBooks() {
    return books;
  }//getBooks()
  
  public List<Member> getMembers() {
    return members;
  }//getMembers()
  
  public boolean addBook(Book book) {
    if (findBook(book.getISBN())==null) {
      books.add(book);
      return true;
    }
    System.out.println("Book is already registered.");
    return false;
  }
  
  public boolean registerMember(Member member) {
    if(findMember(member.getName(), member.getLastName())==null) {
      members.add(member);
      return true;
    }
    System.out.println("Member is already registered.");
    return false;
  }
  public boolean lendBook(Book book, Member member) {
    Book registeredBook = findBook(book);
    Member registeredMember = findMember(member);
    if (registeredBook!=null) {//Checks if book exists in library
      if (registeredMember!=null) {//checks if member exists in library
        if (registeredBook.getAvailability()>0) {//Checks if book is available
          if (registeredMember.getBorrowedBooks().size()<registeredMember.getBookLimit()) {//Checks if member has exceeded borrowing limit
            registeredMember.getBorrowedBooks().add(registeredBook);
            if (!(registeredBook instanceof EBook)) books.get(books.indexOf(registeredBook)).setAvailability(books.get(books.indexOf(registeredBook)).getAvailability()-1);
            return true;
          }
          System.out.println("Member with ID " + registeredMember.getMemberId() + " may not borrow more than " + registeredMember.getBookLimit() + " books.");
          return false;
        }
        System.out.println("Book not available at the moment.");
        return false;
      }
      System.out.println("Member with ID " + member.getMemberId() + " not found.");
      return false;
    }
    System.out.println("Book with ISBN " + book.getISBN() + " not found.");
    return false;
  }
  
  public boolean returnBook(Book book, Member member) {
    {
      Book registeredBook = findBook(book);
      Member registeredMember = findMember(member);
      if (registeredBook!=null) {//Checks if book exists in library
        if (registeredMember!=null) {//checks if member exists in library
          if (registeredMember.findBook(registeredBook)!=null) {//Checks if book is in member's borrowed book list
            registeredMember.getBorrowedBooks().remove(registeredBook);
            books.get(books.indexOf(registeredBook)).setAvailability(books.get(books.indexOf(registeredBook)).getAvailability()+1);
            return true;
          }
          System.out.println("Member with ID " + registeredMember.getMemberId() + " has not borrowed book with ISBN " + registeredBook.getISBN() + ".");
          return false;
        }
        System.out.println("Member with ID " + member.getMemberId() + " not found.");
        return false;
      }
      System.out.println("Book with ISBN " + book.getISBN() + " not found.");
      return false;
    }
  }
  
  /* Private methods: */
  public Book findBook(String isbn){
    for(Book book : books) {
      if(book.getISBN().equals(isbn)) {
        return book;
      }
    }
    return null;
  }
  public Book findBook(Book book){
    int idx = books.indexOf(book);
    return idx!=-1? books.get(idx) : null;
  }
  
  public Member findMember(String memberId){
    for(Member member : members) {
      if(member.getMemberId().equals(memberId)) {
        return member;
      }
    }
    return null;
  }
  
  public Member findMember(String name, String lastName){
    for(Member member : members) {
      if(member.getName().equals(name) && member.getLastName().equals(lastName)) {
        return member;
      }
    }
    return null;
  }
  
  public Member findMember(Member member){
    int idx = members.indexOf(member);
    return idx!=-1? members.get(idx) : null;
  }
  
}//Library
