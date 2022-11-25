package aula07_11;
import java.util.Arrays;
import java.util.Scanner;

public class questão3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int quantiaNumeros;
		int a = 0;
		System.out.println("Informe quantos números você deseja: ");
		quantiaNumeros = in.nextInt();

		int numero[] = new int[quantiaNumeros];
		int EmOrdem[] = new int[quantiaNumeros];

		for (int c = 0; c < quantiaNumeros; c++) {
			System.out.print("Informe um número inteiro: ");
			numero[c] = in.nextInt();
		}

			Arrays.sort(numero);
			
			
			System.out.println("\nEm ordem crescente\n");
			for (int x=0;x<quantiaNumeros;x++) {
				System.out.println(numero[x]);
			}
	}
}
