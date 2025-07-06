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
		// iterar sobre a array numeros[]
		System.out.println("Array com todos os numeros");
		for(int i : numeros) {
			System.out.print(i + " ");
		}
		System.out.println();
	

		// Armazenar a quantidade de numeros pares encontrados e define o tamanho da nova array de numeros pares
		int quantidadeNumerosPares = 0;
		
		// Percorrer a array numeros[] em busca de  numeros pares
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] % 2 == 0) {
				quantidadeNumerosPares += 1;
//				System.out.println("Numero par " + numeros[i] + "\nQuantidade: " + quantidadeNumerosPares);		
				
			}//else {
				//System.out.println("Número impar");
			//}
		}
		
		// verifica a quantidade de numeros pares na array
		System.out.println("Quantidade de numeros pares " + quantidadeNumerosPares);
		
		int[] numerosPares = new int[quantidadeNumerosPares];// cria uma array de numeros pares
		
		// verifica o tamanho da array para confirmar se é o mesmo valor da quantidade de numeros pares da variável
		System.out.println("Tamanho da array de numeros pares: " + numerosPares.length);
		
		// acrescenta os numeros pares encontrados na nova array
//		for (int i = 0; i < numeros.length; i++) {
//			if(numeros[i] % 2 == 0) {
//				
//				for(int j = 0; j < numerosPares.length; j++) {
//					numerosPares[j] = numeros[i]; 
//					
//				}
//				
//			}
////			System.out.print("Array de numeros pares: \n" + numerosPares[j] + " \n");
//		}
		
		for (int i = 0; i < numerosPares.length; i++) {
			
			int indiceNumerosPares = 0;
			for(int j = 0; j < numeros.length; j++) {
				if(numeros[j] % 2 == 0) {
					
					numerosPares[indiceNumerosPares] = numeros[j]; 
					indiceNumerosPares++;
				}
				
			}
		}
		
		
		
		
		// iterar sobre a array numerosPares[]
				System.out.println("Array apenas com os numeros pares");
				for(int i : numerosPares) {
					System.out.print(i + " ");
				}
				System.out.println();
		
//		System.out.println("Numeros da array dos numeros pares:");
//		for (int i = 0; i < numerosPares.length; i++) {
//			System.out.print(numerosPares[i] + " \n");
//		}
		
		
		sc.close();

	}


}
