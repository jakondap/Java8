package com.test.java8;

public class MethodReferences {
	public static void main(String[] args) {
		MethodInterface methodInterface = () -> new MethodReferences().myMethod();
		methodInterface.interfaceMethod();
		MethodInterface2 methodInterface2 =  (str) -> myMethod1(str); 
		methodInterface2 =  str -> myMethod1(str);
		methodInterface2 =  (String str) -> myMethod1(str);
		methodInterface2.interfaceMethod("Karti");
	}
	public  void myMethod() {
		System.out.println("My Method");
	}
	
	public static void myMethod1(String myName ) {
		System.out.println("My Method "+myName);
	}
	
	public interface MethodInterface{
		public void interfaceMethod();
		default void sayhello() {
			System.out.println("");
		}
		static void printThis() {
			System.out.println("This is print function");
		}
	}
	
	public interface MethodInterface2{
		public void interfaceMethod(String name);
	}
}
