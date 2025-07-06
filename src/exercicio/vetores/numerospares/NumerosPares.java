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
		
		// alimenta a array de inteiros com os numeros digitados
		for (int i = 0; i < numeros.length; i++) {
			
			System.out.printf("Digite o %d° número\n", i + 1);
			numeros[i] = sc.nextInt();
			
		}
		// Depois que a array estiver alimentada os com numeros, criar uma outra array apenas com os numeros pares.
		// Armazenar a quantidade de numeros encontrados numa variavel que vai ser 
		
		// Percorrer a array numeros[] em busca de  numeros pares

		int quantidadeNumerosPares = 0;
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] % 2 == 0) {
				quantidadeNumerosPares += 1;
				System.out.println("Numero par " + numeros[i] + "\nQuantidade: " + quantidadeNumerosPares);
			}else {
				System.out.println("Numero impar " + numeros[i]);
			}
		}
		
		
		sc.close();

	}


}
