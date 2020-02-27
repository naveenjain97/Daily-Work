package com.cognizant.traning.nestedClass;

import java.util.Scanner;

public class DuplicateCount {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size, sum = 0, visited = -1,i,j;
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter Size of Array=");
		size = Sc.nextInt();
		int[] arr = new int[size];
		int[] arr2 = new int[arr.length];

		System.out.println("Enter array is=");
		for ( i = 0; i < size; i++) {
			arr[i] = Sc.nextInt();

		}

		for(i=0;i<arr.length;i++)
		{
			int count=1;
			for(j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
				
				arr2[j]=visited;
				}
					
			}
			if(arr2[i]!=visited)
			{
				arr2[i]=count;
		}
		
			
		}
		for (i=0;i<arr2.length;i++)
		{
			 if(arr2[i] != visited)  
			System.out.println("frequency is"+arr[i]+" : " +arr2[i]);
		}
	}
		

}
