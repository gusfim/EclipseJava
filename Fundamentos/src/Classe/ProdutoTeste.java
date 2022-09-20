package Classe;

public class ProdutoTeste {
	public static void main(String[] args) {
		
		
		Produto p1 = new Produto();
		p1.nome = "Notebook";
		p1.preco = 4356.89;
		p1.desconto = 0.25;
		
		
		var p2 = new Produto();
		p2.nome = "Caneta";
		p2.preco = 12.50;
		p2.desconto = 0.29;
		
		System.out.println(p1.nome);
		System.out.println(p2.nome);
		
			
		System.out.printf("Total a pagar é: $" + "%.2f",p1.precoComDesconto());
		System.out.printf("\nTotal a pagar é: $" + "%.2f", p2.precoComDesconto());
	}

}
