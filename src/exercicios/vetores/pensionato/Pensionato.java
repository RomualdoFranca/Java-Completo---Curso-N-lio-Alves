package exercicios.vetores.pensionato;

import java.util.Iterator;
import java.util.Scanner;

public class Pensionato {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		// vetor que representa o total de quartos
		String[] quartos = new String[10];
		
//		int numeroQuarto = 1;
//		for (int i = 0; i < quartos.length; i++) {
//			quartos[i] = numeroQuarto;
//			numeroQuarto++;
//		}
//		System.out.println(quartos.length);
		
		System.out.println("Quantos quartos serão alugados? " );// define o tamanho do vetor dos dados dos clientes
		int quartosAlugados = sc.nextInt();
		sc.nextLine();
		
		
		// vetor que armazena os dados dos clientes da pensao
		String[] dadosClientes = new String[quartosAlugados];
		
		// adiciona os dados dos clientes no vetor
		for (int i = 0; i < dadosClientes.length; i++) {
			
			System.out.println("Digite o nome:");
			String nome = sc.nextLine();
			
			System.out.println("Digite o email:");
			String email = sc.nextLine();
			
			System.out.println("Digite o número do quarto:");
			int numeroQuarto = sc.nextInt();
			sc.nextLine();
			
			dadosClientes[i] = numeroQuarto + ": " + nome + ", " + email;

			for(int j = 0; j < quartos.length; j++) {
				quartos[numeroQuarto] = dadosClientes[i];
			}
			
		}
		
		
		
		System.out.println("Dados dos clientes:");
		for (String string : quartos) {
			if(string != null) {
				System.out.println(string);
				
			}
		}
		
		// o numero do quarto será o numero do indice do vetor dos quartos.
		
		sc.close();
	}

}
