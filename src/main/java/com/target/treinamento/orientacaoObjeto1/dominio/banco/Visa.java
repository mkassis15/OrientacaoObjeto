package com.target.treinamento.orientacaoObjeto1.dominio.banco;

public class Visa implements Cartao {

	public void debito(Double valor) {
		System.out.println("Utilizando o cartão Visa pagando no débito:" + valor);
		
	}

	public void credito(Double valor) {
		System.out.println("O pagamento sera feito em Credito:" + valor);
	}

	public void nome(String nome) {
		// TODO Auto-generated method stub
		
	}



}
