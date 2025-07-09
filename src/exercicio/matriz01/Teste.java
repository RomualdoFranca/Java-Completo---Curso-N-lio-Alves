package exercicio.matriz01;

import java.util.Iterator;
import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {

		//variaveis para armezar os valores inseridos no metodo de definicao do tamanho da matriz
		int linha = 0;
		int coluna = 0;
		int[] resultado = defineLinhaColuna(linha, coluna);
		//verifica se os valores foram armazenados nas variaveis
//		System.out.println("linha " + resultado[0] + "\ncoluna " + resultado[1]);
//		
		//cria a matriz com os valores definidos no metodo
		int[][] mat = new int[resultado[0]][resultado[1]];
		
//		System.out.println("Simulando resultado do jogo do Bicho");
//		metodoTeste(mat);
//		imprimeValores(mat);
		int num = 0;
		num = verificaNumerosVizinhos();
		System.out.println(num);
		
		System.out.println("Matriz de numeros sequenciais");
		preencheMatrizNumerosSequenciais(mat);
		imprimeValores(mat);
//		
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
		
		int min = 0;
		int max = 9;
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = (int) (Math.random() * (max - min + 1)) + min;
				
			}
		}
	}
	
	//gerar vetor com 4 algarismo que não inicie com zero
	public static void metodoTeste(int[][] matriz) {
		int min = 0;
		int max = 9;
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				int numeroAleatorio = (int) (Math.random() * (max - min + 1) + min);
				
				if (j == 0 && numeroAleatorio == 0) {
					numeroAleatorio = (int) (Math.random() * (max - min + 1) + min);
					matriz[i][j] = numeroAleatorio;
				}else {
					matriz[i][j] = numeroAleatorio;
					
				}
			}
		}
	}
	
	
	//selecionar numero da matriz
	public static int verificaNumerosVizinhos() {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		System.out.println("Escolha um dos numero da matriz:");
		num = sc.nextInt();
		return num;
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
