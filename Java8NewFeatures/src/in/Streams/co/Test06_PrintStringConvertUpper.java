package in.Streams.co;

import java.util.List;

public class Test06_PrintStringConvertUpper {
	public static void main(String[] args) {
		List<Object> lst = List.of(2, "a", 3, "b", 4, "d");
		lst.stream().filter(ele -> ele instanceof String).map(ele -> ((String) ele).toUpperCase())
				.forEach(System.out::println);
	}

}
