package Optional;

import java.util.Optional;
import java.util.stream.Stream;

public class medthodOPtional {
	  public static void main(String[] args) {
		  String str1 = new String("dau");
		  String str2 = null;
		  
		  Optional<String> opt = Optional.of("Truong");
	        Optional<String> emptyOpt = Optional.empty();
	        Optional<String> opt2 = Optional.ofNullable(str2);
	        
	        System.out.println("\n--Filter on Optional--");
	        System.out.println(opt.filter(g -> g.equals("TRUONG"))); 
	        System.out.println(opt.filter(g -> g.equalsIgnoreCase("truong"))); 
	        System.out.println(emptyOpt.filter(g -> g.equalsIgnoreCase("truong")));
	        System.out.println("\n--filter--");
			opt.filter(x -> x.contains("tr"))
				.ifPresent(x -> System.out.println("Name: " + x));
	   	        
	        System.out.println("\n--isPresent--");
			System.out.println(opt.isPresent());
			System.out.println(emptyOpt.isPresent());
			
			System.out.println("\n-- ifPresent --");
			opt.ifPresent(x -> System.out.println(x));
			emptyOpt.ifPresent(x -> System.out.println(x));
			
			System.out.println("\n--   map  --");
			opt.map(x -> x.toLowerCase())
				.filter(x -> x.contains("tr"))
				.ifPresent(x -> System.out.println(" map Name: " + x));
	        
			System.out.println("\n--   or  --");
			Optional<String> result = opt.or(() -> Optional.of("Dau"));
			System.out.println(result);
			Optional<String> result2 = emptyOpt.or(() -> Optional.of("Dau"));
			System.out.println(result2);
					
//	        Optional<String> shouldNotBeEmpty = Optional.empty();
//	        shouldNotBeEmpty.orElseThrow(() -> new IllegalStateException("This should not happen!!!"));

	}
	
}
