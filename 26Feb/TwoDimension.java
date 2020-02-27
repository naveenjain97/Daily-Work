package com.cognizant.traning.nestedClass;

import java.util.Scanner;

class Result {
	public void row(int[][] arr, int row, int column) {

		for (int i = 0; i < row; i++) {
			int sum = 0;
			for (int j = 0; j < column; j++) {

				sum = sum + arr[i][j];

			}
			System.out.println("sum of rows is=:" + sum);
		}

	}

	public void column(int[][] arr, int row, int column) {
		for (int i = 0; i < row; i++) {
			int sum = 0;
			for (int j = 0; j < column; j++) {

				sum = sum + arr[j][i];

			}
			System.out.println("sum of column is=:" + sum);
		}

	}

	public void Diagonal(int[][] arr, int row, int column) {
		int sum = 0;
		for (int i = 0; i < row; i++) {

			for (int j = 0; j < column; j++) {
				if (i == j) {
					sum = sum + arr[j][i];
				}

			}

		}
		System.out.println("sum of Diagonal is=:" + sum);

	}

	public void division(int[][] arr, int row, int column) {
		int sum=0;
		for (int i = 0; i < row; i++) {
			
			for (int j = 0; j < column; j++) {
				if (arr[i][j] % 3 == 0 && arr[i][j] % 5 == 0) {
					sum = sum + arr[j][i];
				}

			}

		}
		System.out.println("sum of divison is=:" + sum);

	}

}

public class TwoDimension {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		int row, column;
		int i, j;
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter Row Size of Array=");
		row = Sc.nextInt();
		System.out.println("Enter Column Size of Array=");
		column = Sc.nextInt();
		int arr[][] = new int[row][column];
		for (i = 0; i < row; i++) {
			for (j = 0; j < column; j++) {
				arr[i][j] = Sc.nextInt();
			}
		}
		for (i = 0; i < arr.length; i++) {
			for (j = 0; j < arr.length; j++) {
				System.out.println("Array is arr[" + i + "]" + "[" + j + "]==:" + arr[i][j]);
			}
			System.out.println();
		}

		Result r = new Result();
		r.row(arr, row, column);
		r.column(arr, row, column);
		r.Diagonal(arr, row, column);
		r.division(arr, row, column);
		// System.out.println("Sum of row"+r.row(arr));
	}
}
