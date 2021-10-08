package br.com.classes02;

public class Carro {
	//ATRIBUTOS --> CARACTERISTICAS
	
	String marca;
	String modelo;
	int ano;
	int velocidade;
	
	//METODOS --> FUNCIONALIDADES (VERBOS)
	//os valores colocados nos objetos vao ser inseridos nos metodos abaixo:
	void acelerar(int aceleracao) {
		velocidade += aceleracao;
	}
	void freiar(int reduzir) {
		velocidade -= reduzir; // velocidade = velocidade - reduzir. 
	}
}
