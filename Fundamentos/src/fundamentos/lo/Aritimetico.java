package fundamentos.lo;
import java.util.*;

public class Aritimetico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero: ");
		Integer n1 = teclado.nextInt();
		
		System.out.println("Digite o segundo numero: ");
		Integer n2 = teclado.nextInt();
		
		int n3 = n1 + n2;
		int n4 = n1 - n2;
		int n5 = n1 * n2;
		int n6 = n1 / n2;
		System.out.println(n3 + " " + n4 + " " + n5 + " " + (double) n6 + "\n");
		
		teclado.close();
		
		int a = 8;
		int b = 2;
		
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a % b);

	}

}
