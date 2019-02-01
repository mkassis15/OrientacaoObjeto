package com.target.treinamento.orientacaoObjeto1.dominio.banco;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;

import com.target.treinamento.orientacaoObjeto1.dominio.banco.Cartao;
import com.target.treinamento.orientacaoObjeto1.dominio.banco.Master;
import com.target.treinamento.orientacaoObjeto1.dominio.banco.Visa;
import com.target.treinamento.orientacaoObjeto1.dominio.banco.Elo;
import com.target.treinamento.orientacaoObjeto1.dominio.banco.Banrisul;

public class Principal {
	public static void main(String[] args) {

		try {
			new Principal().inicializa();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private void inicializa() throws IOException {
		List<String> list = lerArquivo();
		List<Transacao> transacaoes = new ArrayList<Transacao>();

		for (String linha : list) {

			String[] linhaQuebrada = linha.split(";");

			Transacao transacao = new Transacao();

			transacao.setBandeira(linhaQuebrada[0]);
			transacao.setOperacao(Integer.valueOf(linhaQuebrada[1]));
			transacao.setValor(Double.valueOf(linhaQuebrada[2]));
			transacao.setNomeCliente(linhaQuebrada[3]);

			transacaoes.add(transacao);
		}

		processaTransacoes(transacaoes);

	}

	private void processaTransacoes(List<Transacao> transacaoes) {
		for (Transacao transacao : transacaoes) {
			Taxas meuEnum = Taxas.valueOf(transacao.getBandeira().toUpperCase());

			Cartao cartao = meuEnum.getCartao();

			if (transacao.getOperacao() == 1) {

				cartao.debito(transacao.getValor());

			} else if (transacao.getValor() == 2) {

				cartao.credito(transacao.getValor());
			}

		}

	}

	private List<String> lerArquivo() throws IOException {
		InputStream inputStream = new FileInputStream("C:\\Users\\aluno06sala04\\Downloads\\transacoes.txt");

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

		List<String> minhasLinhas = new ArrayList<String>();

		while (true) {
			String linha = bufferedReader.readLine();
			if (linha != null) {
				minhasLinhas.add(linha);
			} else {
				break;
			}
		}

		return minhasLinhas;
	}
}