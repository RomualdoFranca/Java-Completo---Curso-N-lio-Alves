package exercicio.matriz01;

import java.util.Iterator;
import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {


//		System.out.println();
		
//		System.out.println("Digite o numero de linhas da matriz");
//		int linha  = sc.nextInt();
//		sc.nextLine();
//		
//		System.out.println("Digite o numero de colunas da matriz");
//		int coluna = sc.nextInt();
//		sc.nextLine();
		
		int linha = 0;
		int coluna = 0;
		int[] resultado = defineLinhaColuna(linha, coluna);
		//verifica se os valores foram armazenados nas variaveis
//		System.out.println("linha " + resultado[0] + "\ncoluna " + resultado[1]);
//		
		int[][] mat = new int[resultado[0]][resultado[1]];
		
		
		System.out.println("Matriz de numeros sequenciais");
		preencheMatrizNumerosSequenciais(mat);
		imprimeValores(mat);
		
		System.out.println("Matriz de numeros aleatorios");
		preencheMatrizNumerosAleatorios(mat);
		imprimeValores(mat);
		
	}
	
	public static int[] defineLinhaColuna(int linha, int coluna) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o numero de linhas da matriz");
		linha  = sc.nextInt();
		sc.nextLine();
		System.out.println("Digite o numero de colunas da matriz");
		coluna = sc.nextInt();
		sc.nextLine();
		
		sc.close();
		return new int[] {linha, coluna};
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
