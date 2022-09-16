package principal;
import java.util.Scanner;
public class principal {

	public static void main(String[] args) {
     	 // Faça um programa que receba um número real, calcule e mostre:
		float real;
		int i;
		float f, a;
		Scanner numero = new 
		Scanner(System.in);
		System.out.println("Digite um número real: ");
        real = numero.nextFloat();
        i = Math.round(real);
        f = real - i;
        a = Math.round(real);
        System.out.println("A parte inteira de " + real + " è: " + i);
        System.out.println("A parte fracionária de " + real + " è: " + f);
        System.out.println("O arredondamento de " + real + " è: " + a);
	}

}
