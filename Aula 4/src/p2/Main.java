package p2;

import javax.swing.JOptionPane;

public class Main {
	public static double CalculaIMC (double peso, double altura) {
	double imc = peso/(altura*altura);
	return imc;
	}

	public static void main(String[] args) {
	
	double peso;
	double altura;
	peso = Double.parseDouble(JOptionPane.showInputDialog("informe seu peso:" ));
	altura = Double.parseDouble(JOptionPane.showInputDialog("Informe sua alturta: "));	
	JOptionPane.showMessageDialog(null, "Seu valor IMC é" +CalculaIMC (peso, altura));
	double imc = CalculaIMC (peso, altura);
	if (imc <= 18.4) {
		JOptionPane.showMessageDialog(null, "Você está abaixo do peso");
	}
	if (imc >= 18.5 && imc <= 24.9) {
		JOptionPane.showMessageDialog(null, "Seu peso está normal");
	}
	if (imc >= 25.0 && imc <= 29.9) {
		JOptionPane.showMessageDialog(null, "Você tem sobrepesso");
	}
	if (imc >= 30.0 && imc <= 34.9) {
		JOptionPane.showMessageDialog(null, "Você tem obesidade grau 1");
	}
	if (imc >= 35.0 && imc <= 39.9) {
		JOptionPane.showMessageDialog(null, "Você tem obesidade grau 2");
	}
	if (imc >= 
			40) {
		JOptionPane.showMessageDialog(null, "Você tem obesidade grau 3");
	}
			
			//JOptionPane.showMessageDialog(null, "Seu valor IMC é" +imc));
}
}