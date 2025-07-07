package exercicios.vetores.pensionato;

import java.util.Iterator;
import java.util.Scanner;

public class Pensionato {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		// vetor que representa o total de quartos
		int[] quartos = new int[10];
		
//		int numeroQuarto = 1;
//		for (int i = 0; i < quartos.length; i++) {
//			quartos[i] = numeroQuarto;
//			numeroQuarto++;
//		}
//		System.out.println(quartos.length);
		
		System.out.println("Quantos quartos serão alugados? " );
		int quartosAlugados = sc.nextInt();
		sc.nextLine();
		
		
		// vetor que armazena os dados dos clientes da pensao
		String[] dadosClientes = new String[quartosAlugados];
		
		
		
		for (int i = 0; i < dadosClientes.length; i++) {
			
			System.out.println("Digite o nome:");
			String nome = sc.nextLine();
			
			System.out.println("Digite o email:");
			String email = sc.nextLine();
			
			System.out.println("Digite o número do quarto:");
			int numeroQuarto = sc.nextInt();
			sc.nextLine();
			dadosClientes[i] = "Nome: " + nome + "\nEmail:" + email;
		}
		
		System.out.println("Dados dos clientes:");
		for (String string : dadosClientes) {
			System.out.println(string);
		}
		
//		dadosClientes[quartos[0]] = "Maria";
//		dadosClientes[quartos[1]] = "José";
//		System.out.println("Vetor dados dos clientes:" + dadosClientes.length);
//		
//		for (int i = 0; i < quartos.length; i++) {
////			if (dadosClientes[i] != null) {
////			}
//			System.out.println(quartos[i]);
//		}
		
		sc.close();
	}

}
