package principal;
import javax.swing.JOptionPane;
public class principal {

	public static void main(String[] args) {
		int ade, ausu, qtde;
		ade = Integer.parseInt(JOptionPane.showInputDialog("Insira a altura dos degrau: "));
		ausu = Integer.parseInt(JOptionPane.showInputDialog("Insira a sua altura: "));
		qtde = ausu/ade;
		System.out.println("Falta ainda " + qtde + " para alcançar seu objetivo!");
	}
}