package edu.vinicius.curso01;

public class OperadorTernario {

	public static void main(String[] args) {
		int a = 10;
		int b = 12;
		
		String resultado = a==b ? "true" : "false";
		int resultadoInteiro = a==b ? 1 : 0;
		
		System.out.println(resultado);
		System.out.println(resultadoInteiro);

	}

}
