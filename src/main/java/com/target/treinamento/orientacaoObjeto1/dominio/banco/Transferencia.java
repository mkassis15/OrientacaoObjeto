package com.target.treinamento.orientacaoObjeto1.dominio.banco;

public class Transferencia {
	private Conta contaOrigem;
	private Conta contaDestino;
	private Double valor;
	private String tipo;

	public Transferencia(Integer id, Conta contaOrigem, Conta contaDestino, Double valor, String tipo) {
		super();
		this.contaOrigem = contaOrigem;
		this.contaDestino = contaDestino;
		this.valor = valor;
		this.tipo = tipo;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Conta getContaOrigem() {
		return contaOrigem;
	}

	public void setContaOrigem(Conta contaOrigem) {
		this.contaOrigem = contaOrigem;
	}

	public Conta getContaDestino() {
		return contaDestino;
	}

	public void setContaDestino(Conta contaDestino) {
		this.contaDestino = contaDestino;
	}

	

	public void exibirDados() {
		// TODO Auto-generated method stub

	}

	public void transferir() {
		
		
	}
}









