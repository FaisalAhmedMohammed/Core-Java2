import java.util.Scanner;

public class NewPrime {
    
    static void checkPrime(int n) {
        boolean isPrime = true;

        if (n <= 1) {
            System.out.println("It is not a prime number");
            return;
        }

        if (n == 2) {
            System.out.println("It is a prime number");
            return;
        }

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime == true) {
            System.out.println("Prime number");
        } else {
            System.out.println("Not a prime");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = sc.nextInt();
        checkPrime(n);
    }
}
