package test;

public class StaticExample 
{
	
	static int a=10; //static variable
	int b=20;//non-static variable
	
	static void m1() //static method
	{
		System.out.println(a);
		//we cannot access 'b' in static method , bcz b is non static variable
		System.out.println("this is m1- A static method");
	}
	
	void m2() //non-static method
	{
		System.out.println(b);
		System.out.println("this is m2- A non-static method");
	}
	
	public static void main(String[] args) 
	{
		//static methods can access only static stuff directly or by using class name
		System.out.println(StaticExample.a);
		StaticExample.m1();
		
		//System.out.println(b); incorrect ,bcoz b is non-static variable
		//m2(); incorrect ,bcoz m2() methods non-static method
		
		// static methods can access only non-static stuff through creating object of class
		StaticExample obj=new StaticExample();
		System.out.println(obj.b); 
		obj.m2();
		

	}

}
