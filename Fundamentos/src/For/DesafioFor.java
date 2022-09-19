package For;

public class DesafioFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String valor = "#";
		
		for(String i = "#"; !i.equals("######") ; i += "#") {
			System.out.println(valor);
			valor+= "#";
		}
		
	}

}
