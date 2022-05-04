package p1;

import javax.swing.JOptionPane;

public class Main {
	public static double cIMC (double peso, double altura) {
		double imc = peso/(altura*altura);
		return imc;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double peso;
		double altura;
		
		JOptionPane.showMessageDialog(null, "Seja bem vindo(a)!");
		peso = Double.parseDouble(JOptionPane.showInputDialog("Informe seu peso: "));
		altura = Double.parseDouble(JOptionPane.showInputDialog("Informe sua altura: "));
		JOptionPane.showMessageDialog(null, "Seu IMC é: " + cIMC (peso, altura));
		double imc = cIMC (peso, altura);
		if (imc <= 18.4) {
			JOptionPane.showMessageDialog(null, "Você está a baixo do peso, deve se alimentar melhor.");
		}
		if (imc >= 18.5 && imc <= 24.9) {
			JOptionPane.showMessageDialog(null, "Parabéns, seu peso está normal!");
		}
		if (imc >= 25.0 && imc <= 29.9) {
			JOptionPane.showMessageDialog(null, "Você está acima do beso, deve se alimentar melhor.");
		}
		if (imc >= 30.0 && imc <= 34.9) {
			JOptionPane.showMessageDialog(null, "Você está com obesidade grau 1, procure um(a) nutricionista!");
		}
		if (imc >= 35.0 && imc <= 39.9) {
			JOptionPane.showMessageDialog(null, "Você está com obesidade grau 2, procure um(a) nutricionista e/ou academia!!");
		}
		if (imc >= 40 ) {
			JOptionPane.showMessageDialog(null, "Você está com obesidade grau 3!!!\nProcure um(a) médico(a) imediatamente!!!");
		}
	}

}
