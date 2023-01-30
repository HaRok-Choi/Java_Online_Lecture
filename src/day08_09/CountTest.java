package day08_09;
import java.util.Random;

//	주사위를 10번 굴렸을 때 얻어지는 눈의 갯수
public class CountTest {
	public static void main(String[] args) {

		Random ran = new Random();
//		int a = 0, b = 0, c = 0, d = 0, e = 0, f = 0;
//		배열이란 같은 이름으로 여러개의 기억 장소를 만들어 사용 할 경우 씀.
//		배열을 선언하면 숫자는 0, 문자는 공백, boolean은 false,
//		클래스로 만든 배열은 null로 '자동 초기화'
//		배열의 위치를 지정하는 index는 0부터 시작
		int[] count = new int[6];

		for (int i = 1; i <= 10; i++) {
			int r = ran.nextInt(6) + 1;
			System.out.println(r);

			/*switch (r) {
			/*
			 * case 1: a++; break; 
			 * case 2: b++; break; 
			 * case 3: c++; break; 
			 * case 4: d++; break; 
			 * case 5: e++; break; 
			 * case 6: f++; break;
			 * }
			 */
			/* case 1: count[0]++; break;
			 * case 2: count[1]++; break;
			 * case 3: count[2]++; break;
			 * case 4: count[3]++; break;
			 * case 5: count[4]++; break;
			 * case 6: count[5]++; break;
			 * */
				count[r-1]++;
			}
			for (int j = 0; j < count.length; j++) {
				System.out.println((j + 1) + "의 개수 : " + count[j]);
			}
		}
	}
