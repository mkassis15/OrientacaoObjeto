package com.target.treinamento.orientacaoObjeto1.dominio.banco;

public class Master implements Cartao {


	public void debito(Double valor) {
		System.out.println("Utilizando o cartão Mastercard pagando no débito R$"+valor );		
	}

	public void credito(Double valor) {
		System.out.println("Utilizando o cartão Mastercard pagando no Credito R$"+valor );		
	}

	

}
