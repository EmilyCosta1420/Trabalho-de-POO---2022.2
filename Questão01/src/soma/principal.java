package soma;
import javax.swing.JOptionPane; 
public class principal {

	public static void main(String[] args) {
		// Faça um programa que receba quatro número inteiros, calcule e mostre a soma desses números
		int n1, n2, n3, n4, soma;
		n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número n1: ")); 
		n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número n2: ")); 
		n3 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número n3: ")); 
		n4 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número n4: "));
		soma = (n1 + n2 + n3 + n4);
		System.out.println("A soma dos quatro digitos é igual a: " + soma);
		
	}

}
