package cap3;

import java.util.Scanner;

public class CalculandoMedia {

	public static void main(String[] args) {
		
		int x = 10, y = 20, z = 30, v = 40;
		
		int media = (x+y+z+v) / 4;
		System.out.println(media);
		
		System.out.println("--------------------------------------------");
		
		Scanner teclado = new Scanner(System.in);
		int valor = teclado.nextInt();
		if(valor >=0 && valor <= 1000) {
			System.out.println("Sem desconto, valor total e: " + valor);
		}
		else if(valor == 1001 && valor <= 3000) {
			System.out.println("Valor total e: " + valor * (1 - 0.05));
		}
		else{
			System.out.println("Valor total e: " + valor * (1 - 0.10));
		}
		teclado.close();
	}

}
