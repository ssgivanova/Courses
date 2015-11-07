package exceptions;

public class PurchaseNotPermittedException extends Exception {

	private static final long serialVersionUID = 1L; 
		
	public PurchaseNotPermittedException() {
		super();
	}
	
	public PurchaseNotPermittedException(String message) {
		super(message);
	}

	public PurchaseNotPermittedException(Throwable cause) {
		super(cause);
	}

	public PurchaseNotPermittedException(String message, Throwable cause) {
		super(message, cause);
	}

	public PurchaseNotPermittedException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
