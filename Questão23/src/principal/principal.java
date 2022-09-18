package principal;
import java.util.Scanner;
public class principal{

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	double real, i,f, a;
	System.out.println("Digite um número: ");
	real = sc.nextDouble();
	i = (int) real;
	f = (float) real - i;
	a = Math.round(real);
	System.out.format("A parte inteira do número é: %.0f",i);
	System.out.format("A parte fracionária do número é: %.2f",f);
	System.out.println("A parte inteira do número é:" + a);
		
	}
}

