package in.java.co;

import java.util.stream.IntStream;

public class CharsMethod {
	public static void main(String[] args) {
		String s1 = "abc";
		IntStream chars = s1.chars();
		chars.forEach(ch -> System.out.println((char) ch));
	}

}
