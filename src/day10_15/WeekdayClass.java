package day10_15;
import java.util.Scanner;

public class WeekdayClass {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("계산할 년, 월, 일을 입력 하세요 : ");
		
		int year = sc.nextInt();
		int month = sc.nextInt();
		int day = sc.nextInt();
		
//		1/1/1일 부터 입력한 년도의 전년도 12/31까지 날짜 계산.
		int sum = (year-1) * 365 + (year - 1) / 4 - (year - 1) / 100 + (year - 1) / 400; // 총 날수 + 윤년의 날수 
		
//		전년도 12/31 까지 지난 날짜수에 올해 전 달 까지 지난 날짜 더한다.
		int[] m = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		m[1] = year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ? 29 : 28;
		for (int i = 1; i < month ; i++) {
			/*
			switch (i) {
			case 2:
				sum += year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ? 29 : 28;
				break;
			case 4: case 6: case 9: case 11:
				sum += 30;
				break;
			default:
				sum += 31;
			}
			*/
			sum += m[i-1];
		}	
		
//		전 달 까지 지난 날수에 일을 더한다.
		sum += day;
		/*
		switch (sum % 7) {
		case 0: System.out.println("일요일"); break;
		case 1: System.out.println("월요일"); break;
		case 2: System.out.println("화요일"); break;
		case 3: System.out.println("수요일"); break;
		case 4: System.out.println("목요일"); break;
		case 5: System.out.println("금요일"); break;
		case 6: System.out.println("토요일"); break;
		}
		*/
		
//		배열을 선언할 때 new를 사용하지 않고 {}안에 초기치를 지정하면
//		초기치의 개수만큼 자동으로 배열을 만들고 초기치로 초기화.
//		String[] week = {"월", "화", "수", "목", "금", "토", "일"};
		char[] week = {'월', '화', '수', '목', '금', '토', '일'};
		System.out.println(week[sum % 7] + "요일");
		
		
	} 
}
