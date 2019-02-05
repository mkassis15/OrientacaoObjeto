package com.target.treinamento.orientacaoObjeto1.dominio.banco;

public class Visa implements Cartao {


	public Double debito(Double valor) {
		System.out.println("Utilizando o cartão Visa pagando no débito R$"+valor );
		
		return valor - (Taxas.VISA.getValorTaxa() * valor) - (valor * Taxas.VISA.getCofins());
	}

	public Double credito(Double valor) {
		System.out.println("Utilizando o cartão Visa pagando no crédito R$"+valor );
		
		return valor - (Taxas.VISA.getValorTaxa() * valor) - (valor * Taxas.VISA.getCofins());
	}

	

}
