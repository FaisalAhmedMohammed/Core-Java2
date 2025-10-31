package in11.LinkedHashMap.co;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DupliCateInString {
	public static void main(String[] args) {
		String str = "java is a programming language";

		str = str.replaceAll("\\s+", "");

		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();

		for (char ch : str.toCharArray()) {
			if (!map.containsKey(ch)) {
				map.put(ch, 1);
			} else {
				map.put(ch, map.get(ch) + 1);
			}

		}

		Set<Character> keySet = map.keySet();
		System.out.println(keySet);

		Collection<Integer> values = map.values();

		System.out.println(values);

		Set<Entry<Character, Integer>> entry = map.entrySet();
		System.out.println("Elements Count are: ");
		for (Entry<Character, Integer> entry2 : entry) {
			System.out.println(entry2.getKey() + " = " + entry2.getValue());
		}
	}

}
