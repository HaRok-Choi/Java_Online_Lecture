package day01_04;
import java.util.Scanner;

public class ScannerTest2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int age = 0;
		System.out.print("나이를 입력하세요 : ");
		age = sc.nextInt();
		
//		'문자열을 제외한 데이터'를 입력받은 후 nextLine() 메소드가
//		실행이 돼야 한다면 키보드 버퍼의 엔터키를 읽는 문제 발생.
		
//		키보드 버퍼를 비워주는 동작을 실행 후 nextLine() 메소드 실행
		
		sc.nextLine();				// 키보드 버퍼를 지움.
		
		String name = "";
		System.out.print("이름을 입력하세요 : ");
		name = sc.nextLine();
		
		System.out.println(name + "의 나이는 " + age + "입니다.");
		
		sc.close();
		
		
	}
}
