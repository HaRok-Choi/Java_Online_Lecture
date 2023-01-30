package day05_06;
import java.util.Scanner;

public class Iftest2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("윤년/평년을 판별할 년도 입력 : ");
		int year = sc.nextInt();
		
//		프로그램에서 여러번 사용되는 값은 변수에 저장시켜 사용하면 편리.
//		논리값을 기억하는 변수나 논리값을 리턴하는 메소드의 이름은 "is"로 시작하는 것이 관행.
		boolean isLeapYear = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
		
//		년도가 4로 나눠 떨어지고 100으로 나눠 떨어지지 않거나
//		400으로 나눠 떨어지면 윤년, 그렇지 않으면 평년
		
		if (isLeapYear) {
			System.out.println(year + "년은 윤년입니다.");
		} else {
			System.out.println(year + "년은 평년입니다.");
		}
		
//		삼항 연산자(?:)
//		if의 조건을 비교한 결과 조건이 참 일때와 거짓일때 실행항 문장이 
//		각각 1문장인 경우 사용하면 편리하다.
//		조건식 ? 조건식이 참일 경우 실행할 내용 : 거짓일 경우 실행
		System.out.println(year + "년은" + (isLeapYear ? "윤" : "평") + "년입니다.");
		
		sc.close();
		
	}
}
