import java.util.Scanner;
public class idadePessoas {
	public static void main (String[]args) {
		Scanner ler=new Scanner(System.in);
		int idade, idadeMaisVelho=-1, idadeMaisNovo=1000, i=1 ;
		double media, somaIdades=0;
		do {
			
			System.out.println("Digite a idade do "+i+" usuario:");
			idade=ler.nextInt();
			somaIdades=somaIdades+idade;
			if(idade>idadeMaisVelho) {
				idadeMaisVelho=idade;
			}else if(idade<idadeMaisNovo){
				idadeMaisNovo=idade;
			}
			
			i++;
		}while (i<=10);
		media=somaIdades/10;
		System.out.println ("A media de idades e "+media);
		System.out.println("A idade mais velha e "+idadeMaisVelho+" anos, e a idade mais novo e "+idadeMaisVelho+" anos");
		ler.close();
	}
}