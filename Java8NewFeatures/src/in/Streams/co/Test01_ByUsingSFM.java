package in.Streams.co;

import java.util.function.Consumer;
import java.util.stream.Stream;

public class Test01_ByUsingSFM {
	public static void main(String[] args) {
		Stream<Integer> stream = Stream.of(2, 3, 4, 5, 6, 7, 8);

		stream.forEach(new Consumer<Integer>() {
			@Override
			public void accept(Integer t) {
				System.out.println(t);
			}
		});
		System.out.println("*".repeat(50));
		Stream<Integer> stream2 = Stream.of(2, 3, 4, 5, 6, 7, 8);
		stream2.forEach((t -> System.out.println(t)));

		System.out.println("*".repeat(50));
		Stream<Integer> stream3 = Stream.of(2, 3, 4, 5, 6, 7, 8);
		stream3.forEach(System.out::println);
	}

}
