package principal;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		
    double vlrS, qtdKw, vlrKw, vlrR, desc, vlrD; 
    
    Scanner entrada = new Scanner (System.in);
    
    System.out.println("Qual é o seu salário Minimo atual?");
    
        vlrS = entrada.nextDouble();
     
    System.out.println("Quanto foi consumido de quilowatt na residencia?");
    
        qtdKw = entrada.nextDouble();
    
    vlrKw = vlrS/5;
    vlrR = vlrKw*qtdKw;
    desc = vlrR*15/100;
    vlrD = vlrR - desc;
    
    System.out.println("Será cobrado do seu salário cada quilowatt consumido pela sua residencia: R$"+ vlrKw);
    System.out.println("O valor da sua conta é: R$"+ vlrR +". Com o seu consumo de "+ qtdKw);
    System.out.println("Com o desconto de 15%, o valor será de: R$"+ desc);                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             

    		 
    		
    		
    		
	}

}
