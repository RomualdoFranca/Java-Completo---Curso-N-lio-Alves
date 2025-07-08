package listas.exercicios.aumentasalario.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import listas.exercicios.aumentasalario.entities.Funcionario;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Funcionario> list = new ArrayList();
		
		System.out.println("Quantos funcionarios serão registrados?");
		int numeroFuncionarios = sc.nextInt();
		sc.nextLine();
		
		for (int i = 0; i < numeroFuncionarios; i++) {
			System.out.println("Funcionario #" + (i + 1));
			System.out.println("ID:");
			int id = sc.nextInt();
			sc.nextLine();
			
			System.out.println("Nome:");
			String nome = sc.nextLine();
			
			System.out.println("Salário:");
			double salario = sc.nextDouble();
			sc.nextLine();
			
			list.add(new Funcionario(id, nome, salario));
		}
		
		for (Funcionario funcionario : list) {
			System.out.println(funcionario);
		}
		
		sc.close();
	}

}
