package programaIMC;
import java.util.Scanner; 
public class programaImc {
	public static void main (String[]args) {
	Scanner in = new Scanner (System.in);
	double peso, altura, imc;
	System.out.println ("Digite o peso");
	peso= in.nextDouble();
	System.out.println ("Digite a altura");
	altura=in.nextDouble();
	imc=peso/(altura*altura);
	System.out.println ("Seu IMC é:"+imc);
	if (imc<18.5) {
	System.out.println ("Excesso de magreza");
	}else if (imc<25){
	System.out.println ("Peso Bom");
	}else if (imc<30){
	System.out.println ("Execesso de Peso");
	}else if (imc<35){
	System.out.println ("obesidade grau 1");
	}else if (imc<40){
	System.out.println ("obesidade grau 2");
	}else if (imc>40){
	System.out.println ("obesidade grau 3");
	in.close();
	}
}
}