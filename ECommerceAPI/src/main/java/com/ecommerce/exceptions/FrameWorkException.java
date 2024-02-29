package com.ecommerce.exceptions;

@SuppressWarnings("serial")
public class FrameWorkException extends RuntimeException {

	public FrameWorkException(String message) {
		super(message);
	}
	public FrameWorkException(String message ,Throwable cause) {
		super(message,cause);
	}
}
