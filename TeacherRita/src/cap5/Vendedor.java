package cap5;

public class Vendedor {
	private static double premioEqpe = 100;
	private double premioInd = 200;
	private String nome;
	
	public double getPremioEqpe() {
		return premioEqpe;
	}
	@SuppressWarnings("static-access")
	public void setPremioEqpe(double premioEqpe) {
		this.premioEqpe += premioEqpe;
	}
	public double getPremioInd() {
		return premioInd;
	}
	public void setPremioInd(double premioInd) {
		this.premioInd += premioInd;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	void exibeDados() {
		System.out.println("Nome : " + getNome());
		System.out.println("Premio individual: " + getPremioInd());
		System.out.println("Premio equipe " + getPremioEqpe());
		
	}

}
