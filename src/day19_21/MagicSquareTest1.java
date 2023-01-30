package day19_21;
import java.util.Scanner;

public class MagicSquareTest1 {
	public static void main(String[] args) {
//		2차원 배열 예제3 ★★★★★

		Scanner sc = new Scanner(System.in);
		
		int n;
		while (true) {
			System.out.print("배열의 차수를 홀수로 입력하세요.(짝수x) : ");
			n = sc.nextInt();
			if (n % 2 == 1) {
				break;
			}
			System.out.println("홀수를 입력하지않아서 다시 돌아갑니다.\n");
		}

		
		int[][] num = new int[n][n];
		int i = 0, j = (n-1) / 2;	

		for (int k = 1; k <= Math.pow(n, 2); k++) {

			num[i][j] = k;
			if (k % n== 0) {
				i++;
			} else {
				if (--i < 0) {
					i = n-1;
				}
				if (++j > n-1) {
					j = 0;
				}
			}
		}

		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				System.out.printf("%3d ", num[i][j]);
			}
			System.out.println();
		}
	}
}
