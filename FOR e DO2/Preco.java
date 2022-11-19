import java.util.*;
public class Preco {
    public static void main(String[]args) {
        Scanner in = new Scanner (System.in);
        double precoProduto, margemPreco, precoVenda;
        String v;
        do {
            System.out.println("Digite o preço de custo do objeto: ");
            precoProduto = in.nextDouble();
            System.out.println("Digite em porcentagem a margem de seu lucro: ");
            margemPreco = in.nextDouble();
            precoVenda = precoProduto+(precoProdutomargemPreco/100);
            System.out.println("Para voce lucrar "+margemPreco+"% sobre R$"
                    +precoProduto+" você deve vender por R$"+precoVenda);
            System.out.println("Voce gostaria de continuar sua execucao?");
            v = in.next();
        } while (v.equals("S")|| v.equals("s"));
        System.out.println("execucao encerrada");
        in.close();
    }
}