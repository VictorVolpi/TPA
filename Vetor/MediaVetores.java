package Vetores;
import java.util.*;
public class MediaVetores {
	public static void main (String[]args) {
		Scanner in= new Scanner (System.in);
		final int TAM=10;
		int a[],nm=0, m, i;
		a = new int [TAM];
		for (i=0; i<TAM; i++) {
			System.out.println("Digite o "+(i+1)+".o número");
			a[i] = in.nextInt();
			nm = nm + a[i];
		}
		for (i=0; i<TAM; i++) {
			if (i==0){
				System.out.print("[ "+a[i]+", ");
			}else if (i==9){
				System.out.println(a[i]+" ]");
			}else {
			System.out.print(a[i]+", ");
			}
		}
		m = nm/TAM;
		System.out.println("A média é "+m);
	}

}
