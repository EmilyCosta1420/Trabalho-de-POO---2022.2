package principal;
import javax.swing.JOptionPane;
public class principal {

	public static void main(String[] args) {
	float ing, custo, qtd;
	custo = Float.parseFloat(JOptionPane.showInputDialog("Olá senhor@ empreendedor@! Insira o custo beneficio de seu espetáculo(no modelo 00.00):"));
	ing = Float.parseFloat(JOptionPane.showInputDialog("Agora insira o valor de seus ingressos(no modelo 00.00):"));
	qtd = custo/ing;
	System.out.println("Para alcançar o custo previsto, será necessário vender " + qtd + " ingressos!");

	}

}
