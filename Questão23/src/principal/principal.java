package principal;
import java.util.Scanner;
public class principal {

	public static void main(String[] args) {
     	 // Fa�a um programa que receba um n�mero real, calcule e mostre:
		float real;
		int i;
		float f, a;
		Scanner numero = new 
		Scanner(System.in);
		System.out.println("Digite um n�mero real: ");
        real = numero.nextFloat();
        i = Math.round(real);
        f = real - i;
        a = Math.round(real);
        System.out.println("A parte inteira de " + real + " �: " + i);
        System.out.println("A parte fracion�ria de " + real + " �: " + f);
        System.out.println("O arredondamento de " + real + " �: " + a);
	}

}
