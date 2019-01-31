package com.target.treinamento.orientacaoObjeto1.dominio.banco;

public class Visa implements Cartao {

	public void debito(Double valor) {
		System.out.println("O pagamento sera feito em Debito:" + valor);
		
	}

	public void credito(Double valor) {
		System.out.println("O pagamento sera feito em Credito:" + valor);
	}



}
