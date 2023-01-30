package day10_15;

public class WhileTest1 {
	public static void main(String[] args) {
		
//		while의 최초 진입 조건이 거짓이면 {} 블록을 한번도 실행 안한다.
//		while 
		int sum = 0, i = 0;
		while (i > 100) {
			sum += ++i;
		}
		System.out.println("1~100의 합 : " + sum);
		
//		while의 최초 진입 조건이 거짓이더라도 {} 블록을 한번은 실행한다.
//		do while 차이
		sum = i = 0; // 변수를 선언할 때는 사용x.
		do {
			sum += ++i;
		} while (i > 100);
		System.out.println("1~100의 합 : " + sum);
	}
}
