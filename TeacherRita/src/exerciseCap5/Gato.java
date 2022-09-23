package exerciseCap5;

class Gato {

	private String nome;
	private String raca;
	private String alimentacao;
	private int idade;
	private boolean vacina;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public String getAlimetacao() {
		return alimentacao;
	}

	void setAlimetacao(int idade) {
		if (idade <= 2) {
			alimentacao = "devera ser 8 vezes ao dia!";
		} else if (idade <= 8) {
			alimentacao = "devera ser 6 vezes ao dia!";
		} else {
			alimentacao = "devera ser 3 vezes ao dia!";
		}

	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public boolean getVacina() {
		return vacina;
	}

	public void setVacina(boolean vacina) {
		this.vacina = vacina;
	}

	Gato() {

	}

	void exibirDados() {
		System.out.println("Nome: " + getNome() + "\n" + "Raca do animal e: " + getRaca() + "\n"
				+ "A idade do animal e: " + getIdade()+" anos" + "\nAlimetacao " + getAlimetacao());
	}
/*
	void setDados(String nome, String raca, int idade) {
		setNome(nome);
		setRaca(raca);
		setIdade(idade);

	}*/

	void exibVacina(boolean vacina) {
		if (vacina == true) {
			System.out.println(getNome() + " A Vacina esta em dia!");
		} else {
			System.out.println(getNome() +" Precisa vacinar!");
		}
	}

}
