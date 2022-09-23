package cap5;

public class VendedorTeste {

	public static void main(String[] args) {

		Vendedor v1 = new Vendedor();
		Vendedor v2 = new Vendedor();
		
		v1.setNome("Joao");
		v2.setNome("Maria");
		
		v1.exibeDados();
		v2.exibeDados();

		v1.setPremioInd(200);
		v1.setPremioEqpe(500);
		v1.exibeDados();
		
		v2.exibeDados();
	}

}
