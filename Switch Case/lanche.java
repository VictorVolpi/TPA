package lanche;
import java.util.Scanner;
public class lanche {
	public static void main (String []args) {
		Scanner in = new Scanner (System.in);
		int n;
			System.out.println("Digite o código do lanche");
			n=in.nextInt();
			//Estrutura switch-case
			switch(n) {
			case 1:
				System.out.println("Cachorro quente R$ 8,00");
				break;
			case 2:
				System.out.println("Cheesebuger R$ 12,00");
				break;
			case 3:
				System.out.println("X-salada R$ 15,00");
				break;
			case 4:
				System.out.println("Misto quente  R$ 11,00");
				break;
			case 5:
				System.out.println("Pão na chapa R$ 6,00");
				break;
				default:
					System.out.println("Código invalido");
			}
	}
}
