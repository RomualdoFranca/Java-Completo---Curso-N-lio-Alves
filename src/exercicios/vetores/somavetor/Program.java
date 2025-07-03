package exercicios.vetores.somavetor;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		/*
		 * 	- Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
			- Imprimir todos os elementos do vetor
			- Mostrar na tela a soma e a média dos elementos do vetor
		 * */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos números você irá digitar?");
		int n = sc.nextInt();
		sc.nextLine();
		
		
		double[] numerosReais = new double[n];
		double soma = 0.0;
		
		for (int i = 0; i < numerosReais.length; i++) {
			System.out.printf("Digite o %d° número:\n", i + 1);
			numerosReais[i] = sc.nextDouble();
		}
//		System.out.println(Arrays.toString(numerosReais));
		
		System.out.print("Valores = ");
		for (double valor : numerosReais) {
			System.out.printf("   %.1f", valor); // imprime todos os elementos
		}
		System.out.println();
		for (int i = 0; i < numerosReais.length; i++) {
			soma += numerosReais[i];
			
		}
		System.out.printf("Soma = %.2f\n", soma);
		
		double avg = soma / n;
		System.out.printf("Media = %.2f", avg);
		
		sc.close();

	}

}
