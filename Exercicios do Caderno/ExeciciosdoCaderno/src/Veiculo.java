import java.util.Scanner;
public class Veiculo {
	public static void main(String[] args) {
		double veiculo,ipva;
		Scanner in=new Scanner (System.in);
		System.out.println("Digite o valor do veiculo");
		veiculo=in.nextDouble();
		ipva= veiculo*4/100;
		System.out.println("o ipva do veiculo é:"+ ipva);
		in.close();
	}

}

