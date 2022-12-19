package atividades;

import java.util.Scanner;

public class questão4 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int vetor[] = new int[4];
		int referencia, menor=0, igual=0;

		for (int c = 0; c < 4; c++) {
			System.out.println("Informe um valor para o vetor posição " + c);
			vetor[c] = in.nextInt();

		}
		System.out.println("Informe um valor de referência: ");
		referencia = in.nextInt();

		for (int c = 0; c < 4; c++) {
			if (vetor[c]>referencia) {
				System.out.println(vetor[c]+" é um número presente no vetor maior que o valor de referência.");
			} else if (vetor[c]<referencia) {
				menor++;
			} else {
				igual++;
			}

		}
		
		System.out.println(menor+" números são menores que o valor de referência");
		if (igual>0) {
			System.out.println("O valor de referência se repete no vetor "+igual+" vez(es).");
		} else {
			System.out.println("O valor de referência não se encontra no vetor.");
		}
	}
}
