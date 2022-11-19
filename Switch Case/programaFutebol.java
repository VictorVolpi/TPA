package programaFutebol;
import java.util.Scanner;
public class programaFutebol {
	public static void main (String[] args) {
		Scanner in = new Scanner (System.in);
				int idade;
				System.out.println("Digite sua Idade");
				idade=in.nextInt();
				//Estrutura switch-case
				switch(idade) {
				
				case 6:
				System.out.println("Dente de Leite");
					break;
				case 7:
				System.out.println("Junior");
					break;
				case 8:
				System.out.println("Junior Max");
						break; 
				case 9: 
				System.out.println("Junior Master");
						break;	
				case 10: 
				System.out.println("Master");
							break;
				case 11:
					System.out.println("A escola nao permite essa idade em diante ");
				}
				
	}
}

