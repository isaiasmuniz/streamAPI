package listInteradorStream;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {
	public static void main(String[] args) {
		Consumer<String> print = System.out::print;
		
		Stream<String> langs = Stream.of("lua ", "java ", "js\n");
		langs.forEach(print);
		String[] maisLangs = {"python ", "lisp ", "perl ", "go\n"};
		Stream.of(maisLangs).forEach(print);
		Arrays.asList(maisLangs).forEach(print);
		Arrays.stream(maisLangs, 1, 4).forEach(print);
	}
}
