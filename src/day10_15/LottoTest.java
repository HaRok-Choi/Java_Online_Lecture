package day10_15;
import java.util.Random;

public class LottoTest {
	public static void main(String[] args) {
		
//		공 섞기 전
		int[] lotto = new int[45];
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = i + 1;
			System.out.printf("%2d ", lotto[i]);
			if ((i +1) % 10 == 0) {
				System.out.println();
			}
		}
		System.out.println("\n====== 섞기 전 ======");
		
//		공 섞는 과정★★
//		lotto[0]에 저장된 값과 lotto[1]~[44] 사이의 랜덤한 위치의 값을 교환.
		Random ran = new Random();
		for (int i = 0; i < 1000000; i++) {
			int r = ran.nextInt(44) + 1;
//			0도 포함 될 수 있기 때문에 45를 쓰지 않고, +1을 적는다.
			
//			두 기억장소의 값을 바꿔준다.
			int temp = lotto[0];
			lotto[0] = lotto[r];
			lotto[r] = temp;
		}
		for (int i = 0; i < lotto.length; i++) {
			System.out.printf("%2d ", lotto[i]);
			if ((i +1) % 10 == 0) {
				System.out.println();
			}			
		}
		System.out.println("\n====== 섞은 후 ======");
		
		System.out.println("1등 추첨 번호");
		for (int i = 0; i < 6; i++) {
			 System.out.printf("%2d ", lotto[i]);
			 
//			 sleep(): 괄호 안에 지정된 시간(단위ms)만큼 프로그램 잠깐 멈춘다.
			 try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("\n보너스 번호 : " + lotto[6]);
		
		/*
		int[] num = new int[6];
		Random ran = new Random();
		for (int i = 0; i < num.length; i++) {
			System.out.println(ran.nextInt(45));
		}
		*/
	}
}
