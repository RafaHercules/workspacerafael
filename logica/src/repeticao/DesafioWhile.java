package repeticao;

import javax.swing.JOptionPane;

public class DesafioWhile {

	public static void main(String[] args) {

		String nome = JOptionPane.showInputDialog("Digite seu nome").toUpperCase();
		
		while(nome.length()<5 || nome.length()>20 || nome.contains(" ")==false) {
			nome = JOptionPane.showInputDialog("Nome inv�lido");
		}
		short idade = Short.parseShort(JOptionPane.showInputDialog("Digite sua idade"));
		while(idade<18 || idade>80) {
			idade = Short.parseShort(JOptionPane.showInputDialog("Idade inv�lida"));
			
		}

		System.out.println("Nome Completo: " + nome);
		System.out.println("Idade: " + idade);
		
	}

}
