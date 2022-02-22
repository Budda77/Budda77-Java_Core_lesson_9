package ua.lviv.lgs.general;

public class Application {
	public static void main(String[] args) {
		
		
		// Example 1 NullPointerException
		//String s = null;
		//s.concat("Test string");
		
		// Example 2  ArrayIndexOutOfBoundsException
		//int [] arr = {1,2,3};
		//System.out.println(arr[3]);
		
		// try-catch-finally
		try {
			String s = null;
			s.concat("Test string");
			
		}catch(NullPointerException e) {			
			System.out.println("Null Pointer Exception ");	
			e.printStackTrace();
		}catch(Exception e) {
			System.err.println("You tried to use method from null refference " + e);
		}catch(Throwable e) {
			System.err.println("lsat destination " + e);
		}finally {
			System.out.println("Closed all resources");
		}
		
		
	}

}
