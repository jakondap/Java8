package com.test.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExamples {
	
	public static void main(String[] args) {
		
		
		List<String> memberNames = new ArrayList<>();
		memberNames.add("Amitabh");
		memberNames.add("Shekhar");
		memberNames.add("Aman");
		memberNames.add("Rahul");
		memberNames.add("Shahrukh");
		memberNames.add("Salman");
		memberNames.add("Yana");
		memberNames.add("Lokesh");
		
		
		Stream<Integer> intStream = Stream.of(1,2,3,4);
		intStream.forEach(System.out::print);
		
		System.out.println();
		
		Stream generalStream = Stream.of("Hello","world");
		generalStream.filter(ele -> ((String)ele).length() >0)
		.map(ele -> ele+" new str")
		.forEach(System.out::println);
		
		System.out.println();
		
		Stream<Integer> intArrStream = Stream.of(new Integer[] {1,2,3,4,5});
		intArrStream.forEach(ele -> System.out.print(ele));
		
		System.out.println();
		
		IntStream streamFromArr = Arrays.stream(new int[] {2,5,3,7,8,6});
		streamFromArr.forEach(System.out::print);
		
		List<Integer> myLists = new ArrayList<>();
		
		for(int i=1;i<=10;i++)
			myLists.add(i);
		
		System.out.println();
		Stream<Integer> lstIntStream = myLists.stream();
		lstIntStream.forEach(System.out::print);
		
		System.out.println();
		
		memberNames.stream()
		.filter(member -> member.startsWith("A"))
		.map(member -> member.toUpperCase())
		.forEach(System.out::println);
		
		System.out.println("Reduced ...\n");
		
		Optional<String> reduced = memberNames.stream()
				.reduce((name1,name2) -> name1 +"#"+name2);
		
		reduced.ifPresent(System.out::println);
		
		
		
		boolean matched = memberNames.stream()   //Short circuted
				.anyMatch(name -> name.startsWith("A"));   
		System.out.println("matched  "+ matched);
		
		String nameFound = memberNames.stream()   //Short circuted
				.filter(name -> name.startsWith("A"))
				.findFirst()
				.get();
				
	}

}
