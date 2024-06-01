package exercicioCambio;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira a cotação do dólar: ");
		Cambio.valueDollar = sc.nextDouble();
		System.out.print("Insira o valor a ser convertido: ");
		double valorRepassado = sc.nextDouble();
		
		System.out.println("O valor final a ser pago é: " + Cambio.amountToBePay(valorRepassado));
		
		sc.close();

	}

}
