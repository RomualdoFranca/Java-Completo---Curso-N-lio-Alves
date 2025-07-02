package com.vetores.teste01;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantidade de produtos");
		int quantidade = sc.nextInt();
		
		
		for (int i = 0; i < args.length; i++) {
			
		}
		
		System.out.println("Nome do produto.");
		String nome = sc.nextLine();
		System.out.println("Preço do produto");
		double preco = sc.nextDouble();
		
		Products product01 =  new Products(nome, preco);
		System.out.println(product01.getName());
	}

}
