package fundamentos.lo;

public class Unario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1;
		int b = 2;
		
		a++;
		a--;
		System.out.println(a);
		
		b++;
		--b;		
		System.out.println(b);
		
		System.out.println("Mini Desafio: ");
		System.out.println(++a == b--);
		System.out.println(a);
		System.out.println(b);

	}

}
