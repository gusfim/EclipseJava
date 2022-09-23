package exerciseCap5;

import java.util.Scanner;

public class ClienteTeste {

	public static void main(String[] args) {

		Cliente compra = new Cliente();
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o nome do seu cliente: ");
		compra.setNomeCliente(teclado.nextLine());
		
		System.out.println("Digite o valor da compra: ");
		compra.setValorCompra(teclado.nextDouble());
		
		System.out.println("Valor total a pagar:");
		compra.setValorAPagar(compra.getValorCompra());
		
		compra.exibirValores();
		
		teclado.close();
	}

}
