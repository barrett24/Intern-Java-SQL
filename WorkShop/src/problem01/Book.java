package problem01;

public class Book {
	private String bookName;
	private int bookPrice;
	private double bookDiscountRate;
	
	public Book() {
		
	}
	
	public Book(String bookname, int bookPrice, double bookDiscountRate) {
		this.bookName = bookname;
		this.bookPrice = bookPrice;
		this.bookDiscountRate = bookDiscountRate;
	}
	
	public double getDiscountBookPrice() {
		return (double)(bookPrice - (bookPrice*bookDiscountRate) / (100));
	}
	
	public int getBookPrice() {
		return bookPrice;
	}
	
	public String getBookName() {
		return bookName;
	}
	
	public double getRate() {
		return bookDiscountRate;
	}
}
