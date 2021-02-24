package ssliao.logging.builder;

import java.time.format.DateTimeFormatter;

import ssliao.logging.message.ErrorMessage;
import ssliao.logging.util.Color;
import ssliao.logging.util.MessageType;

public class ColourMessageBuilder implements IColouredMessageBuilder {
	
	MessageType type;
	DateTimeFormatter dateTimeFormatter;
	Color color;

	@Override
	public void setMessageType(MessageType type) {
		this.type = type;
	}

	@Override
	public void setTimeFormat(String pattern) {
		this.dateTimeFormatter = DateTimeFormatter.ofPattern(pattern);
		
	}

	@Override
	public void setOutputColor(Color color) {
		this.color = color;
		
	}
	
	public ErrorMessage getErrorMessage() {
		return new ErrorMessage(type, dateTimeFormatter, color);
	}

}
