package com.cognizant;

public class PremiumMember extends Member {
  int bookLimit = 30;
  
  public PremiumMember(String name, String lastName) {
    super(name, lastName);
  }
  
  @Override
  public int getBookLimit() {
    return bookLimit;
  }
  
  @Override
  public String toString() {
    return "Member{" +
            "name='" + super.getName() + '\'' +
            ", lastName='" + super.getLastName() + '\'' +
            ", memberId='" + super.getMemberId() + '\'' +
            ", borrowedBooks=" + super.getBorrowedBooks().toString() +
            ", bookLimit=" + bookLimit +
            '}';
  }
}
