package fundamentos.lo;

public class Logicos {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean cond1 = true;
		boolean cond2 = 3 > 7;
		
		System.out.println(cond1 && cond2);
		System.out.println(cond1 || cond2);
		System.out.println(cond1 ^ cond2);
		System.out.println(!cond1);
		System.out.println(!cond2);
		
		System.out.println("\nTabela verdade && (AND)");
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		
		System.out.println("\nTabela verdade || (OU)");
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		System.out.println("\nTabela verdade ^ (XOR)");
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ true);
		System.out.println(false ^ false);
		
		System.out.println("\nTabela verdade ! (NEGACAO)");
		System.out.println("Digitei true, porem com a negacao " + 
		             "ele muda para falso " + !true);
		System.out.println("Digitei false, porem com a negacao " + 
	             "ele muda para true " + !false);


	}

}
