package ssliao.logging.util;

public enum Color {
	RED(0xFF0000),GREEN(0x00FF00),BLUE(0x0000FF);
	private int hex;
	private Color(int hex) {
		this.hex = hex;
	}
	
	public int getHex()	{
		return this.hex;
	}
}
