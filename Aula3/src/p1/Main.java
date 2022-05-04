
package p1;

import javax.swing.JOptionPane;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub

				//int i = 10;
				//int j = 20;
				//int k = ++j;
				//System.out.println("K: " + k);
				//System.out.println("J: " + j);
				//int l = i++ /
				//System.out.println("L: " + l);
				
				//String s = 10;
				//int a1 = Integer.parseInt(s);
				//float a2 = Float.parseFloat(s);
				//double a3 = Double.parseDouble(s);
				
				//a1 = 10;
				//a2 = 10.0f;
				//a3 = 10.0;
				
				//Integer.parseInt(JOptionPane.showInputDi)
				
				String s = "10";
				int a1 = Integer.parseInt(s);
				float a2 = Float.parseFloat(s);
				double a3 = Double.parseDouble(s);
				
				a1 = Integer.parseInt(JOptionPane.showInputDialog("Informe um número: "));
				a2 = Integer.parseInt(JOptionPane.showInputDialog("Informe um segundo número: "));
				
				a3 = (a1+a2);
				
				JOptionPane.showMessageDialog(null, "Seu resultado é: " + a3);
				
	}

}

		