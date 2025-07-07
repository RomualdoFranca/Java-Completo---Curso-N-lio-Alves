package exercicios.vetores.somavetor;

import java.util.Scanner;

public class SomaVetores2 {

	public static void main(String[] args) {
		/*Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um
		terceiro vetor C onde cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima
		o vetor C gerado.*/

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos valores terá cada vetor?");
		int quantidadeVetores = sc.nextInt();
		sc.nextLine();
		
		int[] vetorA = new int[quantidadeVetores];
		
		System.out.printf("Digite os %d valores do vetor A\n", quantidadeVetores);
		for (int i = 0; i < vetorA.length; i++) {
			System.out.printf("Digite o %d° valor:\n", i + 1);
			vetorA[i] = sc.nextInt();
		}
		
		int[] vetorB = new int[quantidadeVetores];
		
		System.out.printf("Digite os %d valores do vetor B\n", quantidadeVetores);
		for (int i = 0; i < vetorB.length; i++) {
			System.out.printf("Digite o %d° valor:\n", i + 1);
			vetorB[i] = sc.nextInt();
		}
		
		
		// itera sobre o vetor A
		System.out.println("Elementos do vetor A");
		for (int i : vetorA) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		// itera sobre o vetor B
		System.out.println("Elementos do vetor B");
		for (int i : vetorB) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		
		int[] somaValoresVetores = new int[quantidadeVetores];
		
		// pegar os valores com o mesmo indice de cada vetor, somá-los e adicionar no novo vetor
		for (int i = 0; i < somaValoresVetores.length; i++) {
			somaValoresVetores[i] = vetorA[i] + vetorB[i];
		}
		
		//itera sobre o vetor de soma
		System.out.println("Vetor com os valores somados");
		for (int i : somaValoresVetores) {
			System.out.print(i + " ");
		}
		
		
		sc.close();
		
	}

}
