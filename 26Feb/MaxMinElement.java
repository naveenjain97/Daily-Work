package com.cognizant.traning.nestedClass;

import java.util.Scanner;

public class MaxMinElement {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size, max = 0, min = 0, i, j;
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter Size of Array=");
		size = Sc.nextInt();

		int[] arr = new int[size];
		System.out.println("Enter array is=");
		for (i = 0; i < size; i++) {
			arr[i] = Sc.nextInt();

		}
		for (i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		max = arr[0];
		

		for (i = 0; i < arr.length; i++) {

			if (arr[i] > max)
				max = arr[i];

		}
		min = arr[0];
		for (i = 0; i < arr.length; i++) {
			if (arr[i] < min)
				min = arr[i];

		}

		System.out.println("Max element is" + max);
		System.out.println("Min element is" + min);

	}

}
