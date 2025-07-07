package exercicios.correcao.pensao.application;

import java.util.Locale;
import java.util.Scanner;

import exercicios.correcao.pensao.entities.Aluguel;

public class AppPensao {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aluguel aluguel01 = new Aluguel("Maria", "maria@gmail.com");
		
		System.out.println(aluguel01);
		
		sc.close();
	}

}
