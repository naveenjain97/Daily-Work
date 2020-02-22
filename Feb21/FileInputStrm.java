package com.cts.training.controller.Feb21;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStrm {
	public static void main(String[] args) throws IOException {
		String path = "C:\\Users\\admin\\Desktop\\naveen\\java\\data.txt";
		String newpath = "C:\\Users\\admin\\Desktop\\naveen\\java\\copy.txt";
		File file = new File(path);
		
		//reading
		 FileInputStream in = new FileInputStream(file);
		 
		 
		 BufferedInputStream bin =new BufferedInputStream(in);
		
		//output 
		
		FileOutputStream out=new FileOutputStream(newpath);
		
		
		BufferedOutputStream  bout=new BufferedOutputStream(out);
		int i;
		while ((i = in.read()) != -1) {
			out.write(i);
			//System.out.print((char) i);
		}
	}

}
