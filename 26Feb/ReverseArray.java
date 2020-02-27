package com.cognizant.traning.nestedClass;
import java.util.Scanner;
public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size;
		Scanner Sc =new Scanner(System.in);
	 size=Sc.nextInt();
		int [] arr=new int[size];
		System.out.println("Enter array is=");
		for(int i=0;i<size;i++)
		{
			arr[i]=Sc.nextInt();
			
		}
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Array is=:"+arr[i]);
		}
		
		
		int len=arr.length;
		System.out.println("reverse array is=");
		for(int i=len-1;i>=0;i--)
		{
			System.out.println(arr[i]);
		
		
		}
	}

}
