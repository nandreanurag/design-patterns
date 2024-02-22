package edu.neu.anurag;

public class ConsoleLogger implements Logger{

	@Override
	public void log(String msg) {
		System.out.println("Message: "+msg +" logged on console");
	}

}
