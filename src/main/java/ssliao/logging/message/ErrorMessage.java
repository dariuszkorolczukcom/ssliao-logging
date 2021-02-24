package ssliao.logging.message;

import java.time.format.DateTimeFormatter;

import ssliao.logging.util.Color;
import ssliao.logging.util.MessageType;

public class ErrorMessage {
	
	MessageType type;
	DateTimeFormatter dateTimeFormatter;
	Color color;
	String message;

	public ErrorMessage(MessageType type, DateTimeFormatter dateTimeFormatter, Color color) {
		this.type = type;
		this.dateTimeFormatter = dateTimeFormatter;
		this.color = color;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public String getStackTrace() {
		return Thread.currentThread().getStackTrace().toString();
	}

	public MessageType getType() {
		return type;
	}

	public DateTimeFormatter getDateTimeFormatter() {
		return dateTimeFormatter;
	}

	public Color getColor() {
		return color;
	}
	
	
}
