import java.util.Scanner;
public class tabuada {
    public static void main(String[]args) {
        Scanner in = new Scanner (System.in);
        int i, m, t;
        System.out.println("Digite um numero inteiro: ");
        m = in.nextInt();
        for(i=1; i<=10; i++) {
            t = m*i;
            System.out.println(m+" x "+i+" = "+t);
        }
        in.close();
    }
}