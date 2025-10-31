package in.Streams.co;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Test02_ObtainingStreamByArray {
	public static void main(String[] args) {

		int[] arr = { 2, 3, 4, 5, 6, 7 };
		IntStream stream = Arrays.stream(arr);
		stream.forEach((t) -> {
			System.out.println(t);
		});
		System.out.println();
		int[] arr2 = { 2, 3, 4, 5, 6, 7 };
		IntStream stream2 = Arrays.stream(arr2);
		stream2.forEach(System.out::println);
	}

}
