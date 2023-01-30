package day22;

public class MemberTest {
	public static void main(String[] args) {
		
		MemberVO mv = new MemberVO();
//		생성된 객체의 멤버에 접근하려면 객체 이름에 "."을 찍어서 접근하다.		
		System.out.println(mv.no);
		System.out.println(mv.name);
		System.out.println(mv.gender);
		System.out.println(mv.height);
		System.out.println(mv.Firstname);
		
	}
}
