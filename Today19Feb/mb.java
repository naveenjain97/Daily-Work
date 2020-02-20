
	//package com.cognizant.training;
	import java.util.*;
	public class mb {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the String = ");
			String name = sc.nextLine();
			
			
			
			char[] convert = name.toCharArray();
			int length = convert.length;
			char temp;
			for (int i = 0; i < length; i++) {
				for (int j = i + 1; j < length; j++) {
					if (Character.toLowerCase(convert[j]) < Character.toLowerCase(convert[i]))
					{
						temp = convert[i];
						convert[i] = convert[j];
						convert[j] = temp;
					}
				}
			}
			for (int k = 0; k < length; k++) {
				System.out.print(convert[k]);
			}
		}
	}


