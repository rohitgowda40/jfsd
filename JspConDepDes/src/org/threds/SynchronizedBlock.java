package org.threds;

public class SynchronizedBlock {
	
	public static void main(String[] args) {
		
		SynThred thred = new SynThred();
		SynThred t3 =new SynThred();
		Thread t1 = new Thread(thred);
		
		Thread t2 = new Thread(t3);
		
		t1.start();
		t2.start();
	}

}
