package exercicio.matriz01;

import java.util.Iterator;
import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o numero de linhas da matriz");
		int linha  = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Digite o numero de colunas da matriz");
		int coluna = sc.nextInt();
		sc.nextLine();
		
		int[][] mat = new int[linha][coluna];
		
		//imprime os valores da matriz
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
		
		
		sc.close();
	}

}
