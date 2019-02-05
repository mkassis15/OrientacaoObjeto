package com.target.treinamento.orientacaoObjeto1.dominio.banco;


import org.omg.CORBA.portable.ValueOutputStream;

public class Master implements Cartao { //OPÇÃO

	public Double debito(Double valor) {
		System.out.println("Utilizando o cartão Mastercard pagando no débito R$"+valor );
		
		return valor - (Taxas.MASTER.getValorTaxa() * valor) - (valor * Taxas.MASTER.getCofins());
	}

	public Double credito(Double valor) {
		System.out.println("Utilizando o cartão Mastercard pagando no crédito R$"+valor );
		
		return valor - (Taxas.MASTER.getValorTaxa() * valor) - (valor * Taxas.MASTER.getCofins());
	}

}
