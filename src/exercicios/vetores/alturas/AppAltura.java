package exercicios.vetores.alturas;

import java.util.Locale;
import java.util.Scanner;

public class AppAltura {

	public static void main(String[] args) {
		/*
		 * 	Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
			tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
			bem como os nomes dessas pessoas caso houver*/
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas pessoas serão digitadas?");
		int n = sc.nextInt();
		sc.nextLine();
		
		double soma = 0.0;
		Pessoa[] p = new Pessoa[n];
		
		for (int i = 0; i < p.length; i++) {
			
			System.out.println("Nome: ");
			String nome = sc.nextLine();
			
			System.out.println("Idade: ");
			int idade = sc.nextInt();
			
			System.out.println("Altura: ");
			double altura = sc.nextDouble();
			sc.nextLine();
			
			p[i] = new Pessoa(nome, idade, altura);
		}
		
		for (int i = 0; i < p.length; i++) {
			soma += p[i].getAltura();
		}
		
		double avg = soma / n;
		System.out.printf("Altura média: %.2f\n", avg);
		
		System.out.printf("Pessoas com menos de 16 anos ");
		for (int i = 0; i < p.length; i++) {
			
			int count = 0;
			double porcentagem = 0.0;
			
			if(p[i].getIdade() < 16) {
				count++;
				porcentagem = (100 * count) / n;
				System.out.printf("%.1f%% \n", porcentagem);
				
			}else {
				System.out.println("Dentro do else " + porcentagem + "%%");
			}
		}
		
		// Só é possível realizar o output dos dados do objeto sobrescrevendo o método toString()
//		for (Pessoa valor : p) {
//			System.out.println(" " + valor);
//		}
		
		
		sc.close();

	}

}
