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
		
		System.out.println("Matriz de numeros sequenciais");
		preencheMatrizNumerosSequenciais(mat);
		imprimeValores(mat);
		
		System.out.println("Matriz de numeros aleatorios");
		preencheMatrizNumerosAleatorios(mat);
		imprimeValores(mat);
		
		sc.close();
	}
	
	public static void preencheMatrizNumerosSequenciais(int[][] matriz) {
		
		//preenche a matriz com inteiros de 1 a 9
		int num = 1;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = num;
				num++;
			}
		}
	}
	public static void preencheMatrizNumerosAleatorios(int[][] matriz) {
		
		int min = 1;
		int max = 9;
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = (int) (Math.random() * (max - min + 1)) + min;
				
			}
		}
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
