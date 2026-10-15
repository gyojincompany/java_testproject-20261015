package classTest;

public class MainClass3 {
	public static void main(String[] args) {
		
		//생성자를 통해서 4개의 멤버변수를 모두 초기화하고 싶음.
		Dog dog = new Dog("푸들",5,"초코",3);
		//name=푸들, age=5, nickname=초코, grade=3으로
		//부모객체와 자식객체가 모두 초기화되면서 객체가 생성
		
		String dogSound = dog.bark("멍멍");
		
		
		
	}
}
