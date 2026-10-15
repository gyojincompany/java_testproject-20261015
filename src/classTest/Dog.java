package classTest;

public class Dog extends Animal{
	
	String nickname;
	int grade;
	
	public Dog() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Dog(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}
	
	public Dog(String name, int age, String nickname, int grade) {
		super(name, age);
		this.nickname = nickname;
		this.grade = grade;
	}
	
	
	
	
	
	
	
	
	
	
}
