package day08_09;
import java.util.Random;

public class RandomTest {
	public static void main(String[] args) {
		
//		구버전
		for (int i = 1; i <= 10; i++) {
			System.out.println((int)(Math.random() * 6) + 1);			
		}
		System.out.println("===========");
		
//		신버전
		Random ran = new Random();
		for (int i = 1; i <= 6; i++) {
			System.out.println(ran.nextInt(45) + 1);
		}		
	}
}
