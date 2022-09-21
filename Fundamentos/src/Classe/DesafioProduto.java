package Classe;

public class DesafioProduto {

	String nome;
	double preco;
	static double desconto = 0.25;

    DesafioProduto(){
		
	}
	double precoComDesconto(){
		return preco * (1 - desconto);
	}
	
	DesafioProduto(String nomeInicial, double precoInicial) {
		nome = nomeInicial;
		preco = precoInicial;
	}

	
}
