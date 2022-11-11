package exercicios;
import java.util.*;
public class Idade {
	public static void main(String args []) {
		double i=1+1,ano,nasc,idade,cont;
		Scanner in= new Scanner (System.in);
		do {
			System.out.println("Digite o ano atual:");
			ano=in.nextDouble();
			System.out.println("Digite o ano de nascimento:");
			nasc=in.nextDouble();
			idade=ano-nasc;
			if(idade>18) {
				System.out.println(idade+"o usuário é maior de idade");
			}else {
				System.out.println(idade+"o usuário é menor de idade");
			}
			System.out.println("Para continuar o programa digite 1 ou digite 2 para sair");
			cont=in.nextDouble();
			i++;
		}while(cont==1);
		System.out.println("Volte sempre!");
		
				
			}
			
		}
		




			
		
	

