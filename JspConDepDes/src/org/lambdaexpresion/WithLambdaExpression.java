package org.lambdaexpresion;

public class WithLambdaExpression {
	public static void main(String[] args) {
		
		Drawable drawable = (life)-> {
			/*
			 * int x=10; int y= 20; int sum =x+y;
			 * System.out.println("Using lambda expression "+sum); return sum;
			 */
			 return "WTF..."+life;
			
		};
		System.out.println("Rohit Got Fucked By Ibm..."+drawable.saySomething("What The Fuck The Life Is")
		);
		
		
	}

}
