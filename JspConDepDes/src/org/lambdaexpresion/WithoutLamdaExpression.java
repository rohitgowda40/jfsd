package org.lambdaexpresion;

public class WithoutLamdaExpression {

	public static void main(String[] args) {  
        final int width=10;  
  
        //without lambda, Drawable implementation using anonymous class  
        Drawable d=new Drawable(){  
            public void draw1(){ System.out.println("inside");}

			@Override
			public String saySomething(String life) {
				life = "Life is Hell..."; 
				return life;
			}

			

			/*
			 * @Override public int sum() { // TODO Auto-generated method stub return 0; }
			 */

			
        };  
       // d.saySomething(life);
        
    }  
}
