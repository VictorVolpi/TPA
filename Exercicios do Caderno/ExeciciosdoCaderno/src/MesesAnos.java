import java.util.Scanner;
public class MesesAnos {
	public static void main (String []args) {
		double dias,diaMeses,diasAnos;
		Scanner in=new Scanner (System.in);
		System.out.println ("Digite a quantidade de dias a serem convertidos");
		dias=in.nextDouble();
		diaMeses=dias/30;
		diasAnos=dias/365;
		System.out.println("Numero de dias em meses e anos é:"+ diaMeses + diasAnos);
		in.close();
		
	}

}
