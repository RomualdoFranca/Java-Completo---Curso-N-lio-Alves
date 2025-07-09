package exercicio.matriz01;

import java.util.Iterator;
import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//testa a geraçao de numeros aleatorios
//		int num = 1;
//		int[] list = new int[10];
//		
//		for (int i = 0; i < list.length; i++) {
//			list[i] = num;
//			num++;
//		}
//
//		for (int i : list) {
//			System.out.print(i + " ");
//		}
//		System.out.println();
		

		System.out.println("Digite o numero de linhas da matriz");
		int linha  = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Digite o numero de colunas da matriz");
		int coluna = sc.nextInt();
		sc.nextLine();
		
		int[][] mat = new int[linha][coluna];
		
		//preenche a matriz com inteiros de 1 a 9
		int num = 1;
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = num;
				num++;
			}
		}
		
		imprimeValores(mat);
		
		//imprime os valores da matriz
//		for (int i = 0; i < mat.length; i++) {
//			for (int j = 0; j < mat[i].length; j++) {
//				System.out.print(mat[i][j] + " ");
//			}
//			System.out.println();
//		}
		
		
		sc.close();
	}
	
	public static void imprimeValores(int[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
	}

}
