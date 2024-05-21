package reduce;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce03 {
	public static void main(String[] args) {
		Aluno a1 = new Aluno("ana", 7.1);
		Aluno a2 = new Aluno("babi", 6.1);
		Aluno a3 = new Aluno("nanda", 8.1);
		Aluno a4 = new Aluno("gui", 10);
		
		List<Aluno> alunos = Arrays.asList(a1,a2,a3,a4);
		Predicate<Aluno> aprovados = a -> a.nota >= 7;
		Function<Aluno, Double> getNota = n -> n.nota;
		BiFunction<Media, Double, Media> calcularMedia =
				(media, nota) -> media.add(nota);
		BinaryOperator<Media> combinar = 
				(m1, m2) -> Media.combinar(m1, m2);
				
		Media media = alunos.parallelStream()
				.filter(aprovados)
				.map(getNota)
				.reduce(new Media(), calcularMedia, combinar);
		
		System.out.println("a nota dos aprovados eh: " + media.getNota());
	}

}
