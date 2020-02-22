package com.cts.training.controller.Feb21;
import java.util.Scanner;
public class CountString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String num; 
		Scanner Sc =new Scanner(System.in);
		
		String [] str= {"100","1100","100","1010"};
		System.out.println("Enter the String for searching");
		num=Sc.next();
		int len =str.length;
		System.out.println("length"+len);
		int count=0;
		String name;

			for (int i = 0; i < len; i++) {
				name = str[i];
				if (name.startsWith(num) && !name.equals(num)) {
					count++;
				}
			}
			System.out.println("Searching digit"+count);
			
		}
		
		

	}

