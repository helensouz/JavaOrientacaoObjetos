package br.com.generation.metodosSobrecarregados;

public class TestaCalculadora {

	public static void main(String[] args) {
		MinhaCalculadora calcRetorno = new MinhaCalculadora();
		
		 //somando dois inteiros
		
		System.out.println("somando numeros " + calcRetorno.soma(20.1, 25.5));
		System.out.println("somando numeros " + calcRetorno.soma(14.5, 14.9));
		System.out.println("Multiplicando numeros: " +  calcRetorno.mult(2, 2));
		System.out.println("Dividindo numeros: " + calcRetorno.div(10, 2));
	}
}
