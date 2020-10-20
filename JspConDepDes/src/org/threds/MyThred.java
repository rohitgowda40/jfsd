package org.threds;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MyThred {
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		/*
		 * RohitThred rohitThred1 = new RohitThred(); RohitThred rohitThred2 = new
		 * RohitThred();
		 * 
		 * Thread thred1 = new Thread(rohitThred1); Thread thred2 = new
		 * Thread(rohitThred2);
		 * 
		 * thred1.start(); thred2.start();
		 */
		ExecutorService ex =Executors.newFixedThreadPool(2);
		Future<String> welComeFuture = ex.submit(new RohitThred("Life is bullsit..."));
		
		Future<String> welComMessage = ex.submit(new RohitThred(" Life is fucking as badly.."));
		
		System.out.println("\n Callable  Excuted..");
		
		String str = welComeFuture.get();
		String st = welComMessage.get();
		
		System.out.println("str holds....."+str);
		System.out.println("st holds....."+st);
		
		System.out.println("\n Main Completed.."); 
	}

}
