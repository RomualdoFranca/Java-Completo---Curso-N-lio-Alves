package Secao10.vetores;

import java.util.Scanner;

public class ProgramVector {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o número de inputs");
		int inputs = sc.nextInt();
		
		System.out.println("Numero de inputs: " + inputs);
		
		int index = 0;
		
		double[] meuVector = new double[inputs];
		double somaAverage = 0;
		
		for (int i = 0; i < meuVector.length; i++) {
			System.out.println("Digite os valores:");
			double average = sc.nextDouble();
			meuVector[i] = average;
			somaAverage += meuVector[i];
		}
		for (double d : meuVector) {
			System.out.println(d);
		}
		System.out.printf("Average = %.2f", somaAverage / inputs);
		
		// O foreach é mais conciso e adequado para adicionar os valores na array
		
//		while (index < inputs) {
//			System.out.println("Index antes do incremento = " + index);
//			System.out.println("Digite os valores:");
//			double average = sc.nextDouble();
//			meuVector[index] = average;
//			index++;
//			System.out.println("Index depois do incremento = " + index);
//			for (double d : meuVector) {
//				System.out.println(d);
//			}
//			
//		}

	}

}
