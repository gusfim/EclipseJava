package exerciseCap5;

public class TesteGato {

	public static void main(String[] args) {

		Gato g1 = new Gato();		
		g1.setNome("Mufasa");
		g1.setRaca("Vira-lata");
		g1.setIdade(2);
		g1.setVacina(true);
		g1.setAlimetacao(g1.getIdade());
		g1.exibirDados();
		g1.exibVacina(true);
		
		System.out.println("\n=====================================\n");
		/*
		Nome: Félix
		Raça: Siamês
		Idade: 8 anos
		Alimentação: 3 vezes ao dia.*/
		
		Gato g2 = new Gato();
		g2.setNome("Felix");
		g2.setRaca("Siames");
		g2.setIdade(5);
		g2.setAlimetacao(g2.getIdade());
		g2.exibirDados();
		g2.exibVacina(false);
		

	}

}
