import java.util.*;
public class Idade {
	public static void main(String args []) {
		Scanner in= new Scanner (System.in);
		int i= 1,anoAtual,anoNasc,idade,sim,nao;
		System.out.print("Digite o ano atual: ");
		anoAtual = in.nextInt();
		System.out.print("Digite o ano de nascimento do usuario :");
		anoNasc = in.nextInt();
		idade = anoAtual-anoNasc;
		System.out.print("idade: "+idade+"anos");
		
	}
}