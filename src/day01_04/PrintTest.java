package day01_04;

public class PrintTest {
	public static void main(String[] args) {
//		서식 없는 출력
//		print(): 출력 후 줄을 바꾸지 x, println(): 출력 후 줄 바꿈		
		System.out.print("안녕 \n자바");
		System.out.println();
		System.out.println("안녕 자바");
		
		
//		"+" 연산자는 "+" 연산자의 양쪽에 모두 숫자가 
//		나올 경우 덧셈을 하고 한 쪽이라도 문자열이 나오면 
//		문자열을 연결하는 '연결 연산자'로 사용된다. 
		System.out.println("5 + 3 = " + (5 + 3));
		System.out.println("5 - 3 = " + (5 - 3));
		System.out.println("5 * 3 = " + 5 * 3);
		System.out.println("5 / 3 = " + 5 / 3);
//		정수와 정수의 연산은 결과도 정수. 묵시적 형변환
		System.out.println("5 % 3 = " + 5 % 3);
		
		
//		묵시적 형변환
//		: 자료형의 크기가 서로 다른 자료의 연산 결과는 크기가
//		큰 자료형으로 자동 변환된다.
//		boolean : 1바이트(8비트), true or false 기억.
//		char : 2바이트, 1문자 기억.
//		short : 2바이트, -32768 ~ 32768 사이의 정수 기억.
//		int : 4바이트, -2147483648 ~ 2147483648 사이의 정수 기억. 
//		long : 8바이트, -2의 63승 ~ 2의 63승 - 1 사이의 정수 기억.
//		float : 4바이트, 단정도 실수, 소수점 아래로 6자리 정도 표현.
//		double : 8바이트, 배정도 실수, 소수점 아래로 16자리 정도 표현.
		System.out.println("5 / 3. = " + 5 / 3.);
		System.out.println("5. / 3 = " + 5. / 3);
		System.out.println("A + 32 = " + ('A' + 32));
		System.out.println("A - 32 = " + ('a' - 32));
		
		
//		명시적 형변환 : 프로그래머가 그 순간의 자료형을 변경 할 수 있다.
		System.out.println("5 / (double)3 = " + 5 / (double)3);
		System.out.println("A + 32 = " + (char)('A' + 32));
		System.out.println("A - 32 = " + (char)('a' - 32));
		
		
//		서식 있는 출력(printf() => c언어의 printf 사용법과 같음)
//		printf("출력서식", 출력할 내용);
//		출력 서식은 출력 서식문자를 제외한 나머지 문자는 입력한 그대로 출력
//		출력 서식 문자 : d(정수), f(실수), c(문자), s(문자열)
//		출력 서식의 형식 : %[-][0][n][.m]
//		- : 출력할 전체 자리수가 지정된 경우 왼쪽에 맞춰 출력한다.		
//		0 : 출력할 전체 자리수가 지정된 경우 왼쪽의 남는 자리에 0을 채워 출력
//		n : 출력할 전체 자리수
//		.m : 소수점 아래 자리수, 잘리는 자리에서 반올림. 기존 데이터 변경x
		
		System.out.printf("5 + 3 = %d\n", 5 + 3);
		System.out.printf("%d + %d = %d\n", 5, 3, 5 + 3);
		System.out.printf("5 / 3. = %f\n", 5 / 3.);
		
		 
	}
}
