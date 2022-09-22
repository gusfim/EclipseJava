package exercap4;

import java.util.Scanner;

public class Vendas {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Por favor digite a categoria de [1-6]");
		System.out.println("Para sair do sistema digite [0]");
		int codigoCategoria = teclado.nextInt();
		int qtde;
		double livros = 0; 
		double celulares = 0; 
		double tablets = 0; 
		double games = 0; 
		double eletronics = 0; 
		double outros = 0; 
		double total = 0;
		
		while (codigoCategoria != 0) {
			if (codigoCategoria >= 1 && codigoCategoria <= 6) {
				System.out.println("Digite a qtde do produto");
				qtde = teclado.nextInt();
				if(codigoCategoria == 1) {
					 livros = qtde * 3.50;
				 }
				 else if(codigoCategoria == 2) {
					 celulares = qtde * 4.5;
				 }
				 else if(codigoCategoria == 3) {
					 tablets = qtde * 5.5;
				 }
				 else if(codigoCategoria == 4) {
					 games = qtde * 6.5;
				 }
				 else if(codigoCategoria == 5) {
					 eletronics = qtde * 7.5;
				 }
				 else if(codigoCategoria == 6) {
					 outros = qtde * 10.0;
				 }
				System.out.println("Digite o produto ou para sair digite [0]");
				codigoCategoria = teclado.nextInt();
			} else {
				System.out.println("Codigo nao existente!");
			}
		}
		System.out.println("Frete livros: $" + livros);
		System.out.println("Frete Celulares: $" + celulares);
		System.out.println("Frete Tablets: $" + tablets);
		System.out.println("Frete Games: $" + games);
		System.out.println("Frete Eletronicos: $" + eletronics);
		System.out.println("Frete Outros: $" + outros);
		total = (livros + celulares+ tablets+ games+ eletronics+ outros);
		System.out.println("Valor total a pagar e: $" + total);	
		teclado.close();
	}
}
