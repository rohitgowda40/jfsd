package lambda.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<Product> list=new ArrayList<Product>();  
         
	        //Adding Products  
	        list.add(new Product(1,"HP Laptop",25000,300.25));  
	        list.add(new Product(3,"Keyboard",300,100.45));  
	        list.add(new Product(2,"Dell Mouse",150,200.44));  
	          
	        System.out.println("Sorting on the basis of name...");  
	        Collections.sort(list,(x1,x2)->{  
	            return  x2.price-x1.price;  
	            });
	        for(Product p:list){  
	            System.out.println(p.id+" "+p.name+" "+p.price+" "+p.insn);  
	        }  
	}

}
