package map;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Map {
	public static void main(String[] args) {
		Consumer<String> print = System.out::println;
		List<String> marcas = Arrays.asList("BMW", "Honda", "Audi");
		marcas.stream().map(m -> m.toUpperCase()).forEach(print);
		
		UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + "";
		System.out.println("usando composicao");
		
		marcas.stream()
		.map(Utilitario.maiusculas)
		.map(primeiraLetra)
		.map(Utilitario::grito)
		.forEach(print);
	}

}
