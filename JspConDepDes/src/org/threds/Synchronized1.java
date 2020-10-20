package org.threds;

public class Synchronized1 {
public  static int counter=0;
	public static void main(String[] args) {
		Thread t1=new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i=0;i<5000;i++) {
					Synchronized1.counter++;
					System.out.println("t1 for-loop  "+Synchronized1.counter);
				}
				System.out.println("t1 outside  "+Synchronized1.counter);

			}
		});
Thread t2=new Thread(new Runnable() {
	
			
			@Override
			public void run() {
				for(int i=0;i<5000
						;i++) {
					Synchronized1.counter++;
					System.out.println("t2 for-loop  "+Synchronized1.counter);
				}
				System.out.println("t2 outside  "+Synchronized1.counter);
}
		});
t1.start();
t2.start();
	}

}
