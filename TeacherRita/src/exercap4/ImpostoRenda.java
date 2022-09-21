package exercap4;

import java.util.Scanner;

public class ImpostoRenda {

	public static void main(String[] args) {
		//IR = salario * alíquota - dedução
		
		Scanner teclado = new Scanner(System.in);
		double salario = teclado.nextDouble();
		
		double aliquota;	
		double ir ;
		double salarioFinal;
		
		if(salario <= 1903.98) {
			System.out.println("Salario Isento " + salario);
		}
		else if(salario >= 1903.99 && salario <= 2826.65) {
			aliquota = (salario * 7.5) / 100;
			ir = (aliquota - 142.80);
			salarioFinal = salario - (aliquota - 142.80) ;
			System.out.println("IR 7.5%");
			System.out.printf("Salario a receber: $%.2f ",salarioFinal);
			System.out.printf("\nValor a pagar de IR: " 
			                             + "%.2f" ,ir);
		}
		else if(salario >= 2826.66 && salario <= 3751.05) {
			aliquota = (salario * 15.0) / 100;
			ir = (aliquota - 354.80);
			salarioFinal = salario - (aliquota - 354.80) ;
			System.out.println("IR 15%");
			System.out.printf("Salario a receber: $%.2f ",salarioFinal);
			System.out.printf("\nValor a pagar de IR: " 
			                             + "%.2f" ,ir);
		}
		else if(salario >= 3751.06 && salario <= 4664.68) {
			aliquota = (salario * 22.5) / 100;
			ir = (aliquota - 636.13);
			salarioFinal = salario - (aliquota - 636.13) ;
			System.out.println("IR 22.5%");
			System.out.printf("Salario a receber: $%.2f ",salarioFinal);
			System.out.printf("\nValor a pagar de IR: " 
			                             + "%.2f" ,ir);
		}
		
		else {
			aliquota = (salario * 27.5) / 100;
			ir = (aliquota - 869.36);
			salarioFinal = salario - (aliquota - 869.36) ;
			System.out.println("IR 27.5%");
			System.out.printf("Salario a receber: $%.2f ",salarioFinal);
			System.out.printf("\nValor a pagar de IR: " 
			                             + "%.2f" ,ir);
		}

	}

}
