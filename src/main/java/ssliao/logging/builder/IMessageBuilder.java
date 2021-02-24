package ssliao.logging.builder;

import java.time.format.DateTimeFormatter;

import ssliao.logging.util.MessageType;

public interface IMessageBuilder {

	public void setMessageType(MessageType type);
	
	public void setTimeFormat(String pattern);

}
