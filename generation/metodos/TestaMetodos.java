package br.com.generation.metodos;

import java.util.Scanner;

public class TestaMetodos {
	
	static int num1 = 10, num2 = 3, subtracao, soma;

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int n3, n4;
		
		System.out.println("Digite o numero 3 ");
		n3 = leia.nextInt();
		
		System.out.println("Digite o numero 4 ");
		n4 = leia.nextInt();
		
		metodo1();
		metodo2();
		metodo3();
		metodo4();
		metodo6();
		metodo8();
		System.out.println(TesteMetodoFora.metodo7(n3, n4));
	
		
	}
	
	public static void metodo1() {
		System.out.println("hello");
	}
	
	public static void metodo2() {
		double numero1 = 5, numero2 = 3, soma;
		soma = numero1 + numero2;
		
		System.out.println(soma);
		
	}
	public static void metodo3() {
		subtracao = num1 - num2;
	}
	
	public static void metodo4() {
		System.out.println("a subtração é: " + subtracao);
	}
	
	public static void metodo5(int n1, int n2) { ///n1=1000,n2=500
		soma = n1 + n2;
		System.out.println(soma);
	}
	
	public static void metodo6() { //o metodo 6 chama o metodo5.
		metodo5(500, 500);         //os valores vao ser atribuidos a expressao do metodo5
	}

	public static void metodo8() {
		// //ira apresentar os numeros de 20 ate 30
	}
}
