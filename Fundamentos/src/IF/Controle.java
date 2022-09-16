package IF;
import java.util.*;
public class Controle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe a média: ");
		double media = teclado.nextDouble();
		
		if(media <= 10.0 && media >= 7.0) {
			System.out.println("Aluno aprovado!");
		}
		else if(media  <= 6.9 && media >= 5.0 ){
			System.out.println("Aluno de recuperação");
		}
		
		else {
			System.out.println("Aluno reprovado");
		}
		teclado.close();
	}

}
