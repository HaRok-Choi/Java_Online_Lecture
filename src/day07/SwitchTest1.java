package day07;
import java.util.Scanner;

public class SwitchTest1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("3과목 점수를 입력하세요 : ");
		int java = sc.nextInt();
		int jsp = sc.nextInt();
		int js = sc.nextInt();
		
		int tot = java + jsp + js;
		double avg = (double)tot / 3;

//		key 값은 '정수'를 기억하는 변수 or 연산 결과가 '정수'인 수식,
//		자바 1.7부터는 문자열도 가능.
//		break : if문을 제외한 나머지 제어문의 {}를 탈출.
		
//		같은 작업을 하는 case는 나열할 수 있다.
		switch ((int)avg / 10) {
		case 10:
			System.out.println("A");
			break;
		case 9:
			System.out.println("B");
			break;
		case 8:
			System.out.println("C");
			break;
		case 7:
			System.out.println("D");
			break;
		default:
			System.out.println("F");
		}
		
	}
}
