package repeticao;

import javax.swing.JOptionPane;

public class DesafioDo {

	public static void main(String[] args) {
		int n1 = 0;
		int n2 = 0;
		int count = 0;
		
		n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor"));
		
		do {
			n2 = Integer.parseInt(JOptionPane.showInputDialog("Adivinhe o valor"));
			count=count+1;
			if(n2==n1) {
				JOptionPane.showMessageDialog(null,"Parab�ns, voc� acertou em " + count + " tentativas");
				//JOptionPane.showMessageDialog(null,"Chances necess�rias " + count);
			}else if(n1 < n2) {
				JOptionPane.showMessageDialog(null,"Chute mais baixo");
			}else {
				JOptionPane.showMessageDialog(null,"Chute mais alto");
			}
		} while(n2!=n1); 
		
	} 

}
