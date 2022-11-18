package programaPlaca;
import java.util.Scanner;
public class programaMes {
	public static void main (String[] args) {
		Scanner in = new Scanner (System.in);
				int Mes;
				System.out.println("Digite o Mes de 1 a 12");
				Mes=in.nextInt();
				//Estrutura switch-case
				switch(Mes) {
				
				case 2:
				System.out.println("28 Dias");
					break;
				case 4:
				case 6:
				case 9:
				case 11:
				System.out.println("30 Dias");
					break;
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12:
				System.out.println("31 Dias");

				}
				
				
	}
}
