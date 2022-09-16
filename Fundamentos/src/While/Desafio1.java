package While;
import java.util.*;
public class Desafio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*int contador = 1;
		
		while(contador <= 10) {
			System.out.printf("i = %d\n",contador);
			contador++;
		}
		*/

		Scanner teclado = new Scanner(System.in);
		
		String texto = "";
		
		while(!texto.equalsIgnoreCase("sair")) {
			System.out.println("Digite algo: ");
			texto = teclado.next();
		}
		
		teclado.close();
	}

}
