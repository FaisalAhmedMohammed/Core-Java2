package com.ahmed.co;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutPutWriting {
	public static void main(String[] args) throws IOException {	
		Student s1 = new Student();
		s1.setSno(101);
		s1.setName("ashok");
		s1.setFee(3000);  
		s1.setCourse("java");
		s1.setCompleted("y");
		FileOutputStream fis = new FileOutputStream("object.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fis);
		oos.writeObject(s1);
		oos.flush();
		fis.flush();
		System.out.println("Object is saved in DB");
		oos.close();
		oos.close();
		
	}

}
