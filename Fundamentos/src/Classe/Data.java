package Classe;


public class Data {
	
	int dia;
	int mes;
	int ano;
	
	String retornoData() {
		return String.format("%d/%d/%d", dia,mes,ano);
	}
	
}
