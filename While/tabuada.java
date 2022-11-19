package avaliativa;
import java.util.Scanner;
public class tabuada {
	public static void main (String[]args) {
		Scanner in=new Scanner (System.in);
		int i,n,resultado;
		i=1;
		System.out.println("Digite o número:");
		n=in.nextInt();
		while (i<=10) {
		resultado=n*i;
		System.out.println(n+"x"+i+"="+resultado);
		i++;
	}
		in.close();

}


}
