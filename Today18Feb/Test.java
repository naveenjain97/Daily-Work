package com.cognizant.traning;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
//		B b=new B();
//		b.display();
		
		A a=new B();
		a.display();
		

	}

}
class A
{
	int x=10;
	public void display()
	{
		//int y=20;
		System.out.println("class A");
	}
}
class B extends A
{
	@Override
	public void display()
	{
		System.out.println("class B");
	}
}