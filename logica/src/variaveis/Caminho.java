package variaveis;

import javax.swing.JOptionPane;

public class Caminho {

	public static void main(String[] args) {
		String nomeProduto = JOptionPane.showInputDialog("Digite o nome do seu produto: ");
		String categoriaProduto = JOptionPane.showInputDialog("Digite a categoria do seu produto: ");
		double valorProduto = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do seu produto: "));
		int qtdProduto = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de produtos: "));
		double impostoProduto = Double.parseDouble(JOptionPane.showInputDialog("Digite o imposto do produto: "));
		double totalSimples = qtdProduto * valorProduto;
		double valorImposto = valorProduto * impostoProduto;
		double totalImposto = totalSimples + valorImposto;
		double totalDesconto10 = totalImposto * 0.90;
		
		System.out.println("Nome: " + nomeProduto);
		System.out.println("Categoria: " + categoriaProduto);
		System.out.println("Valor: " + valorProduto);
		System.out.println("Quantidade: " + qtdProduto);
		System.out.println("Imposto: " + impostoProduto);
		
		System.out.println("Total sem imposto: " + totalSimples);
		System.out.println("Valor do Imposto: " + valorImposto);
		System.out.println("Total com imposto: " + totalImposto);
		System.out.println("Total com imposto e desconto de 10%: " + totalDesconto10);

		
	}

}
