package day10_15;
import java.util.Random;
import java.util.Scanner;

public class BaseBallGame {
	public static void main(String[] args) {
		
		int[] ball = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		
//		숫자를 섞어주는 과정
		Random ran = new Random();
		for (int i = 0; i < 100000; i++) {
			int r = ran.nextInt(9) + 1;
			int temp = ball[0];
			ball[0] = ball[r];
			ball[r] = temp;
		}
		
		System.out.print("레벨을 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		int level = sc.nextInt();
				
		System.out.print("CPU : ");
		for (int i = 0; i < level; i++) {
			System.out.print(ball[i]);
		}
		System.out.println();
		
		sc.nextLine();
		
//		맞출때까지 반복한다.
		int count = 0;
		
//		currentTimeMillis(): 1990.1.1부터 이 메소드가 실행되는 순간까지 지난 시간을 1/1000초 단위로 얻어옴.
		long start = System.currentTimeMillis();		//자릿수 13자리 그래서 long
		while (true) {
			System.out.print("USER : ");
			String user = sc.nextLine();
			count++;
			
//			스트라이크와 볼의 개수를 센다.
//			스트라이크와 볼의 개수는 반복마다 다시 계산해야 하므로 반복안에서 초기화 시켜야 한다.
			
//			★★★중요★★★
			int  s = 0, b = 0;
			for (int i = 0; i < level; i++) {
				if (ball[i] == user.charAt(i) - 48) {
//				user.charAt(i) => 문자이기 때문에, 문자 '0(아스키: 48)'을 빼던가, 아스키코드 변환 값을 빼줘야 한다.	
					s++;
				}
//				indexOf(): 문자열에서 괄호 안의 문자나 문자열이 최초로 나타나는 위치를 얻어온다. 없으면 -1을 리턴한다.
//				문자열에 특정한 문자 or 문자열이 포함되어 있는가를 알 수 있다.
//				ball[i] + "" => 숫자뒤에 "" 붙이면 문자열이 된다. 
				if (user.indexOf(ball[i] + "") >= 0) { // 없으면 -1이니 0이상으로 해서 볼을 뽑아낸다.
					b++;
				}
			}
		
//			맞췄으면 반복을 탈출한다.
			if (s == level) {
				break;
			} 
			System.out.println(s + " Strike  "+ "/ " + b + " Ball");
		}
		long end = System.currentTimeMillis();	
		System.out.println((end - start) / 1000. + "초 걸려서 " + count + "번만에 맞췄습니다.");		
	}
}
