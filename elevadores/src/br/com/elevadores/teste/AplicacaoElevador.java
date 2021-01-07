package br.com.elevadores.teste;

import br.com.elevadores.modelo.Elevador;

public class AplicacaoElevador {

	public static void main(String[] args) {
		Elevador elevador = new Elevador();
		
		elevador.inicializar((short)10, (short)10, (short)0);
		System.out.println(elevador.verificarStatus());
		elevador.subir();
		elevador.subir();
		System.out.println(elevador.verificarStatus());
		elevador.entrar((short) 5);
		elevador.entrar((short) 5);
		System.out.println(elevador.verificarStatus());
		elevador.subir();
		System.out.println(elevador.verificarStatus());

	
	
	
	
	
	
	
	}

}
