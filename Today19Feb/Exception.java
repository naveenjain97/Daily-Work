package com.cognizant.traning;
import java .util.Scanner;
import java.util.Arrays;
public class Exception {
	
	
	public static void main(String args[]){
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter the String by");
	String str = input.nextLine();
	//String name=Character.toLowerCase(str);
	int length=str.length();
	
	char chk [] = str.toCharArray();
	for (int i = 0; i < length; i++)
	{
		for(int j=i+1;j<length;j++)
		{
			if(Character.toLowerCase(chk[i])<Character.toLowerCase(chk[j]));
			{
		Arrays.sort(chk);
	
			}
			
		}	
		System.out.print(chk[i]);
	}
		
	}
	}