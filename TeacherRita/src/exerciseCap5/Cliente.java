package exerciseCap5;

public class Cliente {
	private String nomeCliente;
	private double valorCompra;
	private double valorAPagar;
	
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public double getValorCompra() {
		return valorCompra;
	}
	public void setValorCompra(double valorCompra) {
		if(valorCompra >= 1000) {
			this.valorCompra = valorCompra;
		}
		else {
			System.out.println("O valor minimo e $1.000,00");
		}
		
	}
	public double getValorAPagar() {
		return valorAPagar;
	}
	 void setValorAPagar(double valorCompra) {
		valorAPagar =   valorCompra <= 1000 ? valorCompra : valorCompra <= 3000 ? 
				        valorCompra * 0.95 : valorCompra * 0.90;
	}
	/*
	 Conter o método exibirValores, que mostre o nome do cliente, o valor da
	 compra e o valor a pagar.*/
	
	 void exibirValores() {
		 System.out.println("Nome do cliente: " + getNomeCliente());
		 System.out.printf("Valor da compra: $%.2f" , getValorCompra());
		 System.out.printf("\nValor a pagar e: $%.2f" , getValorAPagar());
		 
		
	}
	
	
	

}
