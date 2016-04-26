package org.hypernovae.apis.exceptions;

public class NotYetImplementedException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5461497478559719735L;

	public NotYetImplementedException() {
		this("This service or functionality is not yet implemented... it will be soon!");
		// TODO Auto-generated constructor stub
	}

	public NotYetImplementedException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public NotYetImplementedException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public NotYetImplementedException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public NotYetImplementedException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
	
	

}
