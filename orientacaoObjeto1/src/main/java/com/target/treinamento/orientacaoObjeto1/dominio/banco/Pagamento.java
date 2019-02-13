package com.target.treinamento.orientacaoObjeto1.dominio.banco;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.target.treinamento.orientacaoObjeto1.dominio.banco.Banrisul;
import com.target.treinamento.orientacaoObjeto1.dominio.banco.Master;
import com.target.treinamento.orientacaoObjeto1.dominio.banco.Visa;
import com.target.treinamento.orientacaoObjeto1.dominio.banco.Elo;

public class Pagamento {
	public static void main(String[] args) {

		Integer entrada = 1;

		Cartao cartao = null;
		if (entrada == 1) {
			cartao = new Visa();
		} else if (entrada == 2) {
			cartao = new Master();

		} else if (entrada == 3) {
			cartao = new Elo();
		} else {
			cartao = new Banrisul();
		}
	}

	private Integer lerEntrada() {
		return new Scanner(System.in).nextInt();
}
}