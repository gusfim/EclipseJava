package Classe;

import java.util.Scanner;

public class Itens {
    
	 


	//Primeiro construtor
	String nome;		
	Itens(String nomeIncial){
			nome = nomeIncial;			
		}
	//Segundo construtor
	double valor;
	Itens(double valorInicial){
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um valor:");
		valor = valorInicial;
		valorInicial = teclado.nextDouble();
	}
}
