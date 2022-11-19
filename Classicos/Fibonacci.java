import java.util.Scanner;
public class Fibonacci {
	public static void main (String[]args) {
		Scanner ler=new Scanner (System.in);
		int n, valor1=0, valor2=1, i=1, pValor=1;
		System.out.println ("Digite quantos numeros voce quer ver da série de Fibonacci:");
		n=ler.nextInt();
		do {
			System.out.println (pValor);
			pValor=valor1+ valor2;
			valor1= valor2;
			 valor2=pValor;
			i++;
		}while (i<=n);
		ler.close();
	}
}