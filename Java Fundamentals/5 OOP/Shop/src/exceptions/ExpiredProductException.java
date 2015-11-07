package exceptions;

public class ExpiredProductException extends Exception {
	
	public ExpiredProductException() {
		super();
	}

	public ExpiredProductException(String message) {
		super(message);
	}

	public ExpiredProductException(Throwable cause) {
		super(cause);
	}

	public ExpiredProductException(String message, Throwable cause) {
		super(message, cause);
	}

	public ExpiredProductException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
