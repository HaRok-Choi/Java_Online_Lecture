package day08_09;
import java.util.Scanner;

public class ForTest1 {
	public static void main(String[] args) {
		
//		반복 횟수가 몇번인지 알 경우 for를 사용한다.
//		for가 실행되는 원리
//		1. 변수에 저장된 값으로 조건식을 실행해서 참이면 반복을 시작.
//		2. {} 블록을 한 번 실행한 후 변수 값을 증감치만큼 변경시키고 조건식을 실행해서 참이면 {} 블록을 반복하고 거짓이면 {}블록 탈출.
		
//		변수를 선언만 하면 변수에 어떤 내용이 저장되어있는지 모르기 때문에 반드시 초기화 해야됨. 
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
//		대입 연산자(연산 순위 가장 늦다.)
			sum += i;
		}
		System.out.println("1~100의 합 : " + sum);
		
//		증감 연산자
		int a = 1, b, c;
		b = a++;
		c = ++a;
		System.out.println("a = " + a + ", b = " + b + ", c  = " + c);
				
//		() 안의 수식 =>
//		산술(*, /, %) => 산술(+, -) => 관계 => 논리 => 대입
//		단항 => 이항 => 삼항 
		
		int d =1, e;
		e = ++d + ++d + ++d + ++d;
		System.out.println("d = " + d + ", e = " + e);
	}
}
