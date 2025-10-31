import java.util.Scanner;
public class Fibonacci {
	public static void findFibo(int n){
	int first = 0;
	int second= 1;
	for(int i=1; i<=n; i++) {
		System.out.println(first);//0,1,
		int next= (first+second);//1,2,3
		first=second;//1,1,2
		second=next;//1,2,3

	}

	}

	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number");
	int n = sc.nextInt();
	findFibo(n);
	}
}