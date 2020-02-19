package com.cognizant.traning;

 class Test {
	int x=10;
	static int y=20;
	
	
static public void show()
{
	System.out.println(y);
	
}
}
public class StaticDemo {
	public static void main(String... args)
	{
	Test d= new Test();
	Test d1= new Test();
	Test d2= new Test();
	System.out.println(d.x);
	System.out.println(d.y);
	
	d1.x=50;
	d2.y=30;
	
	System.out.println(d.x);
	System.out.println(d2.y);
	}
	
}