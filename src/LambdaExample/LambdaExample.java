package LambdaExample;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

interface Operation {
   public int add(int a, int b);
}
public class LambdaExample {

	public static void main(String[] args) {
		//Lambda với tham số:
		 Operation operation = (a, b) -> {
	            return a + b;
	        };
	        System.out.println("a + b = " + operation.add(10, 20));
	  
		//Lambda với  forech
		List<Product> list = new ArrayList<Product>(); 
		list.add(new Product(1, "Ip 13pro max", 5000f));
	    list.add(new Product(3, "Ip 12", 3000f));
	    list.add(new Product(5, "Sony xperia ", 3000f));
	    list.add(new Product(2, "Samsung S20", 3500f));
	    list.add(new Product(4, "Samsung S22", 4500f));
	    list.add(new Product(4, "Samsung S21", 4000f));
	    
	    list.forEach(p ->  System.out.println(p.name));
	    
	    System.out.println("\nLambda Filter : ");
	    Stream<Product> filterData = list.stream()
                .filter(p -> p.price > 2000);
	    
	    filterData.forEach(product -> {
            System.out.println( product.name + ": " + product.price);
        });
    }

}
