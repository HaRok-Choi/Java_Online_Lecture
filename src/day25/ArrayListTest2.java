package day25;
import java.util.ArrayList;

public class ArrayListTest2 { 
	public static void main(String[] args) {
		
//		Person ps1 = new Person();
//		System.out.println(ps1);
//		Person ps2 = new Person("하록2", 27);
//		System.out.println(ps2);
		
		ArrayList<Person> list = new ArrayList<>();
		
//		list.add(new Person());
		list.add(new Person("하록", 26));					// add(value) : ArrayList에 value를 맨 뒤에 추가한다.
		list.add(new Person("하록1", 30));
		list.add(new Person("하록2", 29));				// 중복되는 데이터도 입력된다.
		System.out.println(list.size() + " : " + list);	// size() : ArrayList에 저장된 데이터의 개수를 얻어온다.
		
		list.add(1, new Person("여포", 52));				// add(index, value) : ArrayList에 index번째 위치에 value를 삽입한다.
		System.out.println(list.size() + " : " + list);	
		
		System.out.println("위 ArrayList의 1번째 위치 : " + list.get(1));				// get(index) : ArrayList의 index번째 위치에 value를 얻어온다.
		
		list.set(2, new Person("춘향", 26));				// set(index, value) : ArrayList에 index번째 위치에 value를 수정한다.
		System.out.println(list.size() + " : " + list);	
		
		list.remove(2);									// remove(index) : ArrayList에 index번째 위치에 value를 제거한다.
		System.out.println(list.size() + " : " + list);	
		
		list.clear();									// clear() : : ArrayList에 모든 데이터를 제거한다.
		System.out.println(list.size() + " : " + list);	
	}
}
