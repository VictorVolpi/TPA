import java.util.Scanner;
public class ValoresInteiros {
	public static void main(String[] args) {
		double a,b,c,soma;
		Scanner in=new Scanner (System.in);
		System.out.println("Digite o valor a");
		a=in.nextDouble();
		System.out.println("Digite o valor b");
		b=in.nextDouble();
		System.out.println("Digite o valor c");
		c=in.nextDouble();
		soma=a * a + b * b + c * c;
		System.out.println("a soma do quadrado dos valores é:"+soma);
		in.close();
	}

}
