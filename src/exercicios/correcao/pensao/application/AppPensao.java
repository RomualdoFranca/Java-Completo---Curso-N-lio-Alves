package exercicios.correcao.pensao.application;

import java.util.Locale;
import java.util.Scanner;

import exercicios.correcao.pensao.entities.Aluguel;

public class AppPensao {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aluguel[] vect = new Aluguel[10]; // vetor de objetos
		
//		Aluguel aluguel01 = new Aluguel("Maria", "maria@gmail.com");
		
		System.out.println("Quantos quartos serão alugados?");
		int quantidadeQuartos = sc.nextInt();
		sc.nextLine();
		
		for (int i = 0; i < quantidadeQuartos; i++) {
			System.out.println("Nome:");
			String nome = sc.nextLine();
			
			System.out.println("Email: ");
			String email = sc.next();
			
			System.out.println("Numero do quarto:");
			int numeroQuarto = sc.nextInt();
			sc.nextLine();
			
			//adiciona os objetos no vetor
			vect[numeroQuarto] = new Aluguel(nome, email);
			System.out.println();
		}
		
		for (int i = 0; i < vect.length; i++) {
			if(vect[i] != null) {
				System.out.println(i + ":" + vect[i]);
				
			}
		}
		sc.close();
	}

}
