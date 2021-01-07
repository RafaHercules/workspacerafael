package variaveis;

import javax.swing.JOptionPane;

public class TiposPrimitivos {

	public static void main(String[] args) {
		String disciplina = JOptionPane.showInputDialog("Digite o nome da disciplina: ");
		//int falta = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de faltas: "));
		//byte falta = Byte.parseByte(JOptionPane.showInputDialog("Digite a quantidade de faltas: "));
		short falta = Short.parseShort(JOptionPane.showInputDialog("Digite a quantidade de faltas: "));
		float semestral1 = Float.parseFloat(JOptionPane.showInputDialog("Digite sua primeira nota: "));
		float semestral2 = Float.parseFloat(JOptionPane.showInputDialog("Digite sua primeira nota: "));
		float media = (semestral1 + semestral2) / 2;
		//double notaS1 = Double.parseDouble(JOptionPane.showInputDialog("Digite sua primeira nota: "));
		//double notaS2 = Double.parseDouble(JOptionPane.showInputDialog("Digite sua segunda nota: "));
		//double media = (notaS1 + notaS2) / 2;

		System.out.println("Nome: " + disciplina);
		System.out.println("Total de faltas: " + falta);
		System.out.println("Nota 1º Semestre: " + semestral1);
		System.out.println("Nota 2º Semestre: " + semestral2);
		System.out.println("Media Final: " + media);
	
	
	}

}
