package br.com.classes02;

public class TestaCarro {

	public static void main(String[] args) {
		
		Carro c1 = new Carro();
		
		c1.marca = "Fiat";
		c1.modelo = "uno";
		c1.ano = 2000;
		c1.velocidade = 0;
		
		c1.acelerar(120);
		System.out.println(c1.marca);
		System.out.println(c1.modelo);
		System.out.println(c1.ano);
		System.out.println("Velocidade Atual: " + (c1.velocidade));		
		
		
		c1.freiar(30);
		System.out.println("Velocidade atual: " + (c1.velocidade));
	}

}
