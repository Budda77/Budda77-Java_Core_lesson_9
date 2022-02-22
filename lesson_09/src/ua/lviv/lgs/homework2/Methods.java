package ua.lviv.lgs.homework2;

public class Methods {
	
	
	void add(double num1, double num2) {
		double result = 0;
			try {
				result = num1 + num2;
				
				exceptionList(num1, num2);
				System.out.println("Method Plus = " + result);
				
			} catch (MyException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}		
	}
	
	void subtract(double num1, double num2) throws IllegalAccessException {
		
		double result = 0;
		
		try {
			result = num1 - num2;
			
			exceptionList(num1, num2);
			
			System.out.println("Method Minus = " + result);
			
		} catch (MyException e) {
			e.printStackTrace();
		}	
	}
	
	void multiply(double num1, double num2) throws IllegalAccessException {

		double result = 0;

		try {
			result = num1 * num2;

			exceptionList(num1, num2);

			System.out.println("Method Multiply = " + result);

		} catch (MyException e) {
			e.printStackTrace();
		}	
	}

	void devide(double num1, double num2) throws IllegalAccessException {

		double result = 0;
		
		try {
			result = num1 / num2;

			exceptionList(num1, num2);

			System.out.println("Method Devide = " + result);

		} catch (MyException e) {
			e.printStackTrace();
		}	
		
	}

	
	/* Implementation of exception rules*/
	
	private void exceptionList(double num1, double num2) throws MyException, IllegalAccessException {
		
		String message = "Be carefull";
		
		if(num1 < 0 && num2 < 0) {
			throw new IllegalArgumentException();
		}
		
		if((num1 == 0 && num2 != 0) || (num1 != 0 && num2 == 0)) {
			throw new ArithmeticException();
		}
		
		if(num1 == 0 && num2 == 0) {
			throw new IllegalAccessException();
		}
		
		if((num1 > 0 && num2 < 0) || (num1 < 0 && num2 > 0)) {
			throw new MyException(message);
		}
	}


}
