package com.cognizant;

public class Book {
  private String title;
  private String author;
  private String ISBN;
  private int availability;
  
  public Book(String title, String author, String ISBN, int availability) {
    this.title = title;
    this.author = author;
    this.ISBN = ISBN;
    this.availability = availability;
  }//Book() - constructor
  
  public String getTitle() {
    return title;
  }//getTitle()
  
  public void setTitle(String title) {
    if (!title.isBlank()) this.title = title;
  }//setTitle()
  
  public int getAvailability() {
    return availability;
  }//getAvailability()
  
  public void setAvailability(int availability) {
    if(availability>0) this.availability = availability;
  }//getAvailability()
  
  public String getISBN() {
    return ISBN;
  }//getISBN() - No setters implemented for id fields
  
  public String getAuthor() {
    return author;
  }//getAuthor()
  
  public void setAuthor(String author) {
    if (!author.isBlank()) this.author = author;
  }//setAuthor()
  
  @Override
  public String toString() {
    return "Book{" +
            "title='" + title + '\'' +
            ", author='" + author + '\'' +
            ", ISBN='" + ISBN + '\'' +
            ", availability=" + availability +
            '}';
  }
}
