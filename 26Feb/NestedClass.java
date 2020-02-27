package com.cognizant.traning.nestedClass;

public class NestedClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Outer obj=new Outer();
		Outer.Inner obj2= obj.new Inner();
		//obj2.x=20;
		obj2.display();

	}

}
class Outer
{
	int x=10;
	static int y=20;
	private String name="naveen";
	 class Inner
	{
		public void display()
		{
			x=20;
			System.out.println(y);
			System.out.println(x);
			System.out.println(name);
		}
	}
}