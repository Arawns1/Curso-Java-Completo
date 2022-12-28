package model.exceptions;

public class WithoutBalanceException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	public WithoutBalanceException(String msg) {
		super(msg);
	}
}
