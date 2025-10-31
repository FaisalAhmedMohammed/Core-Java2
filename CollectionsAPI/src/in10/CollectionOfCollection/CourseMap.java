package in10.CollectionOfCollection;

import java.util.HashMap;
import java.util.Map;

public class CourseMap {
	private static Map<String, Integer> map;
	static {
		map = new HashMap<String, Integer>();
		map.put("CORE JAVA", 1);
		map.put("ADV JAVA", 2);
		map.put("ORACLE", 3);
		map.put("SPRINGBOOT", 4);

	}

	public static int getCousrseId(String Course) {
		if (Course == null) {
			return 0;
		}
		return map.get(Course.toUpperCase());
	}

}
