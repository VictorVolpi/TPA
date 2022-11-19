import java.util.*;
public class Inss {
    public static void main(String[]args) {
        Scanner in = new Scanner (System.in);
        double salario, inss, i=1;
        do {
            System.out.println("Digite o seu valor:");
            salario=in.nextDouble();
            if(salario<2000) {
                inss=salario*0.085;
                }
            else{
                inss=salario*0.11;
            }
            System.out.println("O Desconto do Inss e: "+inss);
            i++;
        } while(i<=4);
        in.close();
    }
}