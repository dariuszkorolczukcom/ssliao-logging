package ssliao.logging.builder;

import java.time.format.DateTimeFormatter;

import ssliao.logging.util.Color;
import ssliao.logging.util.MessageType;

public interface IColouredMessageBuilder {

	public void setMessageType(MessageType type);
	
	public void setTimeFormat(String pattern);
	
	public void setOutputColor(Color color);
}
