package Classe;

public class ItensTeste {
	
	public static void main(String[] args) {
		
		Itens i1 = new Itens("Projeto construtores");
		Itens i2 = new Itens(20);
		
		System.out.println(i1.nome);
		System.out.println("Valor digitado foi: " + i2.valor);
	}
	
}
