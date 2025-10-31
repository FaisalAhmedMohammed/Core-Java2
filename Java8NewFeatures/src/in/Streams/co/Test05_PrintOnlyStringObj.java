package in.Streams.co;

import java.util.List;

public class Test05_PrintOnlyStringObj {
	public static void main(String[] args) {
		List<Object> lst = List.of(2, "a", 3, "b", 4, "d");
		lst.stream()
		.filter(ele -> ele instanceof String)
		.forEach(System.out::println);
	}

}
