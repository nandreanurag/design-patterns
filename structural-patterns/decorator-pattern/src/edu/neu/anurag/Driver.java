package edu.neu.anurag;

public class Driver {

	public static void main(String[] args) {
		Logger consolLogger=new ConsoleLogger();
		Logger htmlDecorator = new HTMLLogger(consolLogger);
		htmlDecorator.log("Hello");
		Logger encryptDecorator = new EncryptLogger(consolLogger);
		encryptDecorator.log("Hello");
	}
}
