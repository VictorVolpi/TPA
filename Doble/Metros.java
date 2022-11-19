import java.util.Scanner;
public class Metros {
	public static void main(String[] args) {
		double met, km;
		Scanner in=new Scanner (System.in);
		System.out.println("Digite o valor em metros a serem convertidos");
		met=in.nextDouble();
		km= met/1000;
		System.out.println("o valor em quilometro é:"+ km);
		in.close();
	}

}
