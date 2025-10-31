import java.util.Scanner;
public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	try{
		System.out.println("enter a value");
		int a = sc.nextInt();
		System.out.println("enter b value");
		int b = sc.nextInt();
		
		int x = Additon.add(a,b);
		System.out.println("Restlt : " + x);
	}

	catch(NegativeNumberException ex){
		System.out.println(ex.getMessage());
	}
    }
}