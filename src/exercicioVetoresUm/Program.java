package exercicioVetoresUm;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int contador = 0;
		double sum = 0;
		
		System.out.print("Informe a quantidade de alturas: ");
		int qtdAlturas = sc.nextInt();
		
		double[] vect = new double[qtdAlturas];
		
		while (contador < qtdAlturas) {
			System.out.printf("Informe a altura número %d: ", contador+1);
			vect[contador] = sc.nextDouble();
			System.out.println(vect[contador]);
			contador++;
		}
		
		for (int i = 0; i < vect.length; i++) {
			sum += vect[i];
		}
		
		double avg = sum/qtdAlturas;
		
		System.out.println("Average height: " + avg);
		
		sc.close();

	}

}
