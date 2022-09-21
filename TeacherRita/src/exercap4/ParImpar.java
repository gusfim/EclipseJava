package exercap4;

public class ParImpar {

	public static void main(String[] args) {

		int x = 1;

		for (; x <= 100; x++) {
			if (x % 2 == 0) {
				System.out.println("Numeros pares " + x);
			}
		}

		System.out.println("----------------------------------------------");

		int z = 1520;
		boolean numero = z % 2 == 0;

		if (numero) {
			System.out.println("\nNumero par " + z);
		} else {
			System.out.println("\nNumero Impar: " + z);
		}
	}

}
