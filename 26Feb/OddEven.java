package com.cognizant.traning.nestedClass;

import java.util.Scanner;

public class OddEven {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size, i, j;
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter Size of Array=");
		size = Sc.nextInt();

		int[] arr = new int[size];
		int []even= new int[arr.length];
		int []odd= new int[arr.length];
		
		System.out.println("Enter array is=");
		for (i = 0; i < size; i++) {
			arr[i] = Sc.nextInt();

		}
		for (i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		for(i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				even[i]=arr[i];
				
			}
			else
			{
				odd[i]=arr[i];
				
			}
		}
		for(i=0;i<even.length;i++)
		System.out.println("Even arry is=:"+even[i]);
		for(i=0;i<odd.length;i++)
		System.out.println("odd arry is=:"+odd[i]);
}
}
