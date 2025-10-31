package practice.co;

import java.io.File;
import java.io.IOException;

public class FileCreating {
	public static void main(String[] args)throws IOException {
		File f1 = new File("java.txt");
		System.out.println(f1.exists());
		System.out.println(f1.createNewFile());
		
		System.out.println("*".repeat(50));
		File f2 = new File("spring");
		System.out.println(f2.exists());
		System.out.println(f2.mkdir());
		
		System.out.println("*".repeat(50));
		File f3 = new File("spring","springboot");
		System.out.println(f3.exists());
		System.out.println(f3.mkdirs());
		
		System.out.println("*".repeat(50));
		File f4 = new File("spring/springboot","boot.txt");
		System.out.println(f4.exists());
		System.out.println(f4.createNewFile());
		
		System.out.println("*".repeat(50));
		
		File f5 = new File("ashok","java.txt");
		System.out.println(f5.exists());
		System.out.println(f5.mkdirs());
		
		File f6 = new File("nivas","java.txt");

		f6.getParentFile().mkdir();
		if(f6.createNewFile()) {
			System.out.println("get absolute path : "+ f6.getAbsolutePath());
		}
		}

}
