package p3;

import javax.swing.JOptionPane;

public class Main {
	public static double Soma(double num, double ndois) {
		double so = num+ndois;
		return so;
	}
	
	public static double Subtra��o(double num, double ndois) {
		double su = num-ndois;
		return su;
	}
	public static double Multiplica��o(double num, double ndois) {
		double mu = num*ndois;
		return mu;
	}
	
	public static double Divis�o(double num, double ndois) {
		double di = num/ndois;
		return di;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double num;
		double ndois;
		
		num = Double.parseDouble(JOptionPane.showInputDialog("Informe um n�mero: "));
		ndois = Double.parseDouble(JOptionPane.showInputDialog("Insira um segundo n�mero: "));
		
		double so = Soma(num, ndois);
		double su = Subtra��o(num, ndois);
		double mu = Multiplica��o(num, ndois);
		double di = Divis�o(num, ndois);
		
		JOptionPane.showMessageDialog(null, "Seus valores s�o\nSoma: " + so + "\nSubitra��o: " + su + "\nMultiplica��o: " + mu + "\nDivis�o" + di);
		
		
	}

}
