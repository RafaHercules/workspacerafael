package decisao;

import javax.swing.JOptionPane;

public class DecisaoComposta {

	public static void main(String[] args) {
		String disciplina = JOptionPane.showInputDialog("Disciplina: ");
		float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Nota 1: "));
		float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Nota 2: "));
		float media = (nota1+nota2)/2;
		
		if(media >= 6) {
			System.out.println("Parabéns! Você foi aprovado na disciplina: " + disciplina);
		}
		else if(media<=4) {
			System.out.println("Imbecil! Você foi reprovado na disciplina: " + disciplina);
		}
		else {
			System.out.println("Segunda chance! Você foi está de recuperação na disciplina: " + disciplina);
		}
		
		//&& (AND) - || (OR)
				
		System.out.println("Média: " + media);
		
		
		
		
		

	}

}
