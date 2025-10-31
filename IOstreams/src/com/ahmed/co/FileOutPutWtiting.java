package com.ahmed.co;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutPutWtiting {
	public static void main(String[] args)throws FileNotFoundException,IOException{
		FileOutputStream fos = new FileOutputStream("abc.txt");
		fos.write(97);
		fos.write("ahmed".getBytes());
		fos.write('a');
		fos.write(5000);
		fos.flush();
		fos.close();
		System.out.println("Data saved");
	
	}

}
