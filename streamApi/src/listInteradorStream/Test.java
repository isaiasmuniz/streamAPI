package listInteradorStream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class Test {
	public static void main(String[] args) {
		List<String> aprovados = Arrays.asList("gui", "luca", "ana");
		System.out.println("utilizando foreach: ");
		for(String nome: aprovados) {
			System.out.println(nome);
		}
		System.out.println("utilizando interator: ");
		Iterator<String> interator = aprovados.iterator();
		while(interator.hasNext()) {
			System.out.println(interator.next());
		}
		System.out.println("utilizando stream: ");
		Stream<String> stream = aprovados.stream();
		stream.forEach(System.out::println);
	}

}
