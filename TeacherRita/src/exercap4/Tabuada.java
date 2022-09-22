package exercap4;

public class Tabuada {

	public static void main(String[] args) {
		int x = 1;
		for(; x <=10; x++) {
			System.out.println("Tabuada do " + x);
			for(int j = 1; j <= 10; j++) {
				System.out.println(x + "X" + j + "=" + x * j);
			}
		}

	}

}
