import java.util.*;
public class MaisVeMaisNo {
    public static void main(String[]args) {
        Scanner in = new Scanner (System.in);
        int idade, maiorIdade, menorIdade, i=1;
        String nome, maiorNome, menorNome;
        System.out.println("Digite seu nome: ");
        nome=in.next();
        System.out.println("Digite sua idade: ");
        idade=in.nextInt();
        maiorNome=nome;
        	maiorIdade=idade;
        		menorNome=nome;
        			menorIdade=idade;
        						while (i<10) {
        							i++;
        								System.out.println("Digite um nome: ");
        							nome=in.next();		
        						System.out.println("Digite uma idade: ");
        					idade=in.nextInt();
        				if(idade>=maiorIdade) {
        			maiorNome=nome;
                maiorIdade=idade;
          }else if (idade<=menorIdade) {
                menorIdade=idade;
                	menorNome=nome;
            }
        }
        System.out.println(maiorNome+" e a pessoa mais velha com"+maiorIdade+" anos.");
        System.out.println(menorNome+" e a pessoa mais nova com "+menorIdade+" anos");
        in.close();
    }
}