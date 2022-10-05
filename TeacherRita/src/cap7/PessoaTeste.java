package cap7;

public class PessoaTeste {

	public static void main(String[] args) {

		Pessoa p = new Pessoa();
		
		p.nome = "Gustavo";
		p.altura = 1.77;
		p.peso = 85.5;
		p.mostraDados();
		System.out.println("====================================================");
		
		Pessoa p2[] = new Pessoa [4];
		p2[0] = new Pessoa();
		p2[1] = new Pessoa();
		p2[2] = new Pessoa();
		p2[3] = new Pessoa();
		
		p2[0].setNome("Gustavo");
		p2[1].setNome("Kiara");
		p2[2].setNome("Lucky");
		p2[3].setNome("Tobby");
		
		for (int i = 0; i < p2.length; i ++) {
			System.out.println(p2[i].getNome());
		}
		
		

	}

}
