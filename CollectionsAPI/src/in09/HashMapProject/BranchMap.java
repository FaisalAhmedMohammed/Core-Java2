package in09.HashMapProject;

import java.util.HashMap;

public class BranchMap {
	private static HashMap<String, Integer> branchMap;
	static {
		branchMap = new HashMap<>();
		branchMap.put("AMEERPET", 1);
		branchMap.put("HITECHCITY", 2);
		branchMap.put("PUNJAGUTTA", 3);
		branchMap.put("BANJARAHILLS", 4);
		branchMap.put("JUBLIHILLS", 5);
	}

	public static int getBranchId(String branch) {
		return branchMap.get(branch.toUpperCase());
	}

}
