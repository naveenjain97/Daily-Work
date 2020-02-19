package com.cognizant.traning;

public class Interface1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Imp i=new Imp();
		
		//Sub i=new Imp();
		
		//Add i= new Imp();
		System.out.println(i.add(2,3));
		System.out.println(i.sub(7,9));
		System.out.println(Add.modulus(9,7));


	}

}
interface Add
{
	 int add(int a,int b);
	 
	 default int mult(int a,int b)
	 {
		 return a*b;
	 }
	 static int modulus(int a,int b)
	 {
		 return a%b;
	 }
}
interface Sub extends Add
{
	int sub(int a,int b);
}
class Div
{
	public int div(int a,int b)
	{
		return a/b;
	}
}

class Imp  extends Div implements Sub
{
	public int add(int a,int b)
	{
		return a+b;
	}
	public int sub(int a, int b)
	{
		return a-b;
	}
}