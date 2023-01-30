package day25;
import java.util.ArrayList;

public class ArrayListTest {
	public static void main(String[] args) {
		
//		배열은 한번 선언하면 프로그램에서 크기를 변경할 수 없다.
		int[] data = new int[10];
		
//		<E> : 제네릭이라 부르며 ArrayList에 저장할 자료형을 반드시 클래스로 적는다.
//		ArrayList에 저장할 자료가 기본 자료형이라면 기본 자료형을 클래스화 시켜놓은 '랩퍼 클래스'를 사용한다.
//		랩퍼 클래스 : 기본 자료형의 첫 문자만 대문자로 적으면 되고 Character와 Integer는 풀네임을 사용한다.
		
//		ArrayList<Integer> list = new ArrayList<Integer>();		// JDK 1.5이후의 코딩 방법
		ArrayList<Integer> list = new ArrayList<>();			// JDK 1.7이후의 코딩 방법
		
		
		for (int i = 0; i < data.length; i++) {
			data[i] = i + 1;
			list.add(i + 1);
			
			System.out.println("data[" + i + "] = " + data[i] + "," + " list.get(" + i + ") = " + list.get(i));
		}
		
		for (int i = 10; i < data.length + 10; i++) {
//			data[i] = i + 1;	
//			System.out.println("data[" + i + "] = " + data[i]);
			list.add(i + 1);
			System.out.println("list.get(" + i + ") = " + list.get(i));			
		}
		
		
	}
}
