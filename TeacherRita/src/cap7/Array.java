package cap7;

public class Array {

	public static void main(String[] args) {
	
		int x = 10;
		int y = 20;
		int z = 30;
		
		int [] numeros = new int [3];
		numeros[0] = x;
		numeros[1] = y;
		numeros[2] = z;
		
		System.out.println(numeros[0]);
		System.out.println(numeros[1]);
		System.out.println(numeros[2]);
		
		
		for(int i = 0 ; i < 3; i++) {
			System.out.println(numeros[i]);
		}
		
		String nome [] = new String [3];
		nome[0] = "Gustavo";
		nome[1] = "Sam";
		nome[2] = "Kiara";
		
		for(int i = 0 ; i < nome.length ; i++) {
			System.out.println(nome[i]);
		}
		
	}

}