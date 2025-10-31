import java.io.*;
public class PrintStreamNew{
    public static void main(String[] args){
	try(PrintStream st = new PrintStream(System.out)){
		st.println("Hello world");
	}
	System.out.println("Hi");
   }
}