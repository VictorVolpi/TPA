package exercicios;
import java.util.Scanner;
public class Multiplo {
	public static void main(String[] args) {
		for(int i=1;i<=100;i++) {
			if(i%10==0) {
				System.out.println(i+" - Multiplo de 10");
			}
		}
	}
}