package exercicioNotas;

public class Aluno {
	
	public String nome;
	public double firstGrade;
	public double secondGrade;
	public double thirdGrade;
	
	public double notaFinal() {
		return firstGrade + secondGrade + thirdGrade;
	}
	
	public void approvedOrNot() {
		double nota = notaFinal();
		if (nota >= 60.0) {
			System.out.println("Approved.");
		} else {
			System.out.println("Reproved.");
			double missingGrade = 60.0 - nota;
			System.out.printf("Missing %.2f points", missingGrade);
		}
	}

}
