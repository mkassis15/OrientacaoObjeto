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

	// main é uma thread
	public static void main(String[] args) {
		new Principal().inicializa();

	}

	private void inicializa() {
		MinhaThread t1 = new MinhaThread();
		MinhaThread t2 = new MinhaThread();
		t1.start();
		
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		t2.start();

		System.out.println(t1.isAlive());
		System.out.println(t2.isAlive());
	}
}





