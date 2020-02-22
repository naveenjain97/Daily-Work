package com.cts.training.controller.Feb21;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;
//Read multiple files read
public class InputStreamDemo {
	public static void main(String[] args) throws IOException {
		

		String path1 = "C:\\Users\\admin\\Desktop\\naveen\\java\\it.txt";
		String path2 = "C:\\Users\\admin\\Desktop\\naveen\\java\\Bitwise.java";
		String path3 = "C:\\Users\\admin\\Desktop\\naveen\\java\\ec.txt";
		String path4 = "C:\\Users\\admin\\Desktop\\naveen\\java\\ce.txt";
		
		FileInputStream fin1=new FileInputStream(path1);
		FileInputStream fin2=new FileInputStream(path2);
		FileInputStream fin3=new FileInputStream(path3);
		FileInputStream fin4=new FileInputStream(path4);
		
		// 2 file only use SequenceInputStream sis=new SequenceInputStream (fin1,fin2);
		
		Vector vector=new Vector();
		vector.add(fin1);
		vector.add(fin2);
		vector.add(fin3);
		vector.add(fin4);
		
		// now create reference of enumeration
		 Enumeration en=vector.elements();
		 
		 SequenceInputStream sis=new SequenceInputStream (en);
		int i;
		while ((i = sis.read()) != -1) {
			
			 System.out.print((char)i);
		
		

	}
}
}
