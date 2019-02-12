package com.target.treinamento.orientacaoObjeto1.dominio.banco;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import org.omg.CORBA.portable.ValueOutputStream;
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

		MeuDado<String> meuDado = new MeuDado<String>();

		meuDado.setMinhaClasse("Essa classe aqui galera!");
		meuDado.setNomeDaClasse("MundoJava");

		System.out.println(meuDado.getMinhaClasse() + ":" + meuDado.getNomeDaClasse());

		MeuDado<Double> meuDado2 = new MeuDado<Double>();
		meuDado2.setMinhaClasse(56.4);
		System.out.println(meuDado.getMinhaClasse() + ":" + meuDado2.getMinhaClasse());

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

	private void processaTransacoes(List<Transacao> transacaoes) throws IOException {

		BufferedWriter writer = new BufferedWriter(
				new FileWriter("C:\\Users\\aluno06sala04\\Downloads\\transacoes.txt", false));

		NumberFormat format = DecimalFormat.getInstance(Locale.US);
		format.setMinimumFractionDigits(2);
		format.setMaximumFractionDigits(2);

		double somatorio = 0;
		Double media = null;

		// interação sobre todas as transações
		for (Transacao transacao : transacaoes) {

			// Utilizo o valueOf para obter o Enum, baseado no nome da bandeira
			Taxas meuEnum = Taxas.valueOf(transacao.getBandeira().toUpperCase());

			// Obtenho o cartão selecionado baseado na informação do arquivo
			Cartao cartao = meuEnum.getCartao();

			Double novoValor = 0.0;

			// Verifico qual a operação o usuário selecionou
			if (transacao.getOperacao() == 1) {

				// Executo a chamada da interface débito, passando o valor
				novoValor = cartao.debito(transacao.getValor());

			} else if (transacao.getOperacao() == 2) {

				// Executo a chamada da interface crédito, passando o valor
				novoValor = cartao.credito(transacao.getValor());
			}

			writer.append(meuEnum.getNome()).append(";").append(transacao.getOperacao().toString()).append(";")
					.append(format.format(novoValor)).append(";").append(transacao.getNomeCliente());

			writer.newLine();
			somatorio = somatorio + transacao.getValor();
			media = somatorio / transacao.getValor();

			// trocando e colocando a ordem dos nomes.
			int pos = transacao.getNomeCliente().indexOf(" ");
			String inicioNome = transacao.getNomeCliente().substring(0, pos);
			String outraParteDoNome = transacao.getNomeCliente().substring(pos + 1);

			System.out.println(outraParteDoNome + "," + inicioNome);
		}

		System.out.println("a soma de todos saldos é: " + somatorio);
		System.out.println("a média de todos saldos é: " + media);

		writer.flush();
		writer.close();
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














