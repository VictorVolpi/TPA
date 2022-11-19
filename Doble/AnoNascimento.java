import java.util.Scanner;
public class AnoNascimento {
	public static void main (String []args) {
		double nascimento,atual,idade;
		Scanner in=new Scanner (System.in);
		System.out.println ("Digite a data de nascimento");
		nascimento=in.nextDouble();
		System.out.println("Digite o ano atual"); 
		atual= in.nextDouble();
		idade=(atual-nascimento);
		System.out.println("A idade atual é: " + idade);
		in.close();
		
	}

}