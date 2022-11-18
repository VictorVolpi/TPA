package programaTriangulo;
import java.util.Scanner;
public class programaTriangulo {
	public static void main (String[] args) {
		Scanner in = new Scanner (System.in);
		double a, b,c;
		System.out.println("Digite o valor de a");
		a=in.nextDouble();
		System.out.println("Digite o valor de b");
		b=in.nextDouble();
		System.out.println("Digite o valor de c");
		c= in.nextDouble();
		if(a>b+c || b>a+c || c>a+b) {
			System.out.println("Não é um triângulo");
		}else if (a==b && b==c){
			System.out.println("É um triângulo equilátero ");
		}else if(a!=b && b!=c && a!=c ){
			System.out.println("É um triângulo escaleno");
		}else {
			System.out.println("É um triângulo isosceles");
			in.close();
			
			
		}
	}
}