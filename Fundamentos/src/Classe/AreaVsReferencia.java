package Classe;

public class AreaVsReferencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double a = 2;
		double b = a;
		
		a++;
		b--;
		
		System.out.println(a + " " + b);
		
		Data d1 = new Data();
		Data d2 = d1;
		
		d1.dia = 31;
		d2.mes = 12;
		d1.ano = 2025;
		System.out.println(d1.retornoData());
		System.out.println(d2.retornoData());
		

	}

}
