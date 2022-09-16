package fundamentos.lo;

import java.util.*;

public class Desafio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe o primeiro salario");
		String s1 = teclado.next().replace(",", ".");
		
		System.out.println("Informe o segundo salario");
		String s2 = teclado.next().replace(",", ".");
		
		System.out.println("Informe o terceiro salario");
		String s3 = teclado.next().replace(",", ".");
		
		double salario1 = Double.parseDouble(s1);
		double salario2 = Double.parseDouble(s2);
		double salario3 = Double.parseDouble(s3);
		
		double media = (salario1 + salario2 + salario3) /3;
		System.out.printf("A media salarial e " + "%.2f" , media);		
		teclado.close();
		
		

	}

}
