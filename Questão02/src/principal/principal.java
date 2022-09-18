package principal;
import javax.swing.JOptionPane;
public class principal {

	public static void main(String[] args) {
		// Faça um programa que receba três notas, calcule e mostre a média desses números.
		int n1,n2,n3, média;
		n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero da n1: "));
		n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o nummero da n2: "));
		n3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o nummero da n3: "));
		média = (n1 + n2 + n3)/3;
		System.out.println("Sua média é: " + média);
	}
	}