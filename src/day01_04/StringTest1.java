package day01_04;

public class StringTest1 {
	public static void main(String[] args) {
		
//		클래스로 만드는 모든 객체(변수)는 주소를 기억하는 참조형 변수.
//		문자열이 최초로 만들어지면 메모리 어딘가에 문자열이 생성되고,
//		문자열이 생성된 주소값이 변수에 저장.
		String str1 = "AAA";	// str1에는 "AAA"가 생성된 메모리의 주소가 저장
//		메모리에 같은 내용의 문자열이 있으면 다시 만들지 않고 기존에 있는
//		문자열의 주소값이 변수에 저장.
		String str2 = "AAA";	// str2에는 str1에 저장된 "AAA"가 생성된 메모리의 주소가 저장.
		
//		==를 사용해서 같은가 비교 할 수 있는 데이터는 기본 자료형과 NULL만 가능.
		
//		관계 연산자 : 연산 결과는 true or false 둘 중 하나.
//		논리 연산자 : &&(곱), ||(합), !(부정)
		
//		"=="을 사용해서 비교했으므로 변수에 저장된 문자열 자체를 비교x,
//		변수에 저장된 주소를 비교하게 된다.
		if (str1 == str2) {
			System.out.println("같다");
		} else {
			System.out.println("다르다.");
		}
		
//		new라는 예약어를 사용해서 객체를 생성하게 되면 메모리에 같은 
//		내용이 있나 상관하지 않고 무조건 다시 만든다.
		String str3 = new String("AAA");  //<=원래는 이 방식이다.
		
//		문자열을 비교하려 하는 경우 반드시 equals() 메소드를 사용해서 비교.
		if (str1.equals(str3)) {
			System.out.println("같다");
		} else {
			System.out.println("다르다.");
		}
	}
}