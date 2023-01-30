package day29;
// 자식(하위, 서브, 파생)클래스
// Parent 클래스를 상속받아 Child 클래스를 만든다.
public class Child extends Parent{
	
//	Parent 클래스를 상속 받았으므로 Parent 클래스의 모든 '멤버 변수'와 '메소드'를 별도로 정의하지 않아도 사용할 수 있다.
//	부모클래스의 private 권한을 가진 멤버는 상속은 받았지만 접근할 수 없다.
	private int age;
	private String nickname;
	
	public Child() { }
//	자동완성기능을 사용해도 현재클래스에서 직접 입력해 정의하지 않은 멤버는 보이지 않는다.
	
//	부모클래스로부터 상속받은 멤버변수의 접근 권한이 private일 경우 부모클래스의 생성자를 호출해서 초기화 시킨다.
/*	public Child(String name, boolean sex, int age, String nickname) {
		super(name, sex);
		this.age = age;
		this.nickname = nickname;
	} 	*/
	
//	부모클래스로부터 상속받은 멤버변수의 접근 권한이 private일 경우 부모클래스에 setter 메소드가 작성되어 있다면 'setter메소드'를 사용해서 초기화 시킬수 있다.
/*	public Child(String name, boolean sex, int age, String nickname) {
		setName(name);
		setSex(sex);
		this.age = age;
		this.nickname = nickname;
	}	*/
	
//	부모클래스로부터 상속받은 멤버의 접근 권한이 protected일 경우 자식 클래스에서는 자유롭게 접근할 수 있으므로 일반 멤버 변수를 초기화 시키듯이 this를 사용한 초기화가 가능.
	public Child(String name, boolean sex, int age, String nickname) {
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.nickname = nickname;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	
	@Override
	public String toString() {
//		부모클래스로부터 상속받은 멤버 변수의 접근 권한이 private이면 접근할 수 없으므로 getter 메소드를 사용해야한다.
//		return getName() + "(" + (isSex() ? '남':'여') + ")-" + age + ", " + nickname;
		
//		부모클래스로부터 상속받은 멤버의 접근 권한이 protected일 경우 자식 클래스에서는 자유롭게 접근할 수 있으므로 getter메소드를 사용하지 않아도 된다.
		return name + "(" + (sex ? '남':'여') + ")-" + age + ", " + nickname;
	}
	
}
