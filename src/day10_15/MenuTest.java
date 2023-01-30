package day10_15;
import java.util.Scanner;

public class MenuTest {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		
		int num = 0;
		System.out.println();
		while (num != 5) {
			do {
				System.out.println("===================");
				System.out.println("1.저장 2.보기 3.수정 4.삭제 5.종료");
				System.out.println("===================");
				System.out.print("원하는 번호를 선택하세요 : ");
				num = sc.nextInt();			
			} while (num < 1 || num >5);
			
	//		여기에 왔다는 것은 메뉴가 1~5사이의 숫자가 입력되었다는 것.
			switch (num) {
				case 1: System.out.println("입력"); break;
				case 2: System.out.println("보기"); break;
				case 3: System.out.println("수정"); break;
				case 4: System.out.println("삭제"); break;
				/*
				case 5: 
					System.out.println("종료");
					System.exit(0);		
					// 프로그램을 강제로 종료하는 메소드.
					// 권장하는 방법은 아니다.
					break;
				*/	
			}
		}
		System.out.println("종료");
		sc.close();
	}
}
