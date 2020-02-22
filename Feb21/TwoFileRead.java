package com.cts.training.controller.Feb21;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.SequenceInputStream;

public class TwoFileRead {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String path1 = "C:\\Users\\admin\\Desktop\\naveen\\java\\it.txt";
		String path2 = "C:\\Users\\admin\\Desktop\\naveen\\java\\Bitwise.java";
		FileInputStream fin1=new FileInputStream(path1);
		FileInputStream fin2=new FileInputStream(path2);
		
		
		 SequenceInputStream sis=new SequenceInputStream (fin1,fin2);
		 int i;
			while ((i = sis.read()) != -1) {
				
				 System.out.print((char)i);
			
			

		}
	}

}
