package principal;
import javax.swing.JOptionPane;
public class principal {

	public static void main(String[] args) {
		
		float num1,num2,r1,r2; 
		num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro n�mero: "));
		num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo n�mero: "));
		r2 = (float) Math.pow (num2, num1);
		r1 = (float) Math.pow (num1, num2);
		System.out.println("Seu r1 �: " + r1 + " E seu r2 �: " + r2);
		
	}
	
}