import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Addition {
     public static void main(String[] args) throws IOException{
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      System.out.print("Enter Something");
      String str=br.readLine();
      System.out.print("Result is : "+str);

    }  
}