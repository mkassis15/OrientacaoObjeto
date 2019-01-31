package com.target.treinamento.orientacaoObjeto1.dominio.mamifero;

import java.util.ArrayList;
import java.util.List;

public class PlanetaTerra {
	public static void main(String[] args) {
		PlanetaTerra pt = new PlanetaTerra();
		pt.inicializa();
	}

	public void inicializa() {
		Mamifero leao = new Leao();
		Mamifero golfinho = new Golfinho();

		List<Mamifero> minhaLista = new ArrayList<Mamifero>();
		minhaLista.add(leao);
		minhaLista.add(golfinho);

		for (Mamifero mamifero : minhaLista) {
			mamifero.comer();
			mamifero.nadar();
			mamifero.dormir();
			mamifero.respirar();
			mamifero.pular();

		}

	}

}
