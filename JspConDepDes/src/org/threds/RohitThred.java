package org.threds;

import java.util.concurrent.Callable;

public class RohitThred implements Callable<String>{
String name;
	/*
	 * @Override public void run() { for(int i=0;i<5;i++) { System.out.println(i);
	 * 
	 * } //System.out.println("Rohit Thred is running....");
	 * 
	 * }
	 */

	
	public RohitThred( String name) {
		this.name=name;
	}
	@Override
	public String call() throws Exception {
	Thread.sleep(10000);
		return "hello"+name;
	}

}
