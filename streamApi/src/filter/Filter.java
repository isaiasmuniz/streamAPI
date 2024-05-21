package filter;

import java.util.Arrays;
import java.util.List;


public class Filter {
	public static void main(String[] args) {
		Aluno a1 = new Aluno("ana", 3.4);
		Aluno a2 = new Aluno("gui", 2.5);
		Aluno a3 = new Aluno("manu", 7.8);
		Aluno a4 = new Aluno("gabi", 9.0);
		Aluno a5 = new Aluno("nanda", 8.8);
		Aluno a6 = new Aluno("pedro", 05.3);
		
		List<Aluno> alunos = Arrays.asList(a1,a2,a3,a4,a5,a6);
		alunos.stream()
		.filter(n -> n.nota>=7)
		.map(n -> "aparabnes " + n.nome + " vc foi aprovado")
		.forEach(System.out::println);
	}

}
