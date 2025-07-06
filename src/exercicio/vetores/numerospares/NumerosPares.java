package exercicio.vetores.numerospares;

import java.util.Locale;
import java.util.Scanner;

public class NumerosPares {

	public static void main(String[] args) {
		/*	Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na
			tela todos os números pares, e também a quantidade de números pares
		 * */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos números você vai digitar?");
		int totalDeNumeros = sc.nextInt();
		sc.nextLine();
		// array para armazenar os numeros
		int[] numeros = new int[totalDeNumeros];
		
		for (int i = 0; i < numeros.length; i++) {
			
			System.out.printf("Digite o %d° número\n", i + 1);
			numeros[i] = sc.nextInt();
			
		}
		
		for (int i : numeros) {
			System.out.print(i + "-");
		}
		
		
		sc.close();

	}


}
