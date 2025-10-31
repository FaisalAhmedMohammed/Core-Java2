package com.ahmed.co;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFileDataToAnotherFile {
	public static void main(String[] args)throws FileNotFoundException,IOException {
		FileInputStream fis = new FileInputStream("abc.txt");
		FileOutputStream fos = new FileOutputStream("bbc.txt");
		int data;
		while((data = fis.read())!=-1 ) {
			fos.write(data);
		}
		fos.flush();
		fos.close();
		fis.close();
		System.out.println("Data Copied");
	}

}
