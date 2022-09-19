package fundamentos.lo;
import java.util.*;
public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite a cor da faixa");
		
		String faixa = teclado.next();
		String cor = "A cor da faixa é: ";
		
		switch (faixa.toLowerCase()) {
		case "preta": {
			
		}
		case "azul":{
		}
		break;
		case "amarela":{
		}
		break;
		case "verde":{
		}
		break;
		case "vermelha":{
		}
		break;
		default:{
			System.out.println("Valor digitado diferente!");
		}
		break;
		}
		System.out.println(cor + faixa);
		
	}

}
