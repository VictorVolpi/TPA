import java.util.*;
public class Salario {
    public static void main(String[]args) {
        Scanner in = new Scanner (System.in);
        double salariomax, salarioMin=954;
        String r="S";
        while(r.equals("S")|| r.equals("s")) {
            System.out.println("Digite o salario: ");
            salariomax = in.nextDouble();
            if (salariomax>=salarioMin) {
                System.out.println("o salario está acima do salario mínimo.");
            }else {
                System.out.println("O salario está abaixo do salario mínimo.");
            }
            System.out.println("execução encerrada");
            r = in.next();
            in.close();
        }
    }
}