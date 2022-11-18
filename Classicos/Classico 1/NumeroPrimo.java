import java.util.Scanner;
public class NumeroPrimo {
	public static void main(String[]args) {
		Scanner ler=new Scanner(System.in);
		int r, n,i=1,qtd=0;
		System.out.println("Digite o numero para saber se ele e primo:");
		n=ler.nextInt();
		do {
			r=n%i;
			if(r==0) {
				qtd=qtd+1;
			}
			i++;
		}while(i<=n);
		if(qtd==2) {
			System.out.println(n+" e primo");
		}else {
			System.out.println(n+" nao e primo.");
		}
		ler.close();
	}
}