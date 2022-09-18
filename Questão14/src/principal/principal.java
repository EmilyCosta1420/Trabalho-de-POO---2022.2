package principal;
import javax.swing.JOptionPane;
public class principal {

	public static void main(String[] args) {
		int anoAt, anoNsc, idAt, id35;
		anoNsc = Integer.parseInt(JOptionPane.showInputDialog("Em que ano você nasceu?"));
		anoAt = Integer.parseInt(JOptionPane.showInputDialog("So para ter certeza, em que ano você está?"));
		idAt = anoAt - anoNsc;
		id35 = 2035 - anoNsc;
		System.out.println("Uau! Então você tem " + idAt + "! Mas você sabia que em 2035 você estará com: " + id35);
	}
}
