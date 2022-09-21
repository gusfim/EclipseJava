package exercap4;

import java.util.Scanner;

public class Imc {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Por favor digite o peso:");
		double peso = teclado.nextDouble();
		
		System.out.println("Por favor digite a altura:");
		double altura = teclado.nextDouble();
		
		double calculo = peso / Math.pow(altura, 2);
		
		if(calculo >= 0 && calculo < 18.5) {
			System.out.printf("Abaixo do peso normal IMC = %.2f",calculo);
		}
		
		else if(calculo >= 18.5 && calculo <= 25) {
			System.out.printf("Peso normal IMC = %.2f",calculo);
		}
		else if(calculo > 25 && calculo <= 30) {
			System.out.printf("Acima do peso IMC = %.2f",calculo);
		}
		else {
			System.out.printf("Obesidade IMC = %.2f",calculo);
		}
		

	}

}
