package com.target.treinamento.orientacaoObjeto1.dominio.multiProcessamento;

import com.target.treinamento.orientacaoObjeto1.dominio.multiProcessamento.Principal.ThreadExemplo;

public class Dado {
	public static void main(String[] args) {
		new Dado().inicializa();
		
		int valor;
		
	}

	private void inicializa() {

	}

	class DadoThread extends Thread {

		Integer soma;
		Dado dado = new Dado();
	

		@Override
		public void run() {
			try {
				
			} catch (Exception e) {
				// TODO: handle exception
			}
		}

	}
}
