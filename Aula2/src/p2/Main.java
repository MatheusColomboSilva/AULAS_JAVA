package p2;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nome, cidade, endere�o; 
		int cep=0, telefone=0;
		
		JOptionPane.showInputDialog("bem-vindo a nosso programa");
		nome = JOptionPane.showInputDialog("Favor informe o seu nome: ");
		cidade = JOptionPane.showInputDialog("Favor informe sua cidade: ");
		endere�o = JOptionPane.showInputDialog("Favor informe seu endere�o: ");
		cep = Integer.parseInt(JOptionPane.showInputDialog("Informe seu cep: "));
		telefone = Integer.parseInt(JOptionPane.showInputDialog("Informe seu telefone: "));
		
		JOptionPane.showMessageDialog(null, "Suas informa�oes s�o \nNome: " +nome + "\nCidade: " +cidade + "\nEndere�o: " +endere�o + "\nCEP: " +cep + "\nTelefone: " +telefone);
	}

}
