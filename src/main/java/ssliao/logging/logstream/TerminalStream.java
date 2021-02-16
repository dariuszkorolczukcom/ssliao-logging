package ssliao.logging.logstream;

public class TerminalStream implements LogStream {

	@Override
	public void error(String message) {
		this.log("ERROR: " + message);

	}

	@Override
	public void info(String message) {
		this.log("INFO: " + message);

	}

	@Override
	public void debug(String message) {
		this.log("DEBUG: " + message);

	}

	private void log(String message) {
		System.out.printf("terminal: %s\n", message);
	}

}
