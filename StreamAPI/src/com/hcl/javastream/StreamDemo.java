package com.hcl.javastream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {

		// 10,20,30,40,50,60

		Stream<Integer> stream = Stream.of();
		
		
	Optional<Integer>  optional =	stream.reduce((Integer a, Integer b)->{ return a+b;});
				
			
			if(optional.isPresent()) {
				
				System.out.println(optional.get());
				
				
			}
			else {
				
				
				System.out.println(optional.orElse(-1));
				
				
			}
			
		
			System.out.println("==================");
			

		/*
		 * stream.forEach((Integer x) -> { System.out.println(x); });
		 */

		int arr[] = { 101, 102, 103, 104, 105 , 102 , 104, 105 };

		IntStream stream1 = Arrays.stream(arr);
		
		stream1.distinct().skip(3).forEach(System.out::println);
		
		
		System.out.println("----------------------------------");

		Integer arr1[] = new Integer[] { 101, -102, 103, 104, -105 };

		Stream<Integer> stream2 = Arrays.stream(arr1);

		//stream2.forEach((Integer i) -> {System.out.println(i);});

		
			stream2.filter((Integer i)->{ return i > 0;})
			
						.forEach((Integer x)->{System.out.println(x);});
		
		
		List<String> list = new ArrayList<String>();

		list.add("Smith");
		list.add("Tom");
		list.add("Javeed");
		list.add("Rajendra Prasad");
		list.add("Jerry");

		Stream<String> stream3 = list.stream();
		
		
			//stream3.forEach((String name)->{System.out.println(name);});
		
		
		//stream3.forEach(System.out::println);
		
		
		stream3.map((String name)->{System.out.println(name); return name.length();})   // map -intermediate operator
			.forEach((Integer i)->{System.out.println(i);});  // forEach- terminal
		
		

	}

}
