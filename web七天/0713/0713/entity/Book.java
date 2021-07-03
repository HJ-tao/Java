package edu.cj.javase.day0713.entity;

public class Book {
   private int buyId;
   private String taxNo;
   private int bookId;
   private float bookPrice;
   private float bookDiscount;
   private float truePrice;
   private int bookMount;
   private float bookMoney;
public int getBuyId() {
	return buyId;
}
public void setBuyId(int buyId) {
	this.buyId = buyId;
}
public String getTaxNo() {
	return taxNo;
}
public void setTaxNo(String taxNo) {
	this.taxNo = taxNo;
}
public int getBookId() {
	return bookId;
}
public void setBookId(int bookId) {
	this.bookId = bookId;
}
public float getBookPrice() {
	return bookPrice;
}
public void setBookPrice(float bookPrice) {
	this.bookPrice = bookPrice;
}
public float getBookDiscount() {
	return bookDiscount;
}
public void setBookDiscount(float bookDiscount) {
	this.bookDiscount = bookDiscount;
}
public float getTruePrice() {
	return truePrice;
}
public void setTruePrice(float truePrice) {
	this.truePrice = truePrice;
}
public int getBookMount() {
	return bookMount;
}
public void setBookMount(int bookMount) {
	this.bookMount = bookMount;
}
public float getBookMoney() {
	return bookMoney;
}
public void setBookMoney(float bookMoney) {
	this.bookMoney = bookMoney;
}
@Override
public String toString() {
	return "Book [buyId=" + buyId + ", taxNo=" + taxNo + ", bookId=" + bookId
			+ ", bookPrice=" + bookPrice + ", bookDiscount=" + bookDiscount
			+ ", truePrice=" + truePrice + ", bookMount=" + bookMount
			+ ", bookMoney=" + bookMoney + "]";
}
public Book() {
	super();
	// TODO Auto-generated constructor stub
}
public Book(int buyId, String taxNo, int bookId, float bookPrice,
		float bookDiscount, float truePrice, int bookMount, float bookMoney) {
	super();
	this.buyId = buyId;
	this.taxNo = taxNo;
	this.bookId = bookId;
	this.bookPrice = bookPrice;
	this.bookDiscount = bookDiscount;
	this.truePrice = truePrice;
	this.bookMount = bookMount;
	this.bookMoney = bookMoney;
}
   
   
  
   
}
