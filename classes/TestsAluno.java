package br.com.classes;

public class TestsAluno {

	public static void main(String[] args) {

		//INSTANCIAR O OBJETO
		
		Aluno aluno1 = new Aluno();
		Aluno aluno2 = new Aluno();
		
		aluno2.nome = "Maria";
		aluno2.idade = 20;
		aluno2.curso = "Bloco II - Spring boot";
		
		aluno1.nome = "Helen Souza";
		aluno1.idade = 19;
		aluno1.curso = "Bloco I - Java Puro";
		
		System.out.println("***** aluno 1 *******");

		System.out.println("Nome da aluna: " + aluno1.nome);
		System.out.println("Idade: " + aluno1.idade);
		System.out.println("Curso: " +aluno1.curso);
		
		aluno1.assistirAula();
		aluno1.EstudarProva();
		aluno1.FazerProva();
		System.out.println();
		
		System.out.println("***** aluno 2 *******");
		System.out.println("Nome da aluna: " + aluno2.nome);
		System.out.println("Idade: " + aluno2.idade);
		System.out.println("Curso: " +aluno2.curso);
		
		aluno2.assistirAula();
		aluno2.EstudarProva();
		aluno2.FazerProva();
	}

}
