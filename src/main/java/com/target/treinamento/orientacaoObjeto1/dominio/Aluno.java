package com.target.treinamento.orientacaoObjeto1.dominio;

public class Aluno extends Pessoa {

	public Aluno(String nome, String rg) {
		super(nome, rg);
		// TODO Auto-generated constructor stub
	}

	private String cpf;
	private String rg;
	private String nome;
	private String matricula;

	public String getMatricula() {
		return this.matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getCpf() {
		return this.cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return this.rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
