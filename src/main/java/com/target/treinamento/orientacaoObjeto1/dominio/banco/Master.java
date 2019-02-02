package com.target.treinamento.orientacaoObjeto1.dominio.banco;

import org.omg.CORBA.portable.ValueOutputStream;

public class Master implements Cartao {


	public void nome(String nome) {
		// TODO Auto-generated method stub
		
	}
	public void debito(Double valor) {
		System.out.println("Utilizando o cartão Mastercard pagando no débito R$"+valor);		
	}

	public void credito(Double valor) {
		System.out.println("Utilizando o cartão Mastercard pagando no Credito R$"+valor );		
	}

	

}
