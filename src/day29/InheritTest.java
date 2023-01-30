package day29;

public class InheritTest {
	public static void main(String[] args) {
		
		Parent pr0 = new Parent();
		System.out.println(pr0);		
		Parent pr1 = new Parent("영호", true);
		System.out.println(pr1);
		Parent pr2 = new Parent("영애", false);
		System.out.println(pr2);
		
		Child ch = new Child("주몽", true, 20, "명사수");
		System.out.println(ch);
	}
}
