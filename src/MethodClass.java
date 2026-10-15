
public class MethodClass {
	
	
	int age;
	String name;
	int grade;
	
	
	//이 메서드를 호출하면 나이가 출력되는 메서드로 제작->반환값이 없는 메서드
	public void ageOutput() { 
		System.out.println(this.age);
	}
	
	//이 메서드를 호출하면 나이값이 반환되는 메서드로 제작
	public int ageReturn() {
		
		int result = this.age;
		
		return result;
	}
	
	//외부로부터 점수 정수 2개를 입력(매개변수) 받아 점수들의 평균을 출력하는 메서드 제작
	public void avgScorePrint(int a, int b) { //a, b->매개변수(parameter)
		int result = (a+b)/2;
		System.out.println(result);
	}
	
	//외부로부터 점수 정수 2개를 입력(매개변수) 받아 점수들의 평균을 반환하는 메서드 제작
	public int avgScoreReturn(int a, int b) {
		int result = (a+b)/2;
		return result;
	}
	 
	public String namePrint(Student student) {
		String n = student.name;
		return n;
	}
	
	
	
}	
