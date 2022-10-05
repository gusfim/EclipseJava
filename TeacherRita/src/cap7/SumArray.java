package cap7;

public class SumArray {
	static double somar(double a, double b, double c){
		return a + b + c;
	}
	
	static double somar(double[]numeros) {
		double result = 0;
		for(double d : numeros) {
			result += d;
		}
		return result;
	}
	
	public static void main(String[] args) {
	
		double result = somar(new double [] {2,10,4,3});
		
		System.out.println("First result: " + result);
		System.out.println("Second result: " + somar(5,6,7));
		System.out.println("Thirth result: " + somar(new double[]{20,10,40,30}));
	}


}
