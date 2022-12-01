package Vetores;
import java.util.*;
public class VetorQuadrado {
	public static void main (String[]args) {
		Scanner in = new Scanner (System.in);
		final int TAM=10;
		int a[], b[], i;
		a = new int [TAM];
		b = new int [TAM];
		for (i=0; i<10; i++) {
			System.out.println("Digite o "+(i+1)+" o. número");
			a[i] = in.nextInt();
			b[i] = a[i]*a[i];
			System.out.println(b[i]);
		}
	}
}
