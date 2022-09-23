package cap5;

public class SobreCargaMetodos {
	
	void exibirInf(String nome) {
		System.out.println("O nome e: " + nome);
	}
	
	void exibirInf(int idade) {
		System.out.println("A idade e: " + idade);
	}
	
	void exibirInf(boolean estadoCivil) {
	if(estadoCivil == true) {
		System.out.println("Estado: Casado(a)");
	}
	else {
		System.out.println("Solteiro(a)");
	}
	}

}
