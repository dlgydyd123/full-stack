package ex05;

import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Ex03_stream {
	public static void main(String[] args) {
		IntStream intStream = IntStream.range(1, 5); // [1,2,3,4]
		LongStream longStream = LongStream.rangeClosed(1, 5); // [1,2,3,4,5]

		Stream<Integer> boxedIntStream = IntStream.range(1, 5).boxed(); // boxed() : int->Integer로 만듬

	}
}
