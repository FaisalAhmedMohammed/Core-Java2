package com.ahmed.co;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadDataUsingLoop {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		FileInputStream fis = new FileInputStream("abc.txt");
		int data;
		while ((data = fis.read()) != -1) {
			System.out.println(data + " " + (char) data);
		}
		fis.close();
	}

}
