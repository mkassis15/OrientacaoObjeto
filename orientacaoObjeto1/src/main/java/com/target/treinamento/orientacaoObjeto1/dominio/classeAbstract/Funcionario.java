package com.target.treinamento.orientacaoObjeto1.dominio.classeAbstract;

public abstract class Funcionario {

	private Double bonificacao = 1.2;
	private Double salario = 1000.0;

	// opcional a sobrescrita
	public Double getBonificacao() {
		return bonificacao;
	}

	// esta delegando para ele, sendo obrigatorio
	public abstract Double getSalario();

	public Double getValorTotalFuncionarioComBonificacao() {
		return getSalario() * getBonificacao();
		

	}

}
