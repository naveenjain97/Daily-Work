package com.cognizant.traning.nestedClass;

import java.util.Scanner;

public class Ascending {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size, i, j,temp;
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
		
		for (i = 0; i < arr.length; i++) {
			for(j=i+1;j<arr.length;j++)
			{
				  if(arr[i] > arr[j]) 
				  {
			         temp = arr[i];  
			            arr[i] = arr[j];  
			            arr[j] = temp;
				  }
		}

}
		for(i=0;i<arr.length;i++)
		{
			System.out.println("ascending ordeer"+arr[i]);
		}
	}
}
