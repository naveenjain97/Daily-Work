package com.cts.training.controller.Feb21;
import java.util.Scanner;

public class ReplaceWord {
	public static void main(String[] args) {
		

	String name="why is today a working day for you?" ;
	Scanner Sc=new Scanner(System.in);
//	name=Sc.next();
//	int len=name.length();
//	for(int i=0;i<len;i++)
		String replaceString=name.replaceAll("yes","s");
		String replaceString1=name.replaceAll("you","u");
		String replaceString2=name.replaceAll("today","2day");
		String replaceString3=name.replaceAll("why","");
	//System.out.println(name);
	System.out.println(replaceString);
	System.out.println(replaceString1);
	System.out.println(replaceString2);
	System.out.println(replaceString3);

}
}

