import java.util.Scanner;
public class circunferencia { 
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double area, r;
		System.out.println("Digite o Raio da Circunfer�ncia:");
		r = in.nextDouble();
		area = 3.14 * (r * r);
		System.out.println("A �rea da circunfer�cia � " + area);
		in.close();
	}
}

