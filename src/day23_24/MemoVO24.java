package day23_24;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MemoVO24 {
//	★★★★★
//	멤버 변수의 종류는 '정적멤버변수'와 '인스턴스멤버변수'가 있는데 인스턴스멤버변수는 현재 클래스로 생성되는 모든 객체에서 독립된 기억공간을 가지지만 정적멤버변수는 현재 클래스로
//	생성되는 모든 객체에서 공유해서 사용한다.
	public static int count;

//	멤버 변수(클래스 전체에서 사용가능.)
	private int no; // 객체가 생성될 때 마다 자동으로 1씩 증가
	private String name;
	private boolean sex;
	private String memo;
	private Date writeDate; // 객체가 생성되는 순간의 날짜와 시간

	public MemoVO24() {
		this("길동씨", false, "없음");
	}

	public MemoVO24(String name, boolean sex, String memo) { // ()안의 인자는 {} 지역내에서만 쓸 수 있는 '지역변수'이다.
		no = ++count;
		this.name = name;
		this.sex = sex;
		this.memo = memo;
		writeDate = new Date();
	}

//	private 권한으로 설정된 멤버변수는 클래스 외부에서 접근x
//	이 규칙이 너무 엄격히 적용되므로 이 규칙에 대한 예외 지정을 getter & setter 메소드르 사용해서 한다.
//	getter : private 권한을 가지는 멤버 변수의 값을 얻어올 때 사용한다.
//	setter : private 권한을 가지는 멤버 변수의 값을 수정할 때 사용한다.

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isSex() {
		return sex;
	}

	public void setSex(boolean sex) {
		this.sex = sex;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public Date getWriteDate() {
		return writeDate;
	}

	public void setWriteDate(Date writeDate) {
		this.writeDate = writeDate;
	}

	@Override
	public String toString() {
// 		yyyy:연도 / mm:월 / E:요일 / H:시간(24시간제) / h:시간(12시간제) / m,s:분,초 / S:1/1000초 / a:오전,오후 
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd(E)");
		return no + "." + name + "(" + (sex ? "남" : "여") + ")님이 " + sdf.format(writeDate) + "에 남긴말 " + memo;
	}

}
