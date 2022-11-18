import java.util.Scanner;
public class NovoeVelho {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int idade;
        int idadeVelho = 0;
        int idadeNovo = 0;
        String nome;
        String nomeVelho = "";
        String nomeNovo = "";
        for(int i=10;i>=1;i--){
            System.out.print("Digite o "+(10-i+1)+" nome: ");
            nome = in.next();
            System.out.print("Digite a "+(10-i+1)+" idade: ");
            idade = in.nextInt();

            if(idade >= idadeVelho){
                idadeVelho = idade;
                nomeVelho = nome;
            }
            if(idade <= idadeNovo || i==10){
                idadeNovo = idade;
                nomeNovo = nome;
            }
        }
        System.out.println("O usuario "+nomeNovo+" é o mais novo, com "+idadeNovo+" anos\nE o mais velho é "+nomeVelho+", com "+idadeVelho+" anos.");
        in.close();
    }
}