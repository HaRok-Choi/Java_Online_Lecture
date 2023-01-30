package day19_21;
import java.util.Scanner;

public class SnailTest {
	public static void main(String[] args) {
		// 2차원 배열 예제2 ★★★★★
		
		Scanner sc = new Scanner(System.in);
		System.out.print("배열의 차수를 홀수로 입력하세요 : ");
		int n = sc.nextInt();
		
		int [][] a = new int[n][n];		// 입력을 통한 배열
//		int [][] a = new int[5][5];
		
//		count : 1~25까지 증가하는 변수, i : 행, j : 열, sw : 부호변경, k : 반복횟수 
//		int count = 0, i = 0, j = -1, sw = 1, k = 5;		
		int count = 0, i = 0, j = -1, sw = 1, k = n;		
		
		while (true) {
//			열 방향 채우기
			for (int p = 0; p < k; p++) {
				j += sw;
				a[i][j] = ++count;
			}
			
//			여기서 k의 값이 줄어든다.
			if (--k == 0) {
				break;
			} 
			
//			행 방향 채우기
			for (int p = 0; p < k; p++) {
				i += sw;
				a[i][j] = ++count;
			}

//			★★★
			sw *= -1;
		}
		
		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				System.out.printf("%3d ", a[i][j]);
			}
			System.out.println();
		}
		
	}
}
