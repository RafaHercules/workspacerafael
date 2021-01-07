package lista2;

import javax.swing.JOptionPane;

public class exercicio3 {

	public static void main(String[] args) {
		String operacao = JOptionPane.showInputDialog("Qual operação deseja realizar?");
		double elemento1 = Double.parseDouble(JOptionPane.showInputDialog("Elemento 1:"));
		double elemento2 = Double.parseDouble(JOptionPane.showInputDialog("Elemento 2:"));
		double resultado = 0;

			if(operacao.contains("*")) {
				resultado = elemento1 * elemento2;
			}else if (operacao.contains("+")){
				resultado = elemento1 + elemento2;
			}else if (operacao.contains("-")){
				resultado = elemento1 - elemento2;
			}else if (operacao.contains("/")){
				resultado = elemento1 / elemento2;
			}else {
				System.out.println("Operação inválida!");
			}
			System.out.println("O resultado é " + resultado);
	}

}
