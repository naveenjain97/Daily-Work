package com.cts.training.controller.Feb21;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStrm {

	public static void main(String[] args) throws IOException {
	
	//FileOutputStream out =new FileOutputStream();
		String path="C:\\Users\\admin\\Desktop\\naveen\\java\\data.txt";
		FileOutputStream out =new FileOutputStream(path,true);
		
		
		String message ="This is the java batch in pune ..nmcnhdfjkfkjdkjsdkd";
		byte b[]=message.getBytes();
		out.write(b);
		out.close();
		
	
	}

}
