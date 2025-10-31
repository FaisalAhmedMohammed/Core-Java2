import java.util.Scanner;
public class ReadCharacrer {
	public static void main(String[] args) {
	String str = "abc";
	char ch = str.charAt(0);
	System.out.println(ch);
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter any Character: ");
	//String st = sc.next();
	//char ch1 = st.charAt(0);

	char ch2 = sc.next().charAt(0);
	System.out.print("ch2: "+ ch2);
	}
}