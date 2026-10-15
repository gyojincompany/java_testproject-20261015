package classTest;

//부모 클래스
public class Animal {

	String name;
	int age;
	
	public Animal() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Animal(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public String bark(String sound) {
		
		System.out.println(sound);
		
		return sound;
	}
	
	
}
