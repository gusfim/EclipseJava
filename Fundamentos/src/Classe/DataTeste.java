package Classe;
import java.util.*;
public class DataTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		
		Data d1 = new Data();
        d1.dia = teclado.nextInt();
		d1.mes = teclado.nextInt();
		d1.ano = teclado.nextInt();
		
		System.out.printf("Data digitada foi: " + d1.retornoData());
		
	}

}
