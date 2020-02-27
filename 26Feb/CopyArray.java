package com.cognizant.traning.nestedClass;

import java.util.Scanner;

public class CopyArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size,sum=0;
		Scanner Sc =new Scanner(System.in);
		System.out.println("Enter Size of Array=");
	 size=Sc.nextInt();
		int [] arr=new int[size];
		int []copy=new int[arr.length];
		System.out.println("Enter array is=");
		for(int i=0;i<size;i++)
		{
			arr[i]=Sc.nextInt();
			
		}
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Array is=:"+arr[i]);
		}
		for(int i=0;i<arr.length;i++)
		{
			copy[i]=arr[i];
			System.out.println("Copy array is"+copy[i]);
		}
}
}