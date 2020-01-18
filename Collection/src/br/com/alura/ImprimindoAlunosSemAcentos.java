package br.com.alura;

import java.util.HashSet;
import java.util.Set;

public class ImprimindoAlunosSemAcentos {

	public static void main(String[] args) {
		Set<String> alunos = new HashSet<>();
		alunos.add("Kelvy");
		alunos.add("Kennedy");
		alunos.add("Kelly");
		alunos.add("Meire");
		alunos.add("Kelvy");
		System.out.println(alunos.size());
		for (String aluno : alunos) {
			System.out.println(aluno);
			
		}

	}

}
