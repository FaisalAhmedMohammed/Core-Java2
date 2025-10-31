import java.util.Scanner;

public class Vowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Character");
        
        String str = sc.next();
        char ch = str.toLowerCase().charAt(0);
        
        switch(ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(str + ": It is a vowel");
                break;
            default:
                System.out.println(str + ": is a consonant");
        }
    }
}
