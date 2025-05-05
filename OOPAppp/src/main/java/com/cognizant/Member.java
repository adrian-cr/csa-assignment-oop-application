package com.cognizant;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Member {
  private static int idCounter = 1;
  private String name;
  private String lastName;
  private final String memberId;
  int bookLimit = 10;
  private final List<Book> borrowedBooks;
  
  public Member(String name, String lastName) {
    this.name = name;
    this.lastName = lastName;
    this.memberId = String.format("%08d", idCounter);
    this.borrowedBooks = new ArrayList<>();
    idCounter++;
  }//Member() - constructor
  
  public String getName() {
    return name;
  }//getName()
  
  public void setName(String name) {
    if (!name.isBlank()) this.name = name;
  }//setName()
  
  public String getLastName() {
    return lastName;
  }
  
  public void setLastName(String lastName) {
    if (!lastName.isBlank()) this.lastName = lastName;
  }
  
  public String getMemberId() {
    return memberId;
  }//getMemberId() - No setters implemented for id fields
  
  public int getBookLimit() {
    return bookLimit;
  } //getBookLimit() - No setters implemented for default values
  
  public List<Book> getBorrowedBooks() {
    return borrowedBooks;
  }//getBorrowedBooks() - No setters implemented for List-type fields
  
  public Book findBook(Book book) {
    int idx = borrowedBooks.indexOf(book);
    return idx!=-1? borrowedBooks.get(idx) : null;
  }
  
  @Override
  public String toString() {
    return "Member{" +
            "name='" + name + '\'' +
            ", lastName='" + lastName + '\'' +
            ", memberId='" + memberId + '\'' +
            ", borrowedBooks=" + borrowedBooks.toString() +
            '}';
  }
}//Member
