package lambda.parameter;

public class LambdaMultipleParameter {
public static void main(String[] args) {
	Calculation calc=(a,b)->a-b;
	Calculation calc1=(a,b)->a+b;
	Calculation calculation=(a,b) ->a*b;
	//return a+b;	
		
	
	System.out.println("substract interface "+calc.calculate(10, 20));
	System.out.println("sum interface "+calc1.calculate(10, 20));
	System.out.println("mul interface "+calculation.calculate(10, 20));
}
}
 






