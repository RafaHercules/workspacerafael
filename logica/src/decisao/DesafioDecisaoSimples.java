package decisao;

import javax.swing.JOptionPane;

public class DesafioDecisaoSimples {

	public static void main(String[] args) {

		String nome = JOptionPane.showInputDialog("Nome: ");
		short idade = Short.parseShort(JOptionPane.showInputDialog("Idade: "));
		
		if(idade<16) {
			System.out.println("Proibido votar");
		}
		else if(idade>=18 && idade<=70) {
			System.out.println("Voto obrigatório");
		}
		else {
			System.out.println("Voto facultativo");
		}
		
		System.out.println(nome);
		System.out.println(idade);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
