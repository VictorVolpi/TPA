package avaliativa;
import java.util.Scanner;
public class Soma {
	public static void main (String[]args) {
		Scanner in=new Scanner (System.in);
		int i,soma;
		i=1;
		soma=0;
		while (i<=100) {
			soma= soma+i;
			i++;
		System.out.println("A soma é:"+soma+",");
	}
		in.close();

	}


}
