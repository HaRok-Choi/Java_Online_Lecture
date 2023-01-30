package day05_06;
import java.util.Scanner;

public class IfTest1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("3과목 점수를 입력하세요 : ");
//		System.out.print("java의 점수 : ");
		int java = sc.nextInt();
//		System.out.print("jsp의 점수 : ");
		int jsp = sc.nextInt();
//		System.out.print("js의 점수 : ");
		int js = sc.nextInt();
		
		int tot = java + jsp + js;
		double avg = (double)tot / 3;
//		System.out.println("총점 : " + tot);
//		System.out.println("평균 : " + avg);
		
		System.out.printf("평균 점수 : %6.3f\n", avg);
		
		if (avg >= 90) {
			System.out.println("A");
		} else if (avg >=80) {
			System.out.println("B");
		} else if (avg >=70) {
			System.out.println("C");
		} else if (avg >=60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
		
		
		
	}
}
