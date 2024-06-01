package exercicioFuncionario;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Funcionario funcionario = new Funcionario();
		
		System.out.print("Insira nome: ");
		funcionario.nome = sc.next();
		System.out.print("Insira o salário bruto: ");
		funcionario.grossSalary = sc.nextDouble();
		System.out.print("Insira o imposto: ");
		funcionario.tax = sc.nextDouble();
		
		System.out.println(funcionario);
		
		System.out.print("Qual a porcentagem de aumento de salário? ");
		double porcentagem = sc.nextDouble();
		funcionario.increaseSalary(porcentagem);
		
		System.out.println(funcionario);
		
		sc.close();
	}

}
