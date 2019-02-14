package com.target.treinamento.orientacaoObjeto1.dominio.classeAbstract;

public class ControleBonificacao {

private Double totalEmBonificacoes = 0.0;
	
	public void registra(Funcionario funcionario) {
		this.totalEmBonificacoes += funcionario.getValorTotalFuncionarioComBonificacao();
	}
	
	public Double getTotalEmBonificacoes() {
		return this.totalEmBonificacoes;
	}
}
