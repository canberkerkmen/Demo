package com.erkmen.demo.utils;

public class Enums {

	public enum ApplicationStatus {

		ONAY("Onay", "Başvurunuz kabul edilmiştir."), RED("Red", "Başvurunuz reddedilmiştir.");

		private String value;
		private String message;

		private ApplicationStatus(String value, String message) {
			this.value = value;
			this.message = message;
		}

		public String getValue() {
			return value;
		}

		public String getMessage() {
			return message;
		}

		public static ApplicationStatus fromValue(String value) {
			for (ApplicationStatus applcationStatus : values()) {
				if (applcationStatus.getValue().equalsIgnoreCase(value)) {
					return applcationStatus;
				}
			}
			return null;
		}
	}
}
