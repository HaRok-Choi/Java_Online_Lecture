package day26_28;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
//  ★★★★★★★★★★
//  여러 권의 책 정보(BookVO)를 기억할 클래스
public class BookList {

	private ArrayList<BookVO> bookList = new ArrayList<>(); 	// 여러 권의 책 정보를 기억할 ArrayList
	
	public ArrayList<BookVO> getBookList() {
		return bookList;
	}

	public void setBookList(ArrayList<BookVO> bookList) {
		this.bookList = bookList;
	}

	@Override
	public String toString() {
		String str = "";
		str += "===================================\n";
		str += " 도서명 저자명 출판사명 출판일 가격 \n";
		str += "===================================\n";
		
		double total = 0.0;
		
//		ArrayList에 저장된 데이터의 개수 만큼 반복한다.
/*		for (int i = 0; i < bookList.size(); i++) {
			str += bookList.get(i) + "\n";
			total += bookList.get(i).getPrice();
		} */
		
//		향상된 for : 배열이나 ArrayList에 저장된 내용을 0번째 값부터 마지막 값까지 전체를 처리할 때 사용하면 효과적이다.
//		for(배열이나 ArrayList의 자료형 변수명 : 배열이나 ArrayList 이름)
		for (BookVO BO : bookList) {
			str += BO + "\n";
			total += BO.getPrice();
		}
		
		str += "===================================\n";
		DecimalFormat df = new DecimalFormat("￦#,##0원");
		str += " 합계 금액 : " + df.format(total) + "\n";
		str += "===================================\n";
			
		return str;
	}

//	bookList에 BookVO 클래스 객체를 저장하는 메소드
	public void addBook(BookVO book) {
		bookList.add(book);
	}
}
