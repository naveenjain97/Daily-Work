package com.cts.training.controller.Feb21;

public class NumberSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int	num=36;
	System.out.print(" "+num);
	for(int i=1;i<=10;i++)
	{
	if(i%2!=0)
	{
		num-=2;
		System.out.print(" "+num);
	}
	else
	{
		num=num-4;
	System.out.print(" "+num);
	}
}
		
	}

}
