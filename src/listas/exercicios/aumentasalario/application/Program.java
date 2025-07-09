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

		// filtra na lista o funcionario que tem o ID inserido pelo usuário
		Funcionario result = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);


		if (result != null) {

			// indice do funcionario que vai receber aumento
			int indicePesquisado = list.indexOf(result);
			// remove o funcionario pesquisado
			list.remove(indicePesquisado);

			System.out.println("Lista depois da remoção");
			System.out.println("Lista de Empregrados:");
			for (Funcionario funcionario : list) {
				System.out.println(funcionario);
			}
			
			System.out.println("Digite a porcentagem do aumento no salário:");
			double porcentagemAumento = sc.nextDouble();

			// adiciona o aumento ao salario
			double novoSalario = result.getSalario() * (1 + porcentagemAumento / 100);
			// cria uma nova instacia do objeto Funcionario com o salario atualizado
			Funcionario funcionarioAtualizado = new Funcionario(result.getId(), result.getNome(), novoSalario);
			// insere a nova instancia no mesmo local da lista
			list.add(indicePesquisado, funcionarioAtualizado);

		} else {
			System.out.println("ID inválido");
		}

		System.out.println("Lista atualizada");
		System.out.println("Lista de Empregrados:");
		for (Funcionario funcionario : list) {
			System.out.println(funcionario);
		}

		sc.close();
	}

}
