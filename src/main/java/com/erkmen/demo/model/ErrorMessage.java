package com.erkmen.demo.model;

import java.time.LocalDateTime;

import com.erkmen.demo.utils.DateTimeUtils;

public class ErrorMessage {

	private String localDateTime;
	private String message;
	private String path;

	public ErrorMessage(LocalDateTime localDateTime, String message, String path) {
		super();
		this.localDateTime = DateTimeUtils.convertLocalDateTimeToFormattedString(localDateTime);
		this.message = message;
		this.path = path;
	}

	public String getLocalDateTime() {
		return localDateTime;
	}

	public void setLocalDateTime(LocalDateTime localDateTime) {
		this.localDateTime = DateTimeUtils.convertLocalDateTimeToFormattedString(localDateTime);
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

}
