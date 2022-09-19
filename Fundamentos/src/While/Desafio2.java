package While;

import java.util.*;

public class Desafio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		int nota = 0;
		double notaAtual = 0;
		double total = 0;

		while (notaAtual != -1) {
			System.out.println("Informe a nota: ");
			notaAtual = teclado.nextDouble();
			if (notaAtual <= 10 && notaAtual >= 0) {
				total += notaAtual;
				nota++;
			}
			else if(notaAtual != -1){
				System.out.println("Nota Invalida \n");
			}

		}
		double media = total / nota;
		System.out.println("Media = " + media);
		teclado.close();
	}

}
