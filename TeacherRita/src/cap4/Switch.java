package cap4;

public class Switch {

	public static void main(String[] args) {

		char vogal = 'I';
		
		switch (vogal) {
		case 'A':
			System.out.println("Vogal A");
			break;

		case 'E':
			System.out.println("Vogal E");
			break;

		case 'I':
			System.out.println("Vogal I");
			break;

		case 'O':
			System.out.println("Vogal O");
			break;

		case 'U':
			System.out.println("Vogal U");
			break;
			default:
				System.out.println("Nao a vogal definida");
		}

	}

}
