package java8.lambda;
/**
A class that have no name is known as anonymous inner class in java. 
It should be used if you have to override method of class or interface. 
Java Anonymous inner class can be created by two ways:

1. Class (may be abstract or concrete).
2. Interface
 */

//	step 1

//abstract class
//abstract class Person{
//	abstract void eat();
//}
//concrete class
//class Person{ 
//	void eat() {
//		System.out.println("hello");
//	}
//}
//public class AnonymousClass1 {
//
//	public static void main(String[] args) {
//		Person p = new Person() {
//			@Override
//			void eat() {
//				System.out.println("nice fruits");
//				
//			}
//		};
//		p.eat();
//	}
//}
/**
 Internal working of given code
	Person p=new Person(){  
	void eat(){
	   System.out.println("nice fruits");
	 }  
	};  
	
	import java.io.PrintStream;  
	static class AnonymousClass1$1 extends Person  
	{  
	   AnonymousClass1$1(){}  
	   void eat()  
	    {  
	        System.out.println("nice fruits");  
	    }  
	}  
	
	1. A class is created but its name is decided by the compiler which extends the Person class 
	and provides the implementation of the eat() method.
	2. An object of Anonymous class is created that is referred by p reference variable of Person type.
	
**/

// step 2 using interface
interface Eatable{
	void eat();
}
class AnonymousClass1{
	public static void main(String[] args) {
		Eatable e = new Eatable() {
			@Override
			public void eat() {
				 System.out.println("nice fruits");
			}
		};
		e.eat();
	}
}
/**
 *Internal working of given code
It performs two main tasks behind this code:

Eatable p=new Eatable(){  
	void eat(){
	System.out.println("nice fruits");
	}  
};  

Internal class generated by the compiler

import java.io.PrintStream;  
static class AnonymousClass1$1 implements Eatable  
{  
    AnonymousClass1$1(){}  
	void eat(){
	System.out.println("nice fruits");
	}  
}  

A class is created but its name is decided by the compiler which implements the Eatable interface 
and provides the implementation of the eat() method.
An object of Anonymous class is created that is referred by e reference variable of Eatable type.
**/