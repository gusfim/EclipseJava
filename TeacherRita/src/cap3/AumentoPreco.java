package cap3;

import java.util.Scanner;

public class AumentoPreco {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		
		double p1 = teclado.nextDouble();
		double tx = teclado.nextDouble();
		
		double taxa = p1 * (1 + tx);
		
		
		System.out.printf("Valor total e: $" 
		                      + "%.2f",taxa);
		teclado.close();
		
	}

}
