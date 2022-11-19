package avaliativa;
import java.util.*;
public class fatorial {
	public static void main (String[]args) {
		
		int n,f;
		Scanner in= new Scanner (System.in);
		System.out.println("Digite o número");
		n=in.nextInt();
		f=n;
		
		while (n>
		1){
			System.out.print(n+"x");
			f=f*(n-1);
			n=n-1;
		}
		System.out.println("="+f+"");
		in.close();
	}
}
