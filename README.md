# Assignment: OOP-Based Java Application

The following project contains a Java-run
library management system as a part of
the "OOP-Based Java Application"
assignment, which can be found in the
`com.cognizant` package.

The application, which is able to manage
books, members, and borrowing transactions,
complies with the following requirements:

### Classes and Objects
* A class `Book` is created with attributes `title`, `author`, `ISBN`, and `availability`.
* A class `Member` is created with attributes `name`, `memberId`, `bookLimit`, and `borrowedBooks`.
* A class `Library` is created with a collection of `books` and `members` and defines the `addBook()`, `registerMember()`, `lendBook()`, and `returnBook()` methods. It also implements additional search methods like `findBook()` and `findMember()`.

### Inheritance
* A subclass `EBook` that extends `Book` is created with additional attributes `fileFormat` and `fileSize`.
* A subclass `PremiumMember` that extends `Member` is created with a higher `bookLimit` value than regular users.

### Polymorphism
* Method overriding is implemented on `EBook` and `PremiumMember` classes.
* Polymorphism is implemented to process borrowing transactions for both `Member` and `PremiumMember`.

### Encapsulation
* All attributes are `private` and provide public getter and setter methods.
* Validation is implemented in setter methods to ensure data integrity.

### Sample Output
* A main class `LibraryManagementSystem` with a `main()` method is created to demonstrate the application's functionality.
* Methods are implemented to:
  * Add new books and ebooks to the library.
  * Register new members.
  * Borrow books for members.
  * Display the list of available books.
  * Display the list of registered members.
