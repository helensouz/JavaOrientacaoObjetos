package br.com.generation.metodos;

public class TesteMetodoFora {

	static String metodo7(int i, int f) { //criou o metodo, onde é solicitado 2 parametros inteiros
		String numeroString = ""; // declarou a variavel e startou com nada ""
		
		//foi criado como string para reverter de int p string
		
		
		for(int c = i; c <= f; c++) {
			numeroString = numeroString + c + " ";
		}
		return numeroString; //retorna para o usuario os valores
	}
}
