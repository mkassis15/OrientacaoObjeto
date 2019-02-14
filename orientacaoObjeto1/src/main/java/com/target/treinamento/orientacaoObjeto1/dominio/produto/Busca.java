package com.target.treinamento.orientacaoObjeto1.dominio.produto;

public interface Busca<T> {
	
	<T> Produto buscarPorCodigo(T id);

}
