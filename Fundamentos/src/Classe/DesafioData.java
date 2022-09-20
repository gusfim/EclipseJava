package Classe;

public class DesafioData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConstrutorData d1 = new ConstrutorData(5,11,2022);
		
		
		ConstrutorData d2 = new ConstrutorData();

		System.out.printf("Data padrão: " +String.format("%02d",d2.dia) 
		    + "/" + String.format("%02d", d2.mes) + "/" + d2.ano + "\n");
		
		System.out.printf("Data digitada: %02d/%02d/%d" , d1.dia , d1.mes , d1.ano);
		

	}

}
