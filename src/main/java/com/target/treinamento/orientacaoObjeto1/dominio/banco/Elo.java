package com.target.treinamento.orientacaoObjeto1.dominio.banco;

public class Elo implements Cartao{

	public Double debito(Double valor) {

		System.out.println("Utilizando o cartão Elo pagando no débito R$"+valor );
		
		return valor - (Taxas.ELO.getValorTaxa() * valor) - (valor * Taxas.ELO.getCofins());		
	}

	public Double credito(Double valor) {

		System.out.println("Utilizando o cartão Elo pagando no débito R$"+valor );
		
		return valor - (Taxas.ELO.getValorTaxa() * valor) - (valor * Taxas.ELO.getCofins());	
	}

	public void nome(String nome) {
		// TODO Auto-generated method stub
		
	}

	

	

}
