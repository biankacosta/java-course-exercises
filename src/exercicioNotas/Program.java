package exercicioNotas;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		
		System.out.print("Insira nome: ");
		aluno.nome = sc.next();
		System.out.print("Insira primeira nota: ");
		aluno.firstGrade = sc.nextDouble();
		System.out.print("Insira segunda nota: ");
		aluno.secondGrade = sc.nextDouble();
		System.out.print("Insira terceira nota: ");
		aluno.thirdGrade = sc.nextDouble();
		
		System.out.println("Nota final: " + aluno.notaFinal());
		
		aluno.approvedOrNot();
		
		sc.close();
	}

}
