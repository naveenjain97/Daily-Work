package com.cts.training.Homework;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerilizationDemo {

	public static void serialize(Employee employee, String path) {

		try {
			FileOutputStream fout = new FileOutputStream(path);

			BufferedOutputStream bout = new BufferedOutputStream(fout);
			ObjectOutputStream oos = new ObjectOutputStream(bout);
			oos.writeObject(employee);
			oos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	
	public static Object deserialize(String filepath)
	{
		try {
		FileInputStream fin=new FileInputStream(filepath);
		BufferedInputStream bin=new BufferedInputStream (fin);
		ObjectInputStream oin= new ObjectInputStream(bin);
		Object obj=oin.readObject();
		oin.close();
		return obj;
	}
		 catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return null;
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Serialization Code
//		Employee employee = new Employee(1, "Naveen", "Mumbai", "Software", 22, 34554, 47865);
//		serialize(employee, "employee.txt");
//		System.out.println("object created Successfully");
//		
		
	// deserialization 
		Employee employee=(Employee) deserialize("employee.txt");
		System.out.println(employee);
	}

}
