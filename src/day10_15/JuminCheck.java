package day10_15;
import java.util.Scanner;

public class JuminCheck {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("주민번호를 입력해주세요 : ");
		String jumin = sc.nextLine();
		
//		i :				0		1		2		3		4		5		6		7		8		9		10		11		12
//		i % 8 :			0		1		2		3		4		5		6		7		0		1		2		3	
//		주민번호 : 		9		8		1		0		0		2		1		8		5		3		1		2		3
//							*		*		*		*		*		*		*		*		*		*		*		*		
//		가중치 :			2		3		4		5		6		7		8		9		2		3		4		5
//						=		=		=		=		=		=		=		=		=		=		=		=
//						18	 +	24	 +	4	+	0	+	0	+	14	 +	8	+	72	 +	10	 +	9 	+	4	+	10	=	173
//		173 % 11 = 8			11 - 8 = 3		
//		11에서 나머지를 뺀 결과가 2자리 숫자면 10자리는 버리고 1자리만 취한다.							  					  	

		
		String check = "234567892345";
		int sum = 0;
		for (int i = 0; i <= 11; i++) {
//			문자를 곱셈 연산하면 문자의 유니코드 값으로 곱한다.
//			sum += (jumin.charAt(i) - 48) * (check.charAt(i) - 48);
//			sum += (jumin.charAt(i) - 48) * (i>=8 ? i-6 : i+2);
			sum += (jumin.charAt(i) - 48) * (i % 8 + 2);	// (입력한 주민번호 * 가중치)
		}
		
		int result = (11 - sum % 11) % 10;
		if (result == jumin.charAt(12) - 48) {
			System.out.println("정상");
		} else {
			System.out.println("오류");
		}
	}
}
