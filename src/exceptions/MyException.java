package exceptions;

public class MyException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1793989251394788691L;

	/**
	 * 
	 */
	//private static final long serialVersionUID = 1L;

	public MyException(String msg, Throwable e) {
		super(msg, e);
		// TODO Auto-generated constructor stub
	}

	public MyException(String msg) {
		super(msg);
		// TODO Auto-generated constructor stub
	}
}