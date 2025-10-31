import java.io.*;
public class TryWithRecource{
    public static void main(String[] args){
	
	try(FileWriter fw = new FileWriter("hello.txt")){
		fw.write("Add method");
		fw.flush();

	}
	catch(IOException ex){
		System.out.println(ex.getMessage());
	}
    }
}