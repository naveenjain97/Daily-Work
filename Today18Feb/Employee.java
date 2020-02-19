package com.cognizant.traning;




public class Employee {

	private int num;
	private String name;
	private String designation;
	
	
	public int getnum()
	{
		return num;
		
	}
	public void setnum(int num)
	{
	this.num=num;
	}
	
	
	public String setname ()
	{
		return name;
		
	}
	public void setname(String name)
	{
	this.num=num;
	}
	
	public String designation()
	{
		return designation;
		
	}
	public void  designation(String designation)
	{
	this.designation=designation;
	}
	
	
	
	public static void main(String args[])
	{
		salary sa=new salary();
		sa.setnum(9074389);
		sa.setname("ABC");
//		sa.setdesignation("HR");
		
	}

}

class salary extends Employee
{
	 int basicPay;
	 float  DA;
	 float hra;
	 float grossSalary;
	 float pf;
	 float netPay;
	 float incomTax;
	 double calculate()
	 {
//		DA= 
	 }
	
}

