import java.util.Scanner;
public class VowelConsonant {
	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter Character");
	String ch= sc.next();
	char str= ch.toLowerCase().charAt(0);
	if(str=='a'||str=='e'||str=='i'||str=='o'||str=='u') {
	System.out.println(ch + ": is a vowel");
	}
		else {
		System.out.println(ch +":is a consonant");
		}
	}
}