package Classe;

public class Area {
	double raio;
	static double pi = 3.14;
	
	Area(double raioInicial) {
		pi = 3.14;
		raio = raioInicial;
	}
	
	double area() {
		return pi * Math.pow(raio, 2);
	}
}
