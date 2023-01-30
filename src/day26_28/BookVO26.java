package day26_28;

import java.text.SimpleDateFormat;
import java.util.Date;
// 	★★★★★★★★★★
// 	책 한 권의 정보를 기억하는 클래스
public class BookVO26 {

	private String title; // 도서명
	private String author; // 저자
	private String publisher; // 출판사명
	private Date date; // 출판일
	private double price; // 가격

	public BookVO26() { }
	public BookVO26(String title, String author, String publisher, Date date, double price) {
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		
		date.setYear(date.getYear()-1900);
		date.setMonth(date.getMonth()-1);
		this.date = date;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd(E)");
		return String.format("%s %s %s %s %.2f", title, author, publisher, sdf.format(date), price);
	}
}
