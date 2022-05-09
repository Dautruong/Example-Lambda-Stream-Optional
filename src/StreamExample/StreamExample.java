package StreamExample;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {

	public static void main(String[] args) {
		Stream<String> streamEmpty = Stream.empty();
		
	    List<Integer> number = Arrays.asList(2,3,4,5);
	    
	    // map
	    List<Integer> square = number.stream().map(x -> x*x).collect(Collectors.toList());
	    System.out.println(square);
	    
	    Stream<String> streamBuilder =
	    		  Stream.<String>builder().add("a").add("b").add("c").build();
	    System.out.print("streamBuilder : ");
	    streamBuilder.forEach(x -> System.out.println(x + " "));
	    
	    List<String> names = Arrays.asList("Reflection","Collection","Stream");
	  
	    //filter
	    List<String> result = names.stream().filter(s->s.startsWith("S")).
	    		collect(Collectors.toList());
	    System.out.println(result);
	
	    //sorted method
	    List<String> show =names.stream().sorted().collect(Collectors.toList());
	    System.out.println("sort : " + show);
	    
	    String any = show.stream().findAny().get();
	    System.out.println("FindAny: "+ any);
	    
	    String first = show.stream().findFirst().get();
	    System.out.println("FindFirst: "+ first);   
	    
	    List<Integer> numbers = Arrays.asList(2,3,4,5,2);
	  
	    // collect set
	    Set<Integer> squareSet = numbers.stream().map(x->x*x).collect(Collectors.toSet());
	    System.out.println(squareSet);
	  
	    number.stream().map(x->x*x).forEach(y->System.out.print(y+" "));

	    System.out.print("\nDistinct elements: ");
	    numbers.stream().distinct().forEach(p -> System.out.print(p + ", "));
	    
	    List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
	 	long count = strings.parallelStream().filter(string -> string.isEmpty()).count();
	 	System.out.print("\nParallel Processing : ");
	 	System.out.println(count);
	  }

}
