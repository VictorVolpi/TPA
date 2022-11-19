package programaNota;
import java.util.Scanner; 
public class programanota {
	public static void main (String[]args) {
	Scanner in = new Scanner (System.in);
	double nota1, nota2, media, notaExame, notaMedia;
	System.out.println ("Digite a nota 1");
	nota1= in.nextDouble();
	System.out.println ("Digite a nota 2");
	nota2=in.nextDouble();
	media=(nota1+nota2)/2;
	System.out.println ("A media é:" +media);
	if (media<3) {
	System.out.println ("Reprovado");
	}else if (media>6){
	System.out.println ("Aprovado");
	}else {
	System.out.println ("Esta em Exame");
	System.out.println ("Digite a nota do exame");
	notaExame=in.nextDouble();
	notaMedia=(notaExame+media)/2;
	if (notaMedia>=6) {
	System.out.println ("A sua nova media:" +media);
	System.out.println ("Aprovado");
	}else {
		System.out.println ("A sua nova media:" +media);
		System.out.println ("Reprovado");
			in.close();
			}
		}
	}
}