package com.cognizant.traning;
import java .util.Scanner;
import java.util.Arrays;
public class Sort {
	
	
		
		
		public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the String");
		String str = input.nextLine();
		

		char chk [] = str.toCharArray();
		
		int len=chk.length;
		char temp;
		for (int i = 0; i < len; i++) {
			for(int j=i+1;j<len;j++)
			{
				if(Character.toLowerCase(chk[j])<Character.toLowerCase(chk[i]));
				{
					temp=chk[i];
					chk[i]=chk[j];
					chk[j]=temp;
				}
				
			}	
		}
				for(int k=0;k<len;k++)
				{
					System.out.print(chk[k]);
				}
			}
		}


