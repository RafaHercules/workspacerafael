package lista2;

import javax.swing.JOptionPane;

public class exercicio1 {

	public static void main(String[] args) {
		short qtdDias = Short.parseShort(JOptionPane.showInputDialog("Quantos dias ficará hospedado: "));
		double diaria = 80;
		double taxa;
		double conta;
		
		if(qtdDias>15) {
			taxa = 5.50 * qtdDias;
			conta = (diaria*qtdDias) + taxa;
		} else
			if(qtdDias<15) {
				taxa = 8 * qtdDias;
				conta = (diaria*qtdDias) + taxa;
			} else {
				taxa = 6 * qtdDias;
				conta = (diaria*qtdDias) + taxa;
			}
		System.out.println("A conta do cliente é de: " + conta);
	}

}
