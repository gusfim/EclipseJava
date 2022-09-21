package cap4;

public class ControleDecisao {

	public static void main(String[] args) {

		double valorCompra = 500;
		double valorPagamento = 0;
		
		if(valorCompra >= 1000 && valorCompra <= 1999) {
			valorPagamento = valorCompra * 0.95;
		}
		
		else if(valorCompra >= 2000) {
			valorPagamento = valorCompra * 0.90;
		}
		else {
			valorPagamento = valorCompra;
		}

		System.out.println(valorPagamento);
	}

}
