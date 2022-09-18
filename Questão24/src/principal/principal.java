package principal;
import javax.swing.JOptionPane;
public class principal {

	public static void main(String[] args) {
		/*Faça um programa que receba uma hora formada por hora e minuto
		 * em numeros reais, calcule e mostre a hora digitada apenas em
		 * minutos.
		 * @Para quatro e meia deve-se digitar 4.30;
		  @Um minuto vai de 0 a 60.*/
		double hora, h, m, conv;
		hora = Float.parseFloat(JOptionPane.showInputDialog("Entre com uma hora, no formato 00.00"));
		h = Math.ceil(hora);
		m = hora - h;
		conv = (h * 60) + (m * 60);
		conv = (double) (Math.round(conv*100.0)/100.0);
		System.out.println("A hora digitada em minutos é: " + conv);

	}
}