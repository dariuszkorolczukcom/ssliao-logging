package ssliao.logging.factories;

import ssliao.logging.logstream.FileStream;
import ssliao.logging.logstream.LogStream;

public class FileFactory implements LogStreamFactory {

	@Override
	public LogStream createLogStream() {
		return new FileStream();
	}

}
