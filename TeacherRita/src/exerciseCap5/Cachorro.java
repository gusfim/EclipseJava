package exerciseCap5;

public class Cachorro {
	String nome;
	String raca;
	int idade;

	void exibirDados() {
		System.out.println("Nome: " + getNome());
		System.out.println("Raca: "+getRaça());
		System.out.println("Idade: " +getIdade());
	}
	
	String getNome() {
		return nome;
	}

	void setNome(String nome) {
		this.nome = nome;
	}

	String getRaça() {
		return raca;
	}

	void setRaça(String raca) {
		this.raca = raca;
	}

	int getIdade() {
		return idade;
	}

	void setIdade(int idade) {
		this.idade = idade;
	}

}
