package principal;
import javax.swing.JOptionPane;
public class Principal {

	public static void main(String[] args) {
		int custo_espetaculo, pre�o_convite, qtd_convites;
		custo_espetaculo= Integer.parseInt(JOptionPane.showInputDialog("Quanto custa o espet�culo teatral?"));
		pre�o_convite= Integer.parseInt(JOptionPane.showInputDialog("Quanto custa o convite?"));
		qtd_convites= custo_espetaculo /pre�o_convite;
		System.out.println("A quantidade de convites que voc� precisa vender para pagar o espet�culo �: "+qtd_convites+" convites, vai dar certo! ");
	}
}