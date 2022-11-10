package com.hcl.interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class ConsumerSupplierDemo {

	public static void main(String[] args) {



		List<Integer>  list = new ArrayList<Integer>();
		
			list.add(10);
			list.add(20);
			list.add(30);
			list.add(40);
			list.add(50);
			
		Consumer<Integer> consumer = (Integer i)->{ System.out.println(i); };    // consumer
			
		
			for (Integer integer : list) {
				consumer.accept(integer);
				
				//consumer.andThen((Integer x)->{System.out.println(x*x);});
				
			}
		
			
Supplier<Integer> intSupplier = ()-> {return 100; };
			
			System.out.println(intSupplier.get());
			
				
			Supplier<String>  stringSupplier = () ->{return "javeed";};
			
			System.out.println(stringSupplier.get());
			
			
			
	Function<String, Integer>  function = (String msg)->{return msg.length();};
	
	int len =	function.apply("ramesh jakula");
		
				System.out.println(len);
			
		
	
	
		Supplier<String> strSupplier1 = ()->{return new String();};
 			
		Supplier<String> strSupplier =  String::new;  // constructor refs
		
			String s1 =		strSupplier.get();
			
					   int d =(int) (Math.random()*10000);
		
					   System.out.println(d);
			
		 Supplier<Double>  doubleSupplier = Math::random; // method reference
		 
		 System.out.println(doubleSupplier.get());
					   
	}

}
