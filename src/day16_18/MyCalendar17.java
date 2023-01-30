package day16_18;
// 달력을 출력하는 클래스
public class MyCalendar17 {
	public static void main(String[] args) {
		
//		MainClass mc = new MainClass(); => static이 있으면 객체를 생성 안해도 됨.
		System.out.println(MainClass17.isLeapYear(2023) ? "윤년" : "평년");
		System.out.println(MainClass17.lastDay(2024, 2));
		System.out.println(MainClass17.totalDay(2023, 5, 5));
		System.out.println(MainClass17.weekDay(2023, 5, 5));
	}
 	
}
