package com.target.treinamento.orientacaoObjeto1.dominio.banco;

public class Pessoa {

	private String nome;
	private String rg;

	public Pessoa(String nome, String rg) {
		super();
		this.nome = nome;
		this.rg = rg;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	@Override
	public String toString() {

		return "nome: " + this.getNome();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Pessoa) {
			Pessoa pessoaParametro = (Pessoa) obj;
			return this.rg.equals(pessoaParametro.getRg()) && this.nome.equals(pessoaParametro.getNome());

		}
		return super.equals(obj);
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		Pessoa novaPessoa = new Pessoa(this.nome, this.rg);
		return novaPessoa;

	}

}





