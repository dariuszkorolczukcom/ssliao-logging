package ssliao.logging.factories;

import ssliao.logging.logstream.LogStream;
import ssliao.logging.logstream.TerminalStream;

public class TerminalFactory implements LogStreamFactory {

	@Override
	public LogStream createLogStream() {
		return new TerminalStream();
	}

}
