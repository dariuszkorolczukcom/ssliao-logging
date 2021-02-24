package ssliao.logging.director;

import ssliao.logging.builder.IColouredMessageBuilder;
import ssliao.logging.builder.IMessageBuilder;
import ssliao.logging.util.Color;
import ssliao.logging.util.MessageType;

public class BuildersDirector {
	
	public void constructErrorMessage(IColouredMessageBuilder builder) {
		builder.setMessageType(MessageType.ERROR);
		builder.setTimeFormat("DD.MM.YY-HH:mm:ss.SSS");
		builder.setOutputColor(Color.RED);
	}
	
	public void constructDebugMessage(IColouredMessageBuilder builder) {
		builder.setMessageType(MessageType.DEBUG);
		builder.setTimeFormat("DD.MM.YY-HH:mm:ss.SSS");
		builder.setOutputColor(Color.BLUE);
	}
	
	public void constructInfoMessage(IMessageBuilder builder) {
		builder.setMessageType(MessageType.INFO);
		builder.setTimeFormat("DD.MM.YY-HH:mm:ss");
	}
	
	public void constructTimerInfoMessage(IMessageBuilder builder) {
		builder.setMessageType(MessageType.INFO);
		builder.setTimeFormat("DD.MM.YY-HH:mm:ss.SSSSSSSSS");
	}

}
