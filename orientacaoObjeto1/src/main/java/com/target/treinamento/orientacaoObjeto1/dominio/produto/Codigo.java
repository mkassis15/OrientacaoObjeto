package com.target.treinamento.orientacaoObjeto1.dominio.produto;

public class Codigo<T> {

	private T identificador;

	public Codigo(T identificador) {
		super();
		this.identificador = identificador;
	}

	@Override
	public String toString() {
		return "Codigo [identificador=" + identificador + "]";
	}

	public T getIdentificador() {
		return identificador;
	}

	public void setIdentificador(T identificador) {
		this.identificador = identificador;
	}

}
