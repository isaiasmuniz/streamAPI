package reduce;

import java.util.Arrays;
import java.util.List;

public class Outros {
	public static void main(String[] args) {
		Aluno a1 = new Aluno("ana", 7.1);
		Aluno a2 = new Aluno("babi", 6.1);
		Aluno a3 = new Aluno("nanda", 8.1);
		Aluno a4 = new Aluno("gui", 10);
		Aluno a5 = new Aluno("ana", 7.1);
		Aluno a6 = new Aluno("pedro", 6.1);
		Aluno a7 = new Aluno("nanda", 8.1);
		Aluno a8 = new Aluno("lucas", 10);
		
		List<Aluno> alunos = Arrays.asList(a1,a2,a3,a4,a5,a6,a7,a8);
		System.out.println("utilizando distinct: ");
		alunos.stream().distinct().forEach(System.out::println);
		
		System.out.println("\nutilizando skip/limit: ");
		alunos.stream()
		.distinct()
		.skip(2)
		.limit(1)
		.forEach(System.out::println);
		
		System.out.println("\nutilizando takewhile");
		alunos.stream()
		.distinct()
		.skip(2)
		.takeWhile(a -> a.nota >= 7)
		.forEach(System.out::println);
	}

}
