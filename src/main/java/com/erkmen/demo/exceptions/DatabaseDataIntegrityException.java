package com.erkmen.demo.exceptions;

public class DatabaseDataIntegrityException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DatabaseDataIntegrityException(String msg) {
		super(msg);
	}

}
