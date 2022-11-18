import java.util.Scanner;
public class Blocos {
	public static void main(String[] args) {
		double a, resultado, resultadob;
		Scanner in=new Scanner (System.in);
		System.out.println("Digite o numero");
		a=in.nextDouble();
		resultado= a - 1; 
		resultadob= a +1;
		System.out.println("o antecesor  do numero é:"+ resultado + "\ne o sucessor é: " + resultadob);
		in.close();
	}

}
