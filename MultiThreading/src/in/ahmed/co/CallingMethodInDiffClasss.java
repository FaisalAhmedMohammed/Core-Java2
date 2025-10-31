package in.ahmed.co;

import java.util.Scanner;

class Example {
	static void m1() {
		System.out.println("M1 start ");
		Scanner sc = new Scanner(System.in);
		System.out.println("M1 execution is paused ");
		System.out.println("Waiting for user to enter input");
		int a = sc.nextInt();
		System.out.println("Input value is : " + a);
		System.out.println("M1 End ");
	}

	static void m2() {
		System.out.println("M2 start");
		System.out.println("M2 End");
	}

	static void m3() {
		System.out.println("M3 start");
		System.out.println("M3 End");
	}
}

class M1Thread extends Thread {
	@Override
	public void run() {
		Example.m1();
	}
}

class M2Thread extends Thread {
	@Override
	public void run() {
		Example.m2();
	}
}

class M3Thread extends Thread {
	@Override
	public void run() {
		Example.m3();
	}
}

public class CallingMethodInDiffClasss {
	public static void main(String[] args) {
		System.out.println("Main Start");

		M1Thread mt1 = new M1Thread();
		mt1.start();

		M2Thread mt2 = new M2Thread();
		mt2.start();

		M3Thread mt3 = new M3Thread();
		mt3.start();
		System.out.println("Main End");
	}

}
