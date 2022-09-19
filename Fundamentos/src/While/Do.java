package While;
import java.util.*;
public class Do {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		String texto = "";
		
		do{
			System.out.println("Voce precisa falar as palavras");
			texto = teclado.next();
		}
		while(!texto.equalsIgnoreCase("sair"));
		
		System.out.println("Obrigado!");
	        teclado.close();
	}
	

}
