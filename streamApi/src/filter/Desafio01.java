package filter;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Desafio01 {
	public static void main(String[] args) {
		DesafioNome n1 = new DesafioNome("monstro", 500, 0.30, true);
		DesafioNome n2 = new DesafioNome("produto", 500, 0.40, true);
		DesafioNome n3 = new DesafioNome("diego", 500, 0.20, true);
		DesafioNome n4 = new DesafioNome("diego", 500, 0.10, false);
		
		List<DesafioNome> nomes = Arrays.asList(n1, n2, n3, n4);
		Predicate<DesafioNome> desconto = n -> n.desconto >= 0.30;
		Predicate<DesafioNome> frete = n -> n.frete == true;
		Function<DesafioNome , Double> precoTotal = n -> n.preco * (1-n.desconto);
		
		nomes.stream()
		.filter(desconto)
		.filter(frete)
		.map(precoTotal)
		.forEach(System.out::println);
		
				
		
	}

}
