package br.com.elevadores.modelo;

public class Elevador {
	
	private short capacidadeMaxima;
	private short andarMaximo;
	private short andarMinimo;
	private short qtdPessoas;
	private short andarAtual;
	
	public void sair() {
		if(qtdPessoas>0) {
			qtdPessoas--;
		}
	}
	
	public void sair(short qtd) {
		short resultado = (short) (qtdPessoas-qtd);
		if(resultado>=0) {
			qtdPessoas-=qtd;
		}
	}
	
	public void entrar(short qtd) {
		short resultado = (short) (qtd + qtdPessoas);
		if(resultado<=capacidadeMaxima) {
			qtdPessoas+=qtd;
		}
	}
	
	public void descer() {
		if(andarAtual>andarMinimo) {
			andarAtual--;
		}
	}
	
	public void subir() {
		if(andarAtual<andarMaximo) {
			andarAtual++;
		}
	}
	
	public String verificarStatus() {
		return "Quantidade de Pessoas: " + qtdPessoas + "\n" +
				"Andar Atual: " + andarAtual + "\n" +
			    "Capacidade Máxima: " + capacidadeMaxima;
	}
	
	public void inicializar(short capacidade, short maior, short menor) {
		capacidadeMaxima = capacidade;
		andarMaximo = maior;
		andarMinimo = menor;		
	}
	
	
	
	
	
	
}
