package in.ahmed.co;

import java.io.File;
import java.io.IOException;

public class FileDeleting {
	public static void main(String[] args) throws IOException {
		File f1 = new File("abc.txt");
		System.out.println(f1.exists());
		System.out.println(f1.delete());

		System.out.println("*".repeat(50));

		File f3 = new File("java/spring/Core.txt");
		System.out.println(f3.exists());
		System.out.println(f3.delete());

		System.out.println("*".repeat(50));
		File f2 = new File("java/spring");
		System.out.println(f2.isDirectory());
		System.out.println(f2.delete());
		
		System.out.println("*".repeat(50));
		
		File f4 = new File("java/Boot.txt");
		System.out.println(f4.exists());
		System.out.println(f4.delete());
		
		System.out.println("*".repeat(50));

		File f5 = new File("java");
		System.out.println(f5.exists());
		System.out.println(f5.delete());
		
		System.out.println("*".repeat(50));
		File f6 = new File("faisal/ahmed.txt");
		System.out.println(f6.exists());
		System.out.println(f6.delete());
		
		File f7 = new File("faisal");
		System.out.println(f7.exists());
		f7.deleteOnExit();
		System.out.println(f7.exists());
	}

}
