import java.util.*;
public class Fatorial {
    public static void main(String[]args) {
        Scanner in = new Scanner (System.in);
        int f=1, n;
        System.out.println("Digite um numero: ");
        n = in.nextInt();
        for(;n>1;n--) {
            f=f*n;
            System.out.print(n+"x");
        }
        System.out.println(n+"="+f);
        in.close();
    }
}
