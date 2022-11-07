package aula07_11;

import java.util.Scanner;

public class questão3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int quantiaNumeros;
		int contador2=1;
		int numerosEmOrdem[] = new int[10];

		System.out.println("Informe quantos números você deseja: ");
		quantiaNumeros = in.nextInt();

		int numeros[] = new int[quantiaNumeros];

		for (int contador = 0; contador < quantiaNumeros; contador++) {
			System.out.print("Informe um número inteiro: ");
			numeros[contador] = in.nextInt();
		}
		for (int contador = 0; contador < quantiaNumeros; contador++) {
			if (contador == 0) {
				numerosEmOrdem[contador] = numeros[contador];
			} else if (contador > 0) {
				if (numerosEmOrdem[contador] > numerosEmOrdem[contador - contador2]) {
					numerosEmOrdem[contador] = numeros[contador];
					contador2++;
				}
			}
		}
		for (int contador = 0; contador < quantiaNumeros; contador++) {

			System.out.println("Em ordem crescente: \n" + numerosEmOrdem[contador]);
		}
	}
}
