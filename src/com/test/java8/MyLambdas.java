package com.test.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MyLambdas {

	/**
	 * @param args
	 */
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
		//System.out.println((a, b) -> a+b);
		
		int[] mynums = {1,2,3};
		long sum = IntStream.of(mynums)
				.filter(n -> (n > 2)).
				mapToLong(n -> n+100 ).
				sum();
		int min = IntStream.of(mynums).min().getAsInt();
		int max = IntStream.of(mynums).max().getAsInt();
		
		
		Emp emp2 = new Emp();
		Emp emp1 = new Emp();
		
		emp1.setName("JK");
		emp2.setName("PK");
		emp1.setSalary(2000);
		emp2.setSalary(3000);
		
		List<Emp> emps = new ArrayList<Emp>();
		long salaries = emps.stream()
		.filter(emp -> emp.salary == 2000)
		.mapToLong(emp -> emp.getSalary())
		.sum();
		
		emps.stream()
		//.filter(emp -> emp.salary == 2000l)
		.map(emp -> emp.getName())
		.forEach(System.out::println);
		
		
		System.out.println("The sum is \t"+sum);
		
		Stream<Integer> randomNumbers = Stream
			      .generate(() -> (new Random()).nextInt(100));
		
		randomNumbers.limit(20).forEach(ele -> System.out.print(ele+"\t"));
		
		
		randomNumbers.limit(20).forEach(System.out::println);
	}
	public interface MyFunctional{
		void sayHello();
	}
	
	public static class Emp{
		private String name;
		private long salary;
		/**
		 * @return the name
		 */
		public String getName() {
			return name;
		}
		/**
		 * @param name the name to set
		 */
		public void setName(String name) {
			this.name = name;
		}
		/**
		 * @return the salary
		 */
		public long getSalary() {
			return salary;
		}
		/**
		 * @param salary the salary to set
		 */
		public void setSalary(long salary) {
			this.salary = salary;
		}
	}
}
