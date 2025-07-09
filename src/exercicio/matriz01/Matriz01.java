package exercicio.matriz01;

import java.util.Scanner;

public class Matriz01 {

	/*
	 * ler dois numeros para definir a quantidade de linhas e colunas
	 * preencher a matriz com numeros inteiros
	 * 
	 * escolher um dos numeros inseridos na matriz
	 * para cada ocorrencia do numero escolhido:
	 * mostrar os valores nas quatros posições  que cercam o numero
	 * esquerda, direita, abaixo e acima
	 * quando não houver a ocorrencia de numeros vizinhos, não imprimir*/
	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o numero de linhas da matriz");
		int linhas  = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Digite o numero de colunas da matriz");
		int colunas = sc.nextInt();
		sc.nextLine();
		
		
		sc.close();
	}

}
