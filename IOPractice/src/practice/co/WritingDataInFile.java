package practice.co;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WritingDataInFile {
	public static void main(String[] args)throws FileNotFoundException,IOException {
		FileOutputStream fos = new FileOutputStream("ahmed.txt");
		fos.write(97);
		//fos.write("ashok".getBytes());
		fos.close();
		System.out.println("Data saved");
		
	}

}
