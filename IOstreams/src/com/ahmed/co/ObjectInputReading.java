package com.ahmed.co;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputReading {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream("object.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Object object = ois.readObject();
		Student stu =(Student)object; 
		System.out.println(stu.getSno());
		System.out.println(stu.getName());
		System.out.println(stu.getCourse());
		System.out.println(stu.getFee());
		System.out.println(stu.getCompleted());
	}

}
