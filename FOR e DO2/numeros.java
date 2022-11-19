import java.util.*;
public class numeros {
    public static void main(String[]args) {
        Scanner in = new Scanner (System.in);
        double n;
        String r;
        for(r="S";r.equals("S") || r.equals("s") {
            System.out.println("Digite o numero: ");
            n = in.nextDouble();
            if(n>0) {
                System.out.println(" é positivo.");
            }else if(n==0) {
                System.out.println(" é neutro.");
            }else {
                System.out.println(" é negativo.");
            }
            System.out.println("execução encerrada");
            r = in.next();
        }
        in.close();
    }
}