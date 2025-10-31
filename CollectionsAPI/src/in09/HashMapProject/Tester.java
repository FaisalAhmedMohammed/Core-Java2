package in09.HashMapProject;

import java.util.HashMap;
import java.util.Map;

public class Tester {
	public static void main(String[] args) {
		Map<BankAccount, Integer> map = new HashMap<>();
		BankAccount acc1 = new BankAccount(1234, "c1", 2000, "Ameerpet");
		BankAccount acc2 = new BankAccount(1235, "c2", 2000, "Hitechcity");
		BankAccount acc3 = new BankAccount(1236, "c3", 3000, "Jublihills");
		BankAccount acc4 = new BankAccount(1237, "c4", 4000, "Punjagutta");
		BankAccount acc5 = new BankAccount(1238, "c5", 5000, "Banjarahills");
		BankAccount acc6 = new BankAccount(1239, "c6", 6000, "Banjarahills");
		BankAccount acc7 = new BankAccount(1241, "c7", 7000, "Punjagutta");
		BankAccount acc8 = new BankAccount(1241, "c8", 8000, "Ameerpet");
		BankAccount acc9 = new BankAccount(1241, "c8", 8000, "Ameerpet");

		map.put(acc1, 1);
		map.put(acc2, 2);
		map.put(acc3, 3);
		map.put(acc4, 4);
		map.put(acc5, 5);
		map.put(acc6, 6);
		map.put(acc7, 7);
		map.put(acc8, 8);
		map.put(acc9, 9);
		
		
		System.out.println(map);

	}

}
