package com.target.treinamento.orientacaoObjeto1.dominio.multiProcessamento;

public class Principal {

	class MinhaThread extends Thread {

		@Override
		public void run() {
			System.out.println("r1");

			try {
				Thread.sleep(5000);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			System.out.println("r2");
		}
	}

	class Dado {
		public synchronized void exibir(String mensagem) {
			System.out.print("[" + mensagem);

			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}

			System.out.println("]");
		}
	}

	class ThreadExemplo extends Thread {
		String str;
		Dado dado;

		public ThreadExemplo(Dado dado, String str) {
			this.dado = dado;
			this.str = str;
			start();
		}

		@Override
		public void run() {
			dado.exibir(str);
		}
	}

	// main é uma thread
	public static void main(String[] args) {
		new Principal().inicializa();

	}

	private void inicializa() {

		Dado dado = new Dado();

		ThreadExemplo t1 = new ThreadExemplo(dado, "Olá");
		ThreadExemplo t2 = new ThreadExemplo(dado, "Meu");
		ThreadExemplo t3 = new ThreadExemplo(dado, "Mundo");
		ThreadExemplo t4 = new ThreadExemplo(dado, "Mundo");
		ThreadExemplo t5 = new ThreadExemplo(dado, "Mundo");

		// MinhaThread t1 = new MinhaThread();
		// MinhaThread t2 = new MinhaThread();
		// t1.start();
		//
		// try {
		// t1.join();
		// } catch (InterruptedException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		//
		// t2.start();
		//
		// System.out.println(t1.isAlive());
		// System.out.println(t2.isAlive());

	}

	private void reflections() {
		try {

			Class clazz = Class.forName("com.target.treinamento.orientacaoObjeto1.dominio.classeAbstract.Gerente");

			for (int i = 0; i < clazz.getMethods().length; i++) {
				System.out.println(clazz.getMethods()[i].invoke(i, null));
				
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
