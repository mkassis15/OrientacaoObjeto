package com.target.treinamento.orientacaoObjeto1.dominio.multiProcessamento;

public class TesteThread {

	public static void main(String[] args) {

		class UmaThread extends Thread {

			String repete;
			
			public UmaThread(String repete) {
				super();
				this.repete = repete;
			}

			@Override
			public void run() {
				for (int UmaThread = 0; UmaThread < 10; UmaThread++) {

				}
			}

		}
	}
}
