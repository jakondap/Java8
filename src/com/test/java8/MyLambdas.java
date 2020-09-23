package com.test.java8;

import java.util.ArrayList;
import java.util.Arrays;

public class MyLambdas {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList();
	    numbers.add(5);
	    numbers.add(9);
	    numbers.add(8);
	    numbers.add(1);
	    
	    numbers.forEach(ele -> System.out.println(ele));
	    
	    
		MyFunctional myFunctional1 = () -> System.out.println("Say Hello !! ! ");
		myFunctional1.sayHello();
		
		int a = 10;
		int b = 20;
		System.out.println((a, b) -> a+b);
		
	}
	public interface MyFunctional{
		void sayHello();
	}
}
