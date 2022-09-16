package fundamentos.lo;

import java.util.*;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		System.out.println("Informe o numero: ");
		double valor1 = teclado.nextDouble();

		System.out.println("Informe o numero: ");
		double valor2 = teclado.nextDouble();

		System.out.println("Informe a operação: ");
		String op = teclado.next();

		double resultado = "+".equals(op) ? valor1 + valor2 :0;
		resultado = "-".equals(op) ? valor1 - valor2 :resultado;
		resultado = "*".equals(op) ? valor1 * valor2 :resultado;
		resultado = "/".equals(op) ? valor1 / valor2 :resultado;
		System.out.printf("%.2f %s %.2f =  %.2f", 
				          valor1, op, valor2,resultado);

		teclado.close();

	}

}
