package trycatch;

public class HelloWorld {
	
	static void inputValue(int value) {
		if (value>100) {
			throw new ArithmeticException("Value>100"); 
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			inputValue(102);
		
	}

}
