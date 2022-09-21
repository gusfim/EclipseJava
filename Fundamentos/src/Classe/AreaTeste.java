package Classe;

public class AreaTeste {

	public static void main(String[] args) {

		Area a = new Area(10);
		//a.pi = 10;
		
		
		Area b = new Area(5);
		//b.pi = 5;
		
		Area.pi = 3.1415;
		
		System.out.println(a.area());
		System.out.println(b.area());
		

}

}
