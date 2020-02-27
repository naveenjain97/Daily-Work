package com.cognizant.traning.nestedClass;

public class calculatLamba {
	public static void main(String[] args) {
		
		Test add= (a,b) -> a+b;
		System.out.println(add.calculate(3,5));
		Test sub=(a,b)->  a-b;
		System.out.println(sub.calculate(3,5));
		Test mul=(a,b)->a*b;
		System.out.println(mul.calculate(3,5));
		Test div=(a,b)->a/b;
		System.out.println("division is="+div.calculate(3,5));
	}
}
@FunctionalInterface
interface Test
{
	double calculate(double a,double b);
}