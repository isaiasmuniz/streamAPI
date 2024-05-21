package map;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMaps {
	public static void main(String[] args) {
		Consumer<Integer> print = System.out::println;
		List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);
		Function<Integer, String> toBinary = n -> Integer.toBinaryString(n);
		UnaryOperator<String> inverter = x -> new StringBuilder(x).reverse().toString();
		Function<String, Integer> toInteger = n -> Integer.parseInt(n, 2);
		nums.stream()
		.map(toBinary)
		.map(inverter)
		.map(toInteger)
		.forEach(print);

	}

}
