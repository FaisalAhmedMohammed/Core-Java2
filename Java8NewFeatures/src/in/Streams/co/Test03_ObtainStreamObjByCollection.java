package in.Streams.co;

import java.util.List;
import java.util.stream.Stream;

public class Test03_ObtainStreamObjByCollection {

	public static void main(String[] args) {
		List<Integer> lst = List.of(2, 4, 5, 6, 7, 8);
		Stream<Integer> stream = lst.stream();
		stream.forEach(System.out::println);
	}

}
