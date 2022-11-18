import java.util.Scanner;

public class Inss {
    public static void main(String[] args) {
        double salario = 0;
        double desc = 0;
        Scanner in = new Scanner(System.in);
        for(int i=4;i>=1;i--){
            System.out.print("Digite o salario: ");
            salario = in.nextInt();
            if(salario < 2000){
                desc = 0.085;
            }else{
                desc = 0.11;
            }
            salario = salario - (salario*desc);
            System.out.printf("O salario final sera de: %.2f %n", salario);
        }
        in.close();
    }
}