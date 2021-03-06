package com.target.treinamento.orientacaoObjeto1.dominio.banco;

public enum Taxas {
	VISA(1, "Visa", 0.05, 0.001, new Visa()), 
	MASTER(2, "MasterCard", 0.1, 0.002, new Master()),
	BANRISUL(1,"Banrisul", 0.8, 0.003, new Banrisul()),
	ELO(2, "Elo", 0.4, 0.006, new Elo());

	private Integer codigo;
	private String nome;
	private Double valorTaxa;
	private Double cofins;
	private Cartao cartao;

	Taxas(Integer codigo, String nome, Double valorTaxa, Double cofins, Cartao cartao) {
		this.codigo = codigo;
		this.nome = nome;
		this.valorTaxa = valorTaxa;
		this.cofins = cofins;
		this.cartao = cartao;
	}

	public Cartao getCartao() {
		return cartao;
	}

	public void setCartao(Cartao cartao) {
		this.cartao = cartao;
	}

	public String getNome() {
		return nome;
	}

	public Double getValorTaxa() {
		return valorTaxa;
	}

	public Double getCofins() {
		return cofins;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public static Taxas getEnum(String nome) {
		for (Taxas taxa : Taxas.values()) {
			if (nome.equalsIgnoreCase(taxa.getNome())) {
				return taxa;
			}
		}
		return null;
	}

	@Override
	public String toString() {
		return "[nome:" + this.nome + "] [taxa:" + this.valorTaxa + "] [cofins:" + this.cofins + "]";
	}

}
