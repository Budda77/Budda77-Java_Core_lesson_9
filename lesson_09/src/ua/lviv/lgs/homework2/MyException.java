package ua.lviv.lgs.homework2;

public class MyException extends Exception{
	
	String message;

	public MyException(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}


	

}
