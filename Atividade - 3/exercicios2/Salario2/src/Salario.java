import java.util.Scanner;
public class Salario{
    public static void main(String[]args){
        double salario,desconto,descontofinal;
        Scanner in= new Scanner(System.in);
        System.out.println("Digite o salario bruto");
        salario= in.nextDouble();
        desconto= salario/100*6;
        descontofinal= salario-desconto;
        System.out.println("o salario final é:" + descontofinal);
        in.close();
   }
}