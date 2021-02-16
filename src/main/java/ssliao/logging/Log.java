/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package ssliao.logging;

import ssliao.logging.factories.FileFactory;
import ssliao.logging.factories.TerminalFactory;
import ssliao.logging.logstream.LogStream;

public class Log {
	
	private static Log INSTANCE;
	LogStream stream;
    
    private Log(String stream) {
    	LogStream logStream = null;
	    switch (stream) {
		    case "file":
		    	logStream = new FileFactory().createLogStream();
		    	break;
		    case "console":
		    	logStream = new TerminalFactory().createLogStream();
		    	break;
		    default:
	    		stream = null;
	    }
    	this.stream = logStream;
    }
    
    public static Log getInstance(String stream) {
    	if (INSTANCE == null) {
    		INSTANCE = new Log(stream);
    	}
		return INSTANCE;
    }
    
    public static Log getInstance() {
    	if (INSTANCE == null) {
    		INSTANCE = getInstance(null);
    	}
		return INSTANCE;
    }
    
	public void error(String message) {
		this.stream.error(message);

	}

	public void info(String message) {
		this.stream.info(message);

	}

	public void debug(String message) {
		this.stream.debug(message);

	}
	
}
