package foreach.lamda;

import java.util.ArrayList;
import java.util.List;

public class LambdaForEach {
public static void main(String[] args) {
	List<String> list = new ArrayList<String>();
	 list.add("ankit");  
     list.add("mayank");
     list.add("");

     list.add("irfan"); 
     list.forEach(
    		 (name)->System.out.println(name)
    		 );
}

}
