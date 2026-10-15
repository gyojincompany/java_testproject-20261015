
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodClass meth = new MethodClass();
		meth.age = 27;
		
		meth.ageOutput();
		//27이 콘솔창에 출력
		
		int age = meth.ageReturn();
		//27이 반환되면 age에 27이 저장됨
		
		//두개의 점수가 각각 80점과 90점이다 메서드를 호출하여 평균을 출력하시오.
		meth.avgScorePrint(80, 90); //80, 90->인수(argument)
		//85
		
		//두개의 점수가 각각 60점과 80점이다 메서드를 호출하여 변수에 평균을 저장하시오.
		int avg = meth.avgScoreReturn(60, 80);
		//70이 반환되면 avg에 70이 저장됨
		
		System.out.println(meth.avgScoreReturn(60, 80) + 20);
		
		Student stu1 = new Student();
		stu1.name = "홍길동";
		
		String name = meth.namePrint(stu1);
		System.out.println(name);
		
	}

}
