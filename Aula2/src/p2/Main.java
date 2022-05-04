package p2;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nome, cidade, endereço; 
		int cep=0, telefone=0;
		
		JOptionPane.showInputDialog("bem-vindo a nosso programa");
		nome = JOptionPane.showInputDialog("Favor informe o seu nome: ");
		cidade = JOptionPane.showInputDialog("Favor informe sua cidade: ");
		endereço = JOptionPane.showInputDialog("Favor informe seu endereço: ");
		cep = Integer.parseInt(JOptionPane.showInputDialog("Informe seu cep: "));
		telefone = Integer.parseInt(JOptionPane.showInputDialog("Informe seu telefone: "));
		
		JOptionPane.showMessageDialog(null, "Suas informaçoes são \nNome: " +nome + "\nCidade: " +cidade + "\nEndereço: " +endereço + "\nCEP: " +cep + "\nTelefone: " +telefone);
	}

}
