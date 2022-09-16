package principal;
import javax.swing.JOptionPane; 
public class principal {

	public static void main(String[] args) {
		int sal, salN;
		String nome = JOptionPane.showInputDialog("Insira seu nome. ");
		sal = Integer.parseInt(JOptionPane.showInputDialog("Bem vindo, " + nome + " ! Agora insira seu salário "));
		salN = sal + sal * 25/100;
		System.out.println("O sistema indica que seu desempenho é alto, parabéns! Você ganhou um aumento de 25%\nSeu salário: " + salN);
	}

}
