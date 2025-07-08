package listas.topicos;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lista01 {

	public static void main(String[] args) {

		// List<> é e Interface
		// ArrayList<> é uma das classes que implementa a Interface
		List<String> list = new ArrayList<>();

		// adiciona elementos
		list.add("Maria");
		list.add("Puga");
		list.add("Maga");
		list.add("Rolf");

		// itera sobre a lista
		for (String string : list) {
			System.out.print(string + " ");
		}
		System.out.println("\n------------------------");
		
		
		// tamanho da lista
		System.out.println(list.size());

		System.out.println("Inserindo elemento em uma determinada posicao");
		list.add(2, "Demo");
		
		// itera sobre a lista
		for (String string : list) {
			System.out.println(string);
		}
		System.out.println("------------------------");
		
		// remove elementos por comparação
		list.remove("Demo");
		
		// remove elementos pelo indice
		list.remove(3);
		
		System.out.println("Removendo elemento pelo indice");
		for (String string : list) {
			System.out.println(string);
		}
		System.out.println("------------------------");
		
		// remove elemento utilizando expressão Lambda (predicado) o predicado retorna
		// um valor booleano

		list.removeIf(x -> x.charAt(0) == 'M'); //atenção para a aspas simples
		
		System.out.println("Remove utilizando expressão Lambda");
		for (String string : list) {
			System.out.println(string);
		}
		
		list.add("Maria");
		list.add("Maga");
		list.add("Rolf");
		
		System.out.println("Encontrado a posição de determinado elemento utilizando o nome do elemento");
		System.out.println("Index of Rolf: " + list.indexOf("Rolf"));
		
		for (String string : list) {
			System.out.println(string);
		}
		
		//filtrando elementos da lista
		//cria-se uma nova lista para conter apenas os elementos que serão filtrados
		List<String> result = list.stream().filter(x -> x.charAt(0) == ('M')).collect(Collectors.toList());
		/*
		 * Explicação:
		 * .stream(): converte a lista em um tipo stream que aceita expressões Lambdas
		 * .filter(): função que aceita o predicado (x -> x.charAt(0) == ('M'))
		 * O filter() vai devolver um stream() com o predicado inserido
		 * O stream() não é compatível com list, por isso é necessária um conversão
		 * collect(Collect.toList()): converte o stream() em list*/
		System.out.println("Filtrando elementos da lista");
		for (String string : result) {
			System.out.println(string);
		}
		
		//como encontrar um elemento da lista que atenda a certo predicado
		System.out.println("Busca o 1° elemento que inicia com uma determinada letra");
		String nome = list.stream().filter(x -> x.charAt(0) == 'R').findFirst().orElseGet(null);
		System.out.println(nome);
		
		
	}

}
