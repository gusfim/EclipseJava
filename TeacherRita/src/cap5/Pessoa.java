package cap5;

public class Pessoa {
	String nome;
	int idade;
	char sexo;
	String dados;
	
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
		System.out.println("Nome: " + getIdade());
		System.out.println("Nome: " + getSexo());
		
	}
	
	void setDados(String nome, int idade, char sexo){
		setNome(nome);
		setIdade(idade);
		setSexo(sexo);
	}
	

}
