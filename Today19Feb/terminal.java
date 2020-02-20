package com.cognizant.traning;
import java.util.Scanner;
public class terminal {

		public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			System.out.print("Enter a String: ");
			String str= s. nextLine();
			String[] sp = str.split("\\s+");
			for(int i=0;i<sp.length;i++)
			{
					System.out.println(sp[i]);
		}
		}
	}
	
	

