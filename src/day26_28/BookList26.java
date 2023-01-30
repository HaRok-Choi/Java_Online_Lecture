package day26_28;

import java.util.Arrays;
//  ★★★★★★★★★★
//  여러 권의 책 정보(BookVO)를 기억할 클래스
public class BookList26 {

	private BookVO26[] bookList; 		// 책 정보를 기억할 배열을 선언만 한 상태
	private int size; 				// 배열의 크기
	private int count; 				// 배열의 첨자, 배열에 저장된 데이터의 개수

//	기본 생성자가 실행되면 30권의 책을 저장할 수 있는 배열을 만들고 배열의 크기를 넘겨받는 생성자가 실행되면 넘겨받은 크기만큼 배열을 만든다.
	public BookList26() {	
		this(30);
	}

	public BookList26(int size) {
		this.size = size;
		bookList = new BookVO26[size];
	}

	public BookVO26[] getBookList() {
		return bookList;
	}

	public void setBookList(BookVO26[] bookList) {
		this.bookList = bookList;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return "BookList [bookList=" + Arrays.toString(bookList) + "]";
	}

//	bookList에 BookVO 클래스 객체를 저장하는 메소드
	public void addBook(BookVO26 book) {
		bookList[count++] = book;
	}
	
	
	
}
