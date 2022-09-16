package fundamentos.lo;

import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);	
		double n1 = teclado.nextDouble();//2.0
		double n2 = teclado.nextDouble();//4.0
		double n3 = teclado.nextDouble();//7.5
		double n4 = teclado.nextDouble();//8.0
		double calculo = (n2 + n3) + (n4 + n1);
		double media = calculo / 4;

		if (media >= 7.0 && media <= 10.0) {
			System.out.printf("Aluno reprovado." 
		                               + "%.1f",media);
		} else if (media >= 5.0 && media <= 6.9) {
			System.out.printf("Aluno em exame. " 
					+"%.1f",media);
		}
		//System.out.printf("%.1f",media );
		
		double exame = 6.4;
		System.out.println("\nNota do exame: " + exame);

		exame = (media + exame) / 2;
		double mediaFim = exame;
		if (mediaFim >= 5.0 && mediaFim <= 10) {
			System.out.printf("Aluno aprovado. \nMedia Final: " 
					+ "%.1f",mediaFim);
		}
		teclado.close();

	}

}
