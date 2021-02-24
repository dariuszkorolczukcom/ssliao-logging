package ssliao.logging.builder;

import java.time.format.DateTimeFormatter;

import ssliao.logging.message.DefaultMessage;
import ssliao.logging.message.ErrorMessage;
import ssliao.logging.util.MessageType;

public class DefaultMessageBuilder implements IMessageBuilder {

	private MessageType type;
	private DateTimeFormatter dateTimeFormatter;

	@Override
	public void setMessageType(MessageType type) {
		this.type = type;
	}

	@Override
	public void setTimeFormat(String pattern) {
		this.dateTimeFormatter = DateTimeFormatter.ofPattern(pattern);
	}
	
	public DefaultMessage getMessage() {
		return new DefaultMessage(type, dateTimeFormatter);
	}


}
