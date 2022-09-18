package principal;
import java.util.Scanner;
public class principal{

	public static void main(String[] args) {
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
	/*System.out.println("A parte inteira de" + real + " é: " + i);
	System.out.println("A parte fracionária de" + real +"é:" + f);
	System.out.println("O arredondamento de" + real + " é:" + a);*/
	}
}
