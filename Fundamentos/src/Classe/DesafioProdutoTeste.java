package Classe;

public class DesafioProdutoTeste {

	public static void main(String[] args) {
		
		
		//Buscando o metodo original.
		DesafioProduto p1 = new DesafioProduto("Camiseta", 20.0);
		

		//Mudando os valores
		var p2 = new DesafioProduto();
		p2.nome = "Tenis";
		p2.preco = 179.99;
		DesafioProduto.desconto = 0.35;

		double resultado = p1.preco - (p1.preco - p1.precoComDesconto());
        double resultado2 = p2.preco - (p2.preco - p2.precoComDesconto());
        
        
        System.out.printf(p1.nome + " " + "$%.2f\n",p1.precoComDesconto());
        System.out.printf(p2.nome + " " + "$%.2f\n",p2.precoComDesconto());
        System.out.printf("Valor total: $" + "%.2f",resultado + resultado2);

	}

}
