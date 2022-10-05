package cap7;

public class ArrayDimension {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [][]cidade = {{"Sao Paulo" , "Ribeirao Preto"},
				{"Minas Gerais", "Diamantina"},
				{"Curitiba" , "Londrina"}};
		
		for(int i = 0; i < cidade.length; i++ ) {
			for(int j = 0; j < cidade[i].length ; j++) {
			System.out.println(cidade[i][j]);
			}
		}
		System.out.println("================================================");
		for (String[] cidades : cidade) {
			for(String c: cidades) {
				System.out.println(c);
			}
		}
	}

}
