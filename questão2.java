package aula07_11;

import java.util.Scanner;

public class questão2 {

	public static void main(String[] args) {

		int quantidadeNomes, codigo = 1, verificadorNao=0, nomesValidos=0;

		Scanner in = new Scanner(System.in);
		String nomePesquisa = new String();

		System.out.println("Informe a quantidade de nomes: ");
		quantidadeNomes = in.nextInt();

		String nome[] = new String[quantidadeNomes];
		long telefone[] = new long[quantidadeNomes];

		for (int contador = 0; contador < quantidadeNomes; contador++) {
			System.out.println("Informe um nome: ");
			nome[contador] = in.next();

			System.out.println("Informe o telefone dessa pessoa: ");
			telefone[contador] = in.nextLong();
		}

		for (; codigo != 2; codigo = codigo) {
			System.out.println("Informe o que você deseja fazer:\n1 - Pesquisar nome\n2 - Encerrar programa.");
			codigo = in.nextInt();

			if (codigo == 1) {
				System.out.println("Informe o nome da pessoa que você deseja saber o telefone: ");
				nomePesquisa = in.next();
				verificadorNao++;

				for (int verificador = 0; verificador < quantidadeNomes; verificador++) {
					if (nomePesquisa.equals(nome[verificador])) {
						System.out.println("O número de " + nome[verificador] + " é: " + telefone[verificador]);
						nomesValidos++;
					} 
					}

				
			if (verificadorNao > nomesValidos) {
				System.out.println("Nome não consta no banco de dados.");
			}
			}
		}
	}
	}
