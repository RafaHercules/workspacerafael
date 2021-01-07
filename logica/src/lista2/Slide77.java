package lista2;

import javax.swing.JOptionPane;

public class Slide77 {

	public static void main(String[] args) {
		String nome="";
		short idade=0;
		short qtdMaioresIdade=0;
		short qtdPessoas=0;
		short totalIdades=0;
		short idadeMaisExperiente=0;
		String nomeMaisExperiente = "";
		short idadeMaisJovem=0;
		String nomeMaisJovem = "";
		
		do {
			nome = JOptionPane.showInputDialog("Digite seu nome").toUpperCase();
			idade = Short.parseShort(JOptionPane.showInputDialog("Digite a idade"));
			if(idade>=18) {
				qtdMaioresIdade = (short) (qtdMaioresIdade + 1);
			}
			qtdPessoas++;
			totalIdades+=idade;
		    if(idade>idadeMaisExperiente) {
		    	idadeMaisExperiente = idade;
		    	nomeMaisExperiente = nome;
		    }
		    if(idade<idadeMaisJovem || qtdPessoas==1) {
		    	idadeMaisJovem = idade;
		    	nomeMaisJovem = nome;
		    }
		}while(JOptionPane.showConfirmDialog(null, "Continuar?", "Pergunta", JOptionPane.YES_NO_OPTION)==0);
		
		System.out.println("Maiores de idade " + qtdMaioresIdade );
		System.out.println("Média de idade " + (totalIdades/qtdPessoas));
		System.out.println("A pessoa mais experiente é: " + nomeMaisExperiente + " com " + idadeMaisExperiente + " anos");
		System.out.println("A pessoa mais jovem é: " + nomeMaisJovem + " com " + idadeMaisJovem + " anos");
		
		
	}

}
