package decisao;

import javax.swing.JOptionPane;

public class DesafioDecisaoComposta {

	public static void main(String[] args) {
		String nomeProduto = JOptionPane.showInputDialog("Nome do Produto: ");
		int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Quantidade: "));
		double valorUnitario = Double.parseDouble(JOptionPane.showInputDialog("Valor unitário: "));

		
		if(quantidade<5) {
			System.out.println("Sem desconto: " + valorUnitario);
		} else
			if(quantidade>=5 && quantidade<=9) {
				valorUnitario = valorUnitario * 0.95;
				//System.out.println("Desconto de 5%: " + valorUnitario);
			}else
				if(quantidade>=10 && quantidade<=20) {
					valorUnitario = valorUnitario * 0.90;
					//System.out.println("Desconto de 10%: " + valorUnitario);
				}else {
					valorUnitario = valorUnitario * 0.88;
					//System.out.println("Desconto de 12%: " + valorUnitario);
				}
		System.out.println("O valor do produto é: " + valorUnitario);
	}

}
