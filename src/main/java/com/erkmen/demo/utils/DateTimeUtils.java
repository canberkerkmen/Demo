package com.erkmen.demo.utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeUtils {

	private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

	public static String convertLocalDateTimeToFormattedString(LocalDateTime localDateTime) {
		String formatDateTime = null;
		if (localDateTime != null) {
			formatDateTime = localDateTime.format(formatter);
		}
		return formatDateTime;
	}
}
