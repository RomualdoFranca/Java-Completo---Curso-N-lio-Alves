package listas.exercicios.aumentasalario.entities;

public class Funcionario {
	private int id;
	private String nome;
	private double salario;

	public Funcionario() {

	}

	public Funcionario(int id, String nome, double salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}

	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public double getSalario() {
		return salario;
	}
	
	@Override
	public String toString() {
		
		return """
				Lista de Empregrados:
				%d, %s, %.2f
				""".formatted(id, nome, salario);
	}
	

}
