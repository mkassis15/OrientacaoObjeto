package com.target.treinamento.orientacaoObjeto1.dominio.banco;

public class Principal {
	
	public static void main(String[] args) {
		
		Principal principal = new Principal();
		principal.inicializa();
				
	}
	
	private void inicializa() {
		
		Conta contaOrigem = new Conta();
		contaOrigem.setPessoa(new Pessoa("Alfredo", "65554"));
		contaOrigem.setSaldo(0.0);
		contaOrigem.setNumero(1856);
		
		Conta contaDestino = new Conta();
		contaDestino.setPessoa(new Pessoa("João", "1565486"));
		contaDestino.setSaldo(1000.0);
		contaDestino.setNumero(2264);
		
		
		Transferencia novaTransferencia = new Transferencia(1, contaOrigem, contaDestino, 100.0, "TEF");
		novaTransferencia.transferir();
		
		novaTransferencia.exibirDados();
		
	}

}
