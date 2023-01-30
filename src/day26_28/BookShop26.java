package day26_28;

import java.util.Date;
//  ★★★★★★★★★★
public class BookShop26 {
	public static void main(String[] args) {
		
		BookList26 bookList = new BookList26(5);
		
//		Date date = new Date();				// 현재 컴퓨터 시스템의 날짜와 시간을 얻어온다.
//		Date date = new Date(년, 월, 일);		// 입력한 년, 월, 일에 해당되는 날짜를 만든다.
//		날짜를 만들거나 입력하는 경우 Date 클래스는 1900년을 기준으로 처리하므로 년은 1900을 빼서 입력한다.
//		월을 입력할 때는 1을 빼서 입력해야 정상적으로 처리된다.
		BookVO26 bo1 = new BookVO26("자바", "홍길동", "코리아", new Date(2015, 5, 15), 35000);
		BookVO26 bo2 = new BookVO26("자바", "홍길자", "코리아", new Date(2015, 5, 15), 35000);
		BookVO26 bo3 = new BookVO26("자바", "홍길숙", "코리아", new Date(2015, 5, 15), 35000);
		BookVO26 bo4 = new BookVO26("자바", "홍길희", "코리아", new Date(2015, 5, 15), 35000);
		BookVO26 bo5 = new BookVO26("자바", "홍길영", "코리아", new Date(2015, 5, 15), 35000);
		bookList.addBook(bo1);
		bookList.addBook(bo2);
		bookList.addBook(bo3);
		bookList.addBook(bo4);
		bookList.addBook(bo5);
		
		System.out.println(bookList);
		
	}
}
