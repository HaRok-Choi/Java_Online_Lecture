package day29;
// 부모클래스
public class Parent {

//	private String name;
//	private boolean sex;
	
	protected String name;
	protected boolean sex;

	public Parent() {
		this("무명", false);
	}
	
	public Parent(String name, boolean sex) {
		this.name = name;
		this.sex = sex;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isSex() {
		return sex;
	}

	public void setSex(boolean sex) {
		this.sex = sex;
	}

	@Override
	public String toString() {
		return name + "(" + (sex ? '남':'여') + ")" + " 입니다.";
	}
	
	
}
