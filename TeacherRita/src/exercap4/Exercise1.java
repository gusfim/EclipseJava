package exercap4;

import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		double n1 = teclado.nextDouble();
		double n2 = teclado.nextDouble();
		double n3 = teclado.nextDouble();
		
		double media = (n1+n2+n3)/3;
		
		if(media > 7 && media <= 10) {
			System.out.printf("Aluno aprovado %.2f", media);
		}
		else if(media >= 5 && media <= 7) {
			System.out.printf("Aluno em recuperação %.2f", media);
		}
		else {
			System.out.printf("Aluno reprovado %.2f",  media);
		}
		teclado.close();
	}

}
