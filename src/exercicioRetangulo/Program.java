package exercicioRetangulo;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		retangleApplication retangle = new retangleApplication();
		
		System.out.println("Digite a largura do triângulo: ");
		retangle.width = sc.nextDouble();
		System.out.println("Digite a altura do triângulo: ");
		retangle.height = sc.nextDouble();
		
		System.out.println("Area: " + retangle.area());
		System.out.println("Perímetro: " + retangle.perimeter());
		System.out.println("Diagonal: " + retangle.diagonal());
		
		sc.close();

	}

}
