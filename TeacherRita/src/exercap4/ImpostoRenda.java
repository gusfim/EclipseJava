package exercap4;

import java.util.Scanner;

public class ImpostoRenda {

	public static void main(String[] args) {
		//IR = salario * alíquota - dedução
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o salario:");
		
		double salario = teclado.nextDouble();
		double ir ;
		
		if(salario <= 1903.98) {
			ir = 0;
		}
		else if(salario >= 1903.99 && salario <= 2826.65) {
			ir = salario * 0.075 - 142.80;
		}
		else if(salario >= 2826.66 && salario <= 3751.05) {
			ir = salario * 0.15 - 354.80;
		}
		else if(salario >= 3751.06 && salario <= 4664.68) {
			ir = salario * 0.225 - 636.13;
		}
		else {
			ir = salario * 0.275 - 869.36;
		}
		System.out.println("Valor do salario: $" + salario);
		System.out.printf("Valor do IR: $%.2f" , ir);
		System.out.printf("\nSalario a receber: $%.2f", salario - ir);
		teclado.close();
	}

}
