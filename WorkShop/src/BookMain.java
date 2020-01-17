
import java.util.ArrayList;

import problem01.Book;

public class BookMain {

	public static void main(String[] args) {
		ArrayList<Book> studentAry = new ArrayList<Book>();
		
		Book stu01 = new Book("SQL", 50000, 5.0);
		studentAry.add(stu01);
		Book stu02 = new Book("Java", 40000, 3.0);
		studentAry.add(stu02);
		Book stu03 = new Book("JSP", 60000, 6.0);
		studentAry.add(stu03);
		
		for (Book b : studentAry) {
			System.out.print(b.getBookName());
			System.out.print(" 가격: " + b.getBookPrice());
			System.out.print(" 할인율: " + b.getRate());
			System.out.print(" 할인 후 금액: " + b.getDiscountBookPrice());
			System.out.println();
		}

	}

}
