package com.target.treinamento.orientacaoObjeto1.dominio.banco;

public class Banrisul implements Cartao {

	public void debito(Double valor) {
		System.out.println("Utilizando o cartão Banrisul pagando no débito R$"+valor );		
	}

	public void credito(Double valor) {
		System.out.println("Utilizando o cartão Banrisul pagando no credito R$"+valor );		
	}

	

}
