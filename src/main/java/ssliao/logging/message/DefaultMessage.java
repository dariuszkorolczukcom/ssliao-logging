package ssliao.logging.message;

import java.time.format.DateTimeFormatter;

import ssliao.logging.util.MessageType;

public class DefaultMessage {

	MessageType type;
	DateTimeFormatter dateTimeFormatter;
	String message;

	public DefaultMessage(MessageType type, DateTimeFormatter dateTimeFormatter) {
		this.type = type;
		this.dateTimeFormatter = dateTimeFormatter;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public MessageType getType() {
		return type;
	}

	public DateTimeFormatter getDateTimeFormatter() {
		return dateTimeFormatter;
	}	
	
}
