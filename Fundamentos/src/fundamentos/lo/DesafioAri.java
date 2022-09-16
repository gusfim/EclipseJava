package fundamentos.lo;

public class DesafioAri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		int a = 2 + 3 * 4;
		double b = Math.pow(a, 2);
		System.out.println(b);*/
		
		//Encontrar o valor da primeira expressão.
		int n1 = 3+2;
		int n2 = 6 * n1;
		double n3 = Math.pow(n2, 2);		
		int n4 = 3 * 2;		
		double n5 = n3 / n4;		
		System.out.println(n5);
		
		//Encontrar o valor da segunda expressão.
		int v1 = 1-5;
		int v2 = 2-7;
		int v3 = v1 * v2;
		double v4 = v3 / 2;
		double v5 = Math.pow(v4, 2);
		System.out.println(v5);
		
		//Resolvendo a primeira equação.
		double r1 = n5 - v5;
		System.out.println(r1);		
		double r2 = Math.pow(10, 3);		
		double r3 = Math.pow(r1, 3) / r2;
		System.out.println((int)r3);
		
	}

}
