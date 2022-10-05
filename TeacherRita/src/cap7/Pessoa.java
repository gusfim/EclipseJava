package cap7;

public class Pessoa {
	
	String nome;
	double altura;
	double peso;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getAltura() {
		return altura;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double getpeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public void mostraDados() {
		System.out.println("Nome :" + nome);
		System.out.println("Altura :" + altura);
		System.out.println("Peso :" + peso);
	}

}
