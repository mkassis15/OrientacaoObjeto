package com.target.treinamento.orientacaoObjeto1.dominio.banco;

public class Banrisul implements Cartao {

	public Double debito(Double valor) {

		System.out.println("Utilizando o cartão Banrisul pagando no débito R$"+valor );
		
		return valor - (Taxas.BANRISUL.getValorTaxa() * valor) - (valor * Taxas.BANRISUL.getCofins());		
	}

	public Double credito(Double valor) {

		System.out.println("Utilizando o cartão Banrisul pagando no débito R$"+valor );
		
		return valor - (Taxas.BANRISUL.getValorTaxa() * valor) - (valor * Taxas.BANRISUL.getCofins());
	}

	

}
