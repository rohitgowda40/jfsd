package LambadWithThreads;

public class ThreadClass   

{

	 static Runnable runnable = new Runnable() {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("inside run");
		}
	};
	
	/*
	 * public void run() { System.out.println("Thred run method..."); }
	 */
	public static void main(String[] args) {
		 //ThreadClass thread = new  ThreadClass();
		 Thread t1=new Thread(runnable);
		 t1.start();
		 
		 
	}

	
}
