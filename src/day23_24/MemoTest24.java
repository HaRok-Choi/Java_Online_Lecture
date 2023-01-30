package day23_24;

public class MemoTest24 {
	public static void main(String[] args) {
		
		MemoVO24 mv1 = new MemoVO24();
		MemoVO24 mv2 = new MemoVO24("홍길동", true, "Fisrt!");
		
		System.out.println(mv1);
		System.out.println(mv2);
		
		MemoVO24 mv3 = new MemoVO24("성춘향", false, "큐트");
		System.out.println(mv3);
		
		mv2.count = 100;
		System.out.println(mv3.count);
		
//		System.out.println(mv2.name);		// name은 private 권한을 가지는 멤버이므로 에러가 발생된다.
		
		System.out.println(mv2.getName());
		mv2.setName("임꺽정");
		System.out.println(mv2.getName());
	}
}
