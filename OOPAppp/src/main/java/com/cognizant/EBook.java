package com.cognizant;

public class EBook extends Book {
  String fileFormat;
  double fileSize;
  public EBook(String title, String author, String ISBN, int availability, String fileFormat, double fileSize) {
    super(title, author, ISBN, availability);
    this.fileFormat = fileFormat;
    this.fileSize = fileSize;
  }
  
  @Override
  public int getAvailability() {
    return super.getAvailability();
  }
  
  @Override
  public String toString() {
    return "EBook{" +
            "title='" + super.getTitle() + "'" +
            ", author='" + super.getAuthor() + "'" +
            ", ISBN='" + super.getISBN() + "'" +
            ", availability='" + super.getAvailability() + "'" +
            ", fileFormat='" + fileFormat + "'" +
            ", fileSize=" + fileSize +
            '}';
  }
}
