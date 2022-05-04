package p1;

import javax.swing.JOptionPane;

public class Main {

	public static double CalculaArea (double base, double altura) {
		double area = base*altura;
		return area;
	}

	public static double CalculaPerimetro (double base, double altura) {
		return 2 * base + 2 * altura;	
	}

				
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int altura=0;
		int base=0;
		double a = CalculaArea(base, altura);
		
		altura = Integer.parseInt(JOptionPane.showInputDialog("Informe a altura "));
		base = Integer.parseInt(JOptionPane.showInputDialog("informe a base: "));
		JOptionPane.showMessageDialog(null, "A sua Área calculada é: " + a);
		
		JOptionPane.showMessageDialog(null, "Seu perímetro é: " + CalculaArea(base, altura));
	}

}
