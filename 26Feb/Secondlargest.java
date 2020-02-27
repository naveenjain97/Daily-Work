package com.cognizant.traning.nestedClass;

import java.util.Scanner;

public class Secondlargest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size, i, j, largest, second;
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter Size of Array=");
		size = Sc.nextInt();

		int[] arr = new int[size];
		int[] even = new int[arr.length];
		int[] odd = new int[arr.length];

		System.out.println("Enter array is=");
		for (i = 0; i < size; i++) {
			arr[i] = Sc.nextInt();

		}
		for (i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		int total = arr.length;
		largest = arr[0];
		second = arr[0];
		for (i = 0; i < arr.length; i++) {
			if (arr[i] > largest) {
				second = largest;
				largest = arr[i];

			} else if (arr[i] > second) {
				second = arr[i];

			}

		}
		System.out.println("second largest element is" + second);
	}
}