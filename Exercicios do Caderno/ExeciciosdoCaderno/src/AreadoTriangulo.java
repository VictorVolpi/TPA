import java.util.Scanner;
public class AreadoTriangulo {
	public static void main (String []args) {
		double base,altura,area;
		Scanner in=new Scanner (System.in);
		System.out.println ("Digite a Base");
		base=in.nextDouble();
		System.out.println("Digite Altura"); 
		altura= in.nextDouble();
		area=(base * altura) /2;
		System.out.println("A �rea do triangulo �: " + area);
		in.close();
		
	}

}
