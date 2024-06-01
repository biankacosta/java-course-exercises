package exercicioMatrizes;

import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual a ordem da matriz? ");
		int n = sc.nextInt();
		
		while (n > 10) {
			System.out.print("Número maior do que 10. Por favor, digite um número menor: ");
			n = sc.nextInt();
		}
		
		int[][] matriz = new int[n][n];
		int contNeg = 0;
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.printf("Elemento [%d][%d]: ", i, j);
				matriz[i][j] = sc.nextInt();
				System.out.println();
				
				if (matriz[i][j]< 0) {
					contNeg++;
				}
			}
		}
		
		System.out.println("Diagonal principal:");
		
		for (int i = 0; i < n; i++) {
			System.out.printf("%d ", matriz[i][i]);
		}
		
		System.out.println();
		
		System.out.println("Qtd de números negativos: " + contNeg);
		
		
		
	}

}
