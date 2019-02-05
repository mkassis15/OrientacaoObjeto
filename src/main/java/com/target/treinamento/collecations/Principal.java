package com.target.treinamento.collecations;

import java.util.ArrayList;
import java.util.Collections;
import java.util.DuplicateFormatFlagsException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import com.target.treinamento.orientacaoObjeto1.dominio.Pessoa;

public class Principal {

	public static void main(String[] args) {

		// Set<String> hashSet = new HashSet<String>();
		//
		// // Inteface minhaVariavel = new Implementação
		//
		// hashSet.add("João");
		// hashSet.add("Pedro");
		// hashSet.add("Lucas");
		// hashSet.add("Eduardo");
		// hashSet.add("Maria");
		//
		// for (String valor : hashSet) {
		// System.out.println(valor);
		// }
		//
		//

		// List<Pessoa> minhaLista = new ArrayList<Pessoa>();
		//
		// // Inteface minhaVariavel = new Implementação
		//
		// minhaLista.add(new Pessoa("João", "5050"));
		// minhaLista.add(new Pessoa("Pedro","55250"));
		// minhaLista.add(new Pessoa("Lucas","23350"));
		// minhaLista.add(new Pessoa("Eduardo","55156"));
		// minhaLista.add(new Pessoa("Maria","58654"));
		//
		// for (Pessoa pessoa : minhaLista) {
		// System.out.println(pessoa.getNome() + "-" + pessoa.getRg() +
		// "hashcode:"+pessoa.toString());
		// }

		List<Integer> num = new ArrayList<Integer>();

		num.add(new Integer(15));
		num.add(new Integer(-25));
		num.add(new Integer(12));
		num.add(new Integer(9));
		num.add(new Integer(20));
		num.add(new Integer(45));
		num.add(new Integer(19));
		num.add(new Integer(74));
		num.add(new Integer(-45));
		num.add(new Integer(0));
		num.add(new Integer(0));
		num.add(new Integer(0));
		num.add(new Integer(1));
		num.add(new Integer(22));
		num.add(new Integer(1));
		num.add(new Integer(2));

		
		List<Integer> num2 = new ArrayList<Integer>(num);
		System.out.println(num2);

		System.out.println(num.get(10));

		Collections.sort(num);
		System.out.println(num);
		
		
		List<Integer> linkedlist = new LinkedList<Integer>(num2);
		//Iterator<Integer> iterator = LinkedList.iterator();
		
		//while (iterator.hashCode()) {
			//Integer elemento = iterator.next();
			
		}
		

		
		

	}







