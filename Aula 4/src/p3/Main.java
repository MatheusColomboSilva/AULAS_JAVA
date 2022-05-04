package p3;

import javax.swing.JOptionPane;

public class Main {
	public static double Soma(double num, double ndois) {
		double so = num+ndois;
		return so;
	}
	
	public static double Subtração(double num, double ndois) {
		double su = num-ndois;
		return su;
	}
	public static double Multiplicação(double num, double ndois) {
		double mu = num*ndois;
		return mu;
	}
	
	public static double Divisão(double num, double ndois) {
		double di = num/ndois;
		return di;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double num;
		double ndois;
		
		num = Double.parseDouble(JOptionPane.showInputDialog("Informe um número: "));
		ndois = Double.parseDouble(JOptionPane.showInputDialog("Insira um segundo número: "));
		
		double so = Soma(num, ndois);
		double su = Subtração(num, ndois);
		double mu = Multiplicação(num, ndois);
		double di = Divisão(num, ndois);
		
		JOptionPane.showMessageDialog(null, "Seus valores são\nSoma: " + so + "\nSubitração: " + su + "\nMultiplicação: " + mu + "\nDivisão" + di);
		
		
	}

}
