package com.target.treinamento.orientacaoObjeto1.dominio.classeAbstract;

public class Principal {

	public static void main(String[] args) {

		Principal principal = new Principal();
		principal.inicializa();

	}

	private void inicializa() {

		ControleBonificacao controleBonificacao = new ControleBonificacao();
		controleBonificacao.registra(new Gerente());

	}
}
