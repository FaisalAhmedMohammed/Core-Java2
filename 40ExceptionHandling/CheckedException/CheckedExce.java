import java.io.*;
public class CheckedExce{
    public static void main(String[] args){
	try{
		m1();
	}
	catch(ClassNotFoundException ex){
		System.out.println(ex.getMessage());
	}
    }
    static void m1() throws ClassNotFoundException{
	Class.forName("abc.txt");
    }
}