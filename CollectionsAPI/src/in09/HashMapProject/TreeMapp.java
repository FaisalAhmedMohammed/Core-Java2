package in09.HashMapProject;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapp {
	public static void main(String[] args) {
		Map<BankAccount, Integer> tree = new TreeMap<BankAccount, Integer>();

		BankAccount acc1 = new BankAccount(1234, "c1", 2000, "Ameerpet");
		BankAccount acc2 = new BankAccount(1235, "c2", 2000, "techHicity");
		BankAccount acc3 = new BankAccount(1236, "c3", 3000, "Jublihills");
		BankAccount acc4 = new BankAccount(1237, "c4", 4000, "Punjagutta");
		BankAccount acc5 = new BankAccount(1238, "c5", 5000, "Banjarahills");
		BankAccount acc6 = new BankAccount(1239, "c6", 6000, "Banjarahills");
		BankAccount acc7 = new BankAccount(1241, "c7", 7000, "Punjagutta");
		BankAccount acc8 = new BankAccount(1241, "c8", 8000, "Ameerpet");
		BankAccount acc9 = new BankAccount(1241, "c8", 8000, "Ameerpet");

		tree.put(acc9, 2);
		tree.put(acc4, 5);
		tree.put(acc1, 1);
		tree.put(acc5, 7);
		tree.put(acc2, 4);
		tree.put(acc6, 9);
		tree.put(acc8, 8);
		tree.put(acc7, 6);
		tree.put(acc3, 3);

		System.out.println(tree);
	}
}
