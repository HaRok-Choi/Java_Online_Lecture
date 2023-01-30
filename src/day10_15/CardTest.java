package day10_15;
import java.util.Random;

public class CardTest {
	public static void main(String[] args) {
		
//		ㅁㅈㅇㄹ 특수문자 많이 쓰임
		
		String[] num = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
		char[] sym = {'♠', '◇', '♥', '♧'};
//		String[] sym = {"♠", "◇", "♥", "♧"};
		
		int[] card = new int[52];
		for (int i = 0; i < card.length; i++) {
			card[i] = i;
//			System.out.printf("%2s ", num[card[i] % 13]);
			System.out.printf("%c%2s   ", sym[card[i] / 13], num[card[i] % 13]);		
			if ((i + 1) % 13 == 0) {
				System.out.println();
			}
		}
		System.out.println("========== 섞기 전 ==========");
		
		Random ran = new Random();
		for (int i = 0; i < 10000; i++) {
			int r = ran.nextInt(51) + 1;
//			0도 포함 될 수 있기 때문에 51를 쓰지 않고, +1을 적는다.
			int temp = card[0];
			card[0] = card[r];
			card[r] = temp;
		}
		for (int i = 0; i < card.length; i++) {
			System.out.printf("%c%2s   ", sym[card[i] / 13], num[card[i] % 13]);
			if ((i + 1) % 13 == 0) {
				System.out.println();
			}
		}
		System.out.println("========== 섞은 후 ==========");
	}
}
