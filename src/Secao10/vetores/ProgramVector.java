package Secao10.vetores;

import java.util.Locale;
import java.util.Scanner;

public class ProgramVector {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double[] vect = new double[n];
		// enquanto o 'i' for menor que 'n', o laço vai repetir. 
		// Também daria certo se, no lugar do 'n' ussássemos vect.length
		for (int i = 0; i < n; i++) {
			vect[i] = sc.nextDouble();
		}
		double soma = 0.0;
		for (int i = 0; i < vect.length; i++) {
			soma += vect[i]; // soma todos os elementos adicionados e armazena na variavel
		}
		
		double avg = soma / n; // armazena o valor da soma dos elementos dividido pela quantidade deles
		System.out.printf("Average = %.2f", avg);
		
		sc.close();

	}

}
