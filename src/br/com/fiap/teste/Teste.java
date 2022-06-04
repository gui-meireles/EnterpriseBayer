package br.com.fiap.teste;

import java.util.Scanner;

import br.com.fiap.model.PessoaModel;

public class Teste {

	public static void main(String[] args) {
		TestaInsert();
	}

	public static void TestaInsert() {
		Scanner sc = new Scanner(System.in);
		PessoaModel p = new PessoaModel();
		System.out.print("Digite o seu gênero (M/F): ");
		p.setSexo(sc.next().toUpperCase());
		System.out.print("Digite sua idade: ");
		sc.nextLine();
		p.setIdade(sc.nextInt());
		System.out.print("Digite sua região (1- Norte, 2- Nordeste, 3- Centro-Oeste, 4- Sul, 5- Sudeste): ");
		sc.nextLine();
		p.setRegiao(sc.nextInt());
		System.out.print("Digite sua doença (1- Dengue, 2- ZikaVírus, 3- Malária): ");
		sc.nextLine();
		p.setDoenca(sc.nextInt());
		System.out.print("Digite sua classe social (1- Pobre, 2- Remediado, 3- Média, 4- Elite): ");
		sc.nextLine();
		p.setRenda(sc.nextInt());

		System.out.println("-----------------------------------------------------------------------");
		System.out.println(p.AdicionaUser(p) + " usuário foi inserido com sucesso!");

		sc.close();
	}
}