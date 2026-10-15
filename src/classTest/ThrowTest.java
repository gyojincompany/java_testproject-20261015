package classTest;

public class ThrowTest {
	
	public double divide(int a, int b) throws Exception{
		
		double result = 0.0;
		
		result = (double) a / b; //b=0이면 by zero 예외 발생		
				
		return result;
	}

}
