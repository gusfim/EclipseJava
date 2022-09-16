package IF;

import java.util.*;

public class Semana {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Por favor digite o dia da semana: ");
		String semana = teclado.next();

		if (semana.equalsIgnoreCase("segunda")) {
			System.out.println("1");
		} else if ("terça".equalsIgnoreCase(semana)
				|| "terca".equalsIgnoreCase(semana)
				|| "terça-feira".equalsIgnoreCase(semana)
				||"terca-feira".equalsIgnoreCase(semana)) {
			System.out.println("2");
		} else if (semana.equalsIgnoreCase("quarta")) {
			System.out.println("3");
		} else if (semana.equalsIgnoreCase("quinta")) {
			System.out.println("4");
		} else if (semana.equalsIgnoreCase("sexta")) {
			System.out.println("5");
		} else if (semana.equalsIgnoreCase("sábado")) {
			System.out.println("6");
		} else if(semana.equalsIgnoreCase("domingo")) {
			System.out.println("7");
		}
		else {
			System.out.println("Não existe esse dia");
		}

		teclado.close();

	}

}
