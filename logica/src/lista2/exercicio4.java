package lista2;

import javax.swing.JOptionPane;

public class exercicio4 {

	public static void main(String[] args) {
		int v1 = Integer.parseInt(JOptionPane.showInputDialog("Valor 1"));
		int v2 = Integer.parseInt(JOptionPane.showInputDialog("Valor 2"));
		int v3 = Integer.parseInt(JOptionPane.showInputDialog("Valor 3"));
		int aux;
		
		if(v1==v2 || v1==v3 || v2==v3) {
			System.out.println("Existem valores iguais");
		} else 
			if(v1>v2 && v1>v3){
				System.out.println(v1);
			} if(v2>v3) {
				System.out.println(v2);
				System.out.println(v3);
			} else {
			System.out.println(v3);
			System.out.println(v2);
		} else if(v2>v1 && v2>v3) {
			System.out.println(v2);
		}if(v1>v3) {
				System.out.println(v2);
				System.out.println(v3);
			} else {
			System.out.println(v3);
			System.out.println(v2);
		}
			

	}

}
