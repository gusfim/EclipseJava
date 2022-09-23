package cap5;

public class Pessoa {
	private String nome;
	private int idade;
	private char sexo;

	
	Pessoa(){
		
	}
	
	void setNome(String nome) {
		this.nome = nome;
	}
	
	String getNome(){
		return nome;
	}

	int getIdade() {
		return idade;
	}

	 void setIdade(int idade) {
		this.idade = idade;
	}

	 char getSexo() {
		return sexo;
	}

	 void setSexo(char sexo) {
		this.sexo = sexo;
	}

	
	void mostrarDados() {
		System.out.println("----------------------------------------");
		System.out.println("Nome: " + getNome());
		System.out.println("Idade: " + getIdade());
		System.out.println("Sexo: " + getSexo());
		
	}
	
	void setDados(String nome, int idade, char sexo){
		setNome(nome);
		setIdade(idade);
		setSexo(sexo);
	}
	

}
