package fundamentos.lo;
import java.util.*;
public class ExerciLog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Se eu trabalhar na terça feira e quinta
		//irei comprar uma TV de 50p, se eu trabalhar apenas
		//um dia compro a TV de 32 polegadas, se não trabalhar
		//nenhum dia, não compro nada.
		
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		System.out.println("Voce trabalhou 1 mes? ");
		boolean terca = teclado.nextBoolean();
		System.out.println("Voce trabalhou + 3 meses? ");
		boolean quinta = teclado.nextBoolean();

		if(terca == true && quinta == true) {
	          System.out.println("Voce tem direito a 20 dias. " 
	                    + terca +" " + quinta);
			}
		else if(terca != true && quinta != true) {
			System.out.println("não tem direito a ferias\n" 
					+ terca +" "+ quinta);
		}
		
		else if(terca == true && quinta != true) {
	       System.out.println("Tem direito a 3 dias.\n" 
	                    + terca +" " + quinta);
			}
		else if(terca != true && quinta == true) {
	       System.out.println("Tem direito a 3 dias.\n" 
	                    + terca +" "+ quinta);
			}
		}

	}


