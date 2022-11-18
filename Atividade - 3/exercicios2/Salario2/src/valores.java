import java.util.Scanner;
public class valores{
    public static void main(String[]args){
        double valor,dobro,triplo;
        Scanner in=new Scanner(System.in);
        System.out.println("Digite o valor");
        valor=in.nextDouble();
        dobro=valor*2;
        triplo=valor*3;
        System.out.println("o dobro do numero é:"+dobro);
        System.out.println("o triplo do numero é:"+triplo);
        in.close();
   }
}
