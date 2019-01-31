package com.target.treinamento.orientacaoObjeto1.dominio.banco;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import com.target.treinamento.orientacaoObjeto1.dominio.banco.Cartao;
import com.target.treinamento.orientacaoObjeto1.dominio.banco.Taxas;

public class Principal {
	public static void main(String[] args) {
		Integer entrada = 1;

		// Taxas.valueOf(entrada).getCartao().credito(200.0);

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

		try {

		} catch (NumberFormatException e) {
			System.out.println("Olá você errou :D coloque apenas numeros");
		} catch (ArithmeticException exception) {
			System.out.println("Não foi possivel fazer a operação");
		}
	}
	private void leiaArquivo() throws FileNotFoundException {
		InputStream inputStream = new FileInputStream("C:users/rafael/arquivo.txt");
		
		
	}
	
	 

}
