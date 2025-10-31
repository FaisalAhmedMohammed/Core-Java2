package in.ahmed.co;

import java.io.File;
import java.io.IOException;

public class FileCreation {
	public static void main(String[] args) throws IOException {
		File fl = new File("abc.txt");
		System.out.println(fl.exists());
		System.out.println(fl.createNewFile());

		System.out.println("*".repeat(50));
		File f2 = new File("java");
		System.out.println(f2.mkdir());

		System.out.println("*".repeat(50));
		
		File f3 = new File("java","Boot.txt");
		System.out.println(f3.createNewFile());
		
		System.out.println("*".repeat(50));
		
		File f4 = new File("java", "spring");
		System.out.println(f4.mkdir());
		
		System.out.println("*".repeat(50));

		File f5 = new File("java/spring","Core.txt");
		System.out.println(f5.createNewFile());
		
		System.out.println("*".repeat(50));

		File f6 = new File("faisal","ahmed.txt");
		System.out.println(f6.mkdirs());
	}

}
