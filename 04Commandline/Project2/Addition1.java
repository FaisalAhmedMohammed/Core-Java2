import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Addition1 {
     public static void main(String[] args) throws IOException{
     //Connection to the Keyboard
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                                            //translator from InputStrean to reader
	System.out.print("Enter First Number");
     	Integer a= Integer.parseInt(br.readLine());
        System.out.print("Enter Secone Number");
	Integer b= Integer.parseInt(br.readLine());
	Integer c= a + b;
	System.out.print("Result: "+ c);
	
    }
}