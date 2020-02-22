package com.cts.training.controller.Feb21;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
//import java.io.FilterOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
//same data paste in multiple file or created File also
public class WriteIntoMulti {
	public static void main(String[] args) throws IOException {
		

	String path1 = "C:\\Users\\admin\\Desktop\\naveen\\java\\it.txt";
	String path2 = "C:\\Users\\admin\\Desktop\\naveen\\java\\cs.txt";
	String path3 = "C:\\Users\\admin\\Desktop\\naveen\\java\\ec.txt";
	String path4 = "C:\\Users\\admin\\Desktop\\naveen\\java\\ce.txt";
	
	FileOutputStream out1=new FileOutputStream(path1);
	FileOutputStream out2=new FileOutputStream(path2);
	FileOutputStream out3=new FileOutputStream(path3);
	FileOutputStream out4=new FileOutputStream(path4);
	ByteArrayOutputStream bout =new ByteArrayOutputStream();
	String data="This is thee commomn example";
	byte[] b=data.getBytes();
	
	//paste data in common container
	
	bout.write(b);
	// write data on all the file
	bout.writeTo(out1);
	bout.writeTo(out2);
	bout.writeTo(out3);
	bout.writeTo(out4);
	
	
	

}
}