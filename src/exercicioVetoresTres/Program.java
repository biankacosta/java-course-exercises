package exercicioVetoresTres;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many numbers will you enter?");
		int n = sc.nextInt();
		
		while (n > 10) {
			sc.nextLine();
			System.out.println("Enter a number below 11: ");
			n = sc.nextInt();
		}
		
		int[] vect = new int[n];
		
		for (int i = 0; i < vect.length; i++) {
			sc.nextLine();
			System.out.print("Enter a number: ");
			int number = sc.nextInt();
			vect[i] = number;
		}
		
		System.out.println("Negative numbers:");
		
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] < 0) {
				System.out.println(vect[i]);
			}
		}

	}

}
