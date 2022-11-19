package avaliativa;
import java.util.*;
public class potencia {
	public static void main (String[]args) {
		int b,e,p,i;
		i=1;
		p=0;
		Scanner in=new Scanner (System.in);
		System.out.println("Digite a base:");
		b=in.nextInt();
		System.out.println("Digite o expoente:");
		e=in.nextInt();
		p=b;
		while (i<e) {
			p=p*b;
			i++;
		}
		System.out.println(" potencia é:"+p);
	}

}
