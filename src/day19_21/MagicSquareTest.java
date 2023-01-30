package day19_21;
//import java.util.Scanner;

public class MagicSquareTest {
	public static void main(String[] args) {
//		2차원 배열 예제3 ★★★★★

//		Scanner sc = new Scanner(System.in);
//		System.out.print("숫자를 입력하세요 : ");
//		int n = sc.nextInt();
//		
		int[][] num = new int[5][5];
//		마방진의 첫번째 숫자(1)가 채워지는 자리는 첫 줄 가운데 열이다.
		int i = 0, j = 2;

//		Math.pow(x, y) : x의 y제곱을 계산한다.
		for (int k = 1; k <= Math.pow(5, 2); k++) {

			num[i][j] = k;
//			방금 배열에 채운 숫자(k)가 5의 배수이면 다음 숫자가 채워질 위치는 행만 1 증가 시킨다.
//			5의 배수가 아니면 다음 숫자가 채워질 위치는 오른쪽, 위 방향(행은 -1, 열은 +1)으로 변경한다. 
			if (k % 5== 0) {
				i++;
			} else {
				if (--i < 0) {
//					행이 배열의 범위를 벗어나면 마지막 행으로 변경.
					i = 4;
				}
				if (++j > 4) {
//					열이 배열의 범위를 벗어나면 첫번째 열로 변경.
					j = 0;
				}
			}
		}

		for (i = 0; i < 5; i++) {
			for (j = 0; j < 5; j++) {
				System.out.printf("%2d ", num[i][j]);
			}
			System.out.println();
		}
	}
}
