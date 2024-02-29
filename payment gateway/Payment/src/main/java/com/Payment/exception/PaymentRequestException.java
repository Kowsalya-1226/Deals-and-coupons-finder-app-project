package com.Payment.exception;


public class PaymentRequestException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PaymentRequestException(String message, Throwable cause) {
		super(message, cause);
	}

	public PaymentRequestException(String message) {
		super(message);
	}

}
