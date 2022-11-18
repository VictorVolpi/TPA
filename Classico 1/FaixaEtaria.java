import java.util.Scanner;
public class FaixaEtaria {
	public static void main (String[]args) {
		Scanner ler=new Scanner(System.in);
		int i,idade,qtd1=0,qtd2=0,qtd3=0,qtd4=0,qtd5=0, qtdTotal;
		double porcen1,porcen2, porcen3, porcen4, porcen5;
		for (i=1;i<=15;i++) {
			System.out.println("Digite a idade do "+i+" pessoa:");
			idade=ler.nextInt();
			if(idade<=15) {
				qtd1=qtd1+1;
			}else if (idade<=30) {
				qtd2=qtd2+1;
			}else if(idade<=45) {
				qtd3=qtd3+1;
			}else if(idade<=60) {
				qtd4=qtd4+1;
			}else {
				qtd5=qtd5+1;
			}
		}
		qtdTotal=qtd1+qtd2+qtd3+qtd4+qtd5;
		porcen1=(qtd1*100)/qtdTotal;
		porcen2=(qtd2*100)/qtdTotal;
		porcen3=(qtd3*100)/qtdTotal;
		porcen4=(qtd4*100)/qtdTotal;
		porcen5=(qtd5*100)/qtdTotal;
		System.out.println("A quantidade de pessoas na faixa etaria de 1 ano ate 15 anos e "+qtd1+" e a sua porcentagem e "+porcen1+"5");
		System.out.println("A quantidade de pessoas na faixa etaria de 16 anos ate 30 anos e "+qtd2+" e a sua porcentagem e "+porcen2+"5");
		System.out.println("A quantidade de pessoas na faixa etaria de 31 anos ate 45 anos e "+qtd3+" e a sua porcentagem e "+porcen3+"%");
		System.out.println("A quantidade de pessoas na faixa etaria de 46 anos ate 60 anos e "+qtd4+" e a sua porcentagem e "+porcen4+"%");
		System.out.println("A quantidade de pessoas na faixa etaria acima de 61 anos e "+qtd5+" e a sua porcentagem "+porcen5+"%");
		ler.close();
	}
}