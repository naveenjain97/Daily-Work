package com.cts.training.controller.Feb21;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.SequenceInputStream;
import java.util.Scanner;

public class Activity21Feb{

	String BookName;
	String Author;
	String price;

	public void dataread(String path1) throws IOException {
		// TODO Auto-generated method stub
		InputStreamReader ISR = new InputStreamReader(System.in);
		BufferedReader BR = new BufferedReader(ISR);
		System.out.println("Enter the Author Name");
		Author = BR.readLine();
		System.out.println("Enter the Book Name");
		BookName = BR.readLine();
		System.out.println("Enter the price");
		price = BR.readLine();
		FileOutputStream out1 = new FileOutputStream(path1, true);
		String info= BookName + "\t "+Author + "\t "+price+ " \n" ;
		 byte b[]=info.getBytes();
			out1.write(b);
			out1.close();
			
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String path = "C:\\Users\\admin\\Desktop\\naveen\\java\\input.txt";

		FileOutputStream out = new FileOutputStream(path, true);
		System.out.println("Enter your choose ");
		System.out.println("1. input the book Details");
		System.out.println("2. Display the book Details");

		int choice;
		Scanner Sc = new Scanner(System.in);
		choice = Sc.nextInt();

		Activity21Feb Feb = new Activity21Feb();

		switch (choice) {
		case 1: {
			Feb.dataread(path);
			System.out.println("1. input the book Details");
			System.out.println("2. Display the book Details");
			System.out.println("0. exit");
			switch (choice)
			{
			case 1:
			Feb.dataread(path);
			break;
			case 2:
			Feb.DataDisplay(path);
			break;
			case 0:
			{
				System.out.println("out of the program..."); 
				 exit(0);
				 break;
			}
			
		}
			break;
		}
		 case 2:
		 {
			 Feb.DataDisplay(path);
			 System.out.println("1. input the book Details");
			System.out.println("2. Display the book Details");
			System.out.println("0. exit");
		 }
		 case 0:
		 {
			 System.out.println("out of the program..."); 
			 exit(0);
		 }
			 
		 default:
		 {
			 System.out.println("you enter the wrong choice");
			 exit(0);
		 }

		}

	}

	private static void exit(int i) {
		// TODO Auto-generated method stub
		
	}

	private void DataDisplay(String path) throws IOException {
		
	File file = new File(path);
	FileInputStream fin1=new FileInputStream(path);
	int i;
	while ((i = fin1.read()) != -1) {
		
		 System.out.print((char)i);
	}

}
}
