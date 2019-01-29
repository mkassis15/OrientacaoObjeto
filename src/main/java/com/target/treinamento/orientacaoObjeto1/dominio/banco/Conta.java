package com.target.treinamento.orientacaoObjeto1.dominio.banco;

public class Conta {
	private Double saldo;
	private Integer numero;
	private Pessoa pessoa;

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	@Override
	public String toString() {

		return "O cliente " + this.pessoa.getNome() + " tem R$ " + this.saldo + " em sua conta";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Conta) {
			Conta contaParametro = (Conta) obj;

			return this.numero.equals(contaParametro.getNumero()) && this.saldo.equals(contaParametro.getSaldo());

		}
		return super.equals(obj);

	}

	@Override
	public Object clone() throws CloneNotSupportedException {

		Conta novaConta = new Conta();
		novaConta.setNumero(Integer.valueOf(this.numero));
		novaConta.setSaldo(Double.valueOf(this.saldo));
		novaConta.setPessoa((Pessoa) pessoa.clone());

		return novaConta;
	}
}











