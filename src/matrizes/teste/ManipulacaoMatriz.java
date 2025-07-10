package matrizes.teste;

import java.util.Iterator;
import java.util.Scanner;

public class ManipulacaoMatriz {

	public static void main(String[] args) {

		int linha = 0;
		int coluna = 0;
		int [] vectLinhaColuna = defineTamanhoMatriz(linha, coluna);
		
//		System.out.println("Linha: " + vectLinhaColuna[0] + " Coluna: " + vectLinhaColuna[1]);
		int[][] matriz = new int[vectLinhaColuna[0]][vectLinhaColuna[1]];
		preencheMatrizNumerosAleatorios(matriz);
		imprimeMatriz(matriz);

		imprimeDiagonalPrincipal(matriz);
		imprimeDiagonalSecundaria(matriz);
		
//		imprimeMatriz(matriz);
		int numeroPesquisa = 0;
		pesquisaNumeroMatriz(matriz, numeroPesquisa);
	}
	//fim do metodo main
	
	public static int[] defineTamanhoMatriz(int linha, int coluna) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de linha:");
		linha = sc.nextInt();
		
		System.out.println("Digite a quantidade de coluna:");
		coluna = sc.nextInt();
		sc.nextLine();
		
		sc.close();
		return new int[] {linha, coluna};
	}
	
	public static void preencheMatrizNumerosAleatorios(int[][] nomeMatriz) {
		int min = 0;
		int max = 9;
		
		for (int i = 0; i < nomeMatriz.length; i++) {
			for (int j = 0; j < nomeMatriz[i].length; j++) {
				nomeMatriz[i][j] = (int) (Math.random() * (max - min + 1) + min);
			}
		}
	}
	
	//metodo para imprimir os elementos de uma martiz
	public static void imprimeMatriz(int[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("-----------------------");
	}
	
	public static void imprimeDiagonalPrincipal(int[][] nomeMatriz) {
		System.out.println("Diagonal principal");
		for (int i = 0; i < nomeMatriz.length; i++) {
			for (int j = 0; j < nomeMatriz[i].length; j++) {
				if (i == j) {
					System.out.print(nomeMatriz[i][j] + " ");
					
				}
			}
//			System.out.println();
		}
		System.out.println("\n-----------------------");
	}
	
	public static void imprimeDiagonalSecundaria(int[][] nomeMatriz) {
		System.out.println("Diagonal Secundária");
		int indiceLinha = nomeMatriz.length - 1;
		for (int i = 0; i < nomeMatriz.length; i++) {
			for (int j = 0; j < nomeMatriz[i].length; j++) {
				if (indiceLinha >= 0) {
					// zera os valores da diagonal
//					nomeMatriz[indiceLinha][j] = 0; 
					System.out.print(nomeMatriz[indiceLinha][j] + " ");
					
				}
				indiceLinha--;
				
			}
		}
		System.out.println("\n-----------------------");
	}
	
	public static void pesquisaNumeroMatriz(int[][] matriz, int num) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o numero para ser pesquisado");
		num = sc.nextInt();
		sc.nextLine();
		
		if (matriz.equals(num) == true) {
			System.out.println("O numero inserido está contido na matriz");
		}else {
			System.out.println("O numero inserido não se encontra na matriz");
		}
		
		
		
		
		
		sc.close();
	}
	
	public static void informaPosicaoSemNumero(int[][] matriz) {
		
	}
	
}
