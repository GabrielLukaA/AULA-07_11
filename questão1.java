package aula07_11;
import java.util.Scanner;
public class questão1 {

	public static void main(String[] args) {
		
		int a []  = new int [10], b [] = new int[10], c [] = new int [10], numero, contador=0;
		
		Scanner in = new Scanner (System.in);
		
		for (;contador<10;contador++) {
			System.out.println("Informe um número inteiro para A"+(contador+1)+": ");
			a[contador] = in.nextInt();
			
			System.out.println("Informe um número inteiro para B"+(contador+1)+": ");
			b[contador] = in.nextInt();
			
			c[contador] = a[contador] - b[contador];
			
		}
		contador=0;
		for (;contador<c.length;contador++) {
			System.out.println("O valor de C" + (contador+1) + " é " + c[contador]);
		}

	}

}
