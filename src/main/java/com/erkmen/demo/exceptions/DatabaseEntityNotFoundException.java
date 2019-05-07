package com.erkmen.demo.exceptions;

public class DatabaseEntityNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DatabaseEntityNotFoundException(String msg) {
		super(msg);
	}

}
