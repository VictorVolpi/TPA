import java.util.Scanner;
public class circunferencia { 
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double area, r;
		System.out.println("Digite o Raio da Circunferência:");
		r = in.nextDouble();
		area = 3.14 * (r * r);
		System.out.println("A área da circunferêcia é " + area);
		in.close();
	}
}

