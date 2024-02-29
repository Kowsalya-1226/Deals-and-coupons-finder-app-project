package com.Payment.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice

public class CartPayExceptionHandler {

	@ExceptionHandler(value= {PaymentRequestException.class})
	public ResponseEntity<Object> handleCartPayRequestException(PaymentRequestException e){
		
		HttpStatus badRequest=HttpStatus.BAD_REQUEST;
		PaymentPayException apiException=new PaymentPayException(e.getMessage());
		return new ResponseEntity<Object>(apiException,badRequest);
	}

}
