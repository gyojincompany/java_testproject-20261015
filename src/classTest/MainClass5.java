package classTest;

public class MainClass5 {

	public static void main(String[] args) {
		ThrowTest test = new ThrowTest();
		
		try {
			test.divide(10, 0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
