package day26_28;

import java.util.Date;
//  ★★★★★★★★★★
public class BookShop {
	public static void main(String[] args) {
		
		BookList bookList = new BookList();
		
		BookVO bo1 = new BookVO("Java", "홍길동", "코리아", new Date(2015, 5, 15), 35000);
		BookVO bo2 = new BookVO("JS", "홍길자", "코리아", new Date(2015, 5, 15), 35000);
		BookVO bo3 = new BookVO("JSP", "홍길숙", "코리아", new Date(2015, 5, 15), 35000);
		BookVO bo4 = new BookVO("JQurey", "홍길희", "코리아", new Date(2015, 5, 15), 35000);
		BookVO bo5 = new BookVO("Spring", "홍길영", "코리아", new Date(2015, 5, 15), 35000);
		BookVO bo6 = new BookVO("node.js", "홍길수", "코리아", new Date(2015, 5, 15), 35000);
		BookVO bo7 = new BookVO("react.js", "홍길수", "코리아", new Date(2015, 5, 15), 35000);
		bookList.addBook(bo1);
		bookList.addBook(bo2);
		bookList.addBook(bo3);
		bookList.addBook(bo4);
		bookList.addBook(bo5);
		bookList.addBook(bo6);
		bookList.addBook(bo7);
		
		System.out.println(bookList);
		
	}
}
