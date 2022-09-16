package fundamentos;

public class Temperatura {

	public static void main(String[] args) {
		// (°F - 32) * 5/9 = °C
		final double fator = 5.0 / 9.0;
		final int ajuste = 32;
		
		double fare = 86;
		double celsius = (fare - ajuste) * fator;
		System.out.println(celsius);
		
		fare = 140;
		celsius = (fare - ajuste) * fator;
		System.out.println(celsius);
	}

}
