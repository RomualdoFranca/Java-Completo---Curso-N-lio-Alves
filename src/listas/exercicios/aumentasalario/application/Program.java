package listas.exercicios.aumentasalario.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collector;

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
		
		
		
		
		System.out.println("Lista de Empregrados:");
		for (Funcionario funcionario : list) {
			System.out.println(funcionario);
		}
		
		System.out.println("Informe o ID do funcionario que vai receber aumento");
		int id = sc.nextInt();
		sc.nextLine();
		
//		List<Funcionario> result = list.stream().filter(x -> x.getId() == id).collect(Collectors.List);
		Funcionario result = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		
//		System.out.println(result);

		if(result != null) {
			System.out.println("ID válido");
		}else {
			System.out.println("ID inválido");
		}
		
		sc.close();
	}

}
