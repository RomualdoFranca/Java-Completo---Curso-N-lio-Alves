package exercicios.correcao.pensao.entities;

public class Aluguel {
	
	private String nome;
	private String email;
	
	public Aluguel() {
		
	}

	public Aluguel(String nome, String email) {
		this.nome = nome;
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return nome + ", " + email;
	}
	
	

}
