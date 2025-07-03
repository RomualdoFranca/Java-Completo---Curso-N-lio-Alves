package exercicios.vetores.problemanegativo;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		/*
		 * 	Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
			e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos.
		 * */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos números você irá digitar?");
		int n = sc.nextInt();
		sc.nextLine();
		
		int[] numeros = new int[n];
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.printf("Digite o %d° número\n", i + 1);
			
			numeros[i] = sc.nextInt();
		}
		
		for (int i = 0; i < numeros.length; i++) {
			
			if (numeros[i] < 0) {
//				System.out.println("Números negativos:");
				System.out.println(numeros[i]);
			}
			
		}
		
		
		sc.close();
	}

}
