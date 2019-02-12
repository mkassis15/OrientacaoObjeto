package com.target.treinamento.orientacaoObjeto1.dominio.banco;

public class MeuDado<T> {

	private T minhaClasse;
	private String nomeDaClasse;

	public T getMinhaClasse() {
		return minhaClasse;
	}

	public void setMinhaClasse(T minhaClasse) {
		this.minhaClasse = minhaClasse;
	}

	public String getNomeDaClasse() {
		return nomeDaClasse;
	}

	public void setNomeDaClasse(String nomeDaClasse) {
		this.nomeDaClasse = nomeDaClasse;
	}

	
}
