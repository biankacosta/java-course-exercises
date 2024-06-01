package exercicioListas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many employees will be registered? ");
		int n = sc.nextInt();
		
		employees[] vectEmp = new employees[n];
		
		List<Integer> empControl = new ArrayList<>();
		
		for (int i = 0; i < n; i++) {
			System.out.printf("Employee #%d%n", i+1);
			System.out.println("Id: ");
			int id;
			
			while (true) {
                id = sc.nextInt();
                
                if (!empControl.contains(id)) {
                	empControl.add(id);
                    break;
                } else {
                    System.out.println("ID já existe. Por favor, insira um ID diferente: ");
                }
			}
			
			sc.nextLine();
			
			System.out.println("Name: ");
			String name = sc.nextLine();
			
			System.out.println("Salary: ");
			double salary = sc.nextDouble();
			
			vectEmp[i] = new employees(id, name, salary);
			
		}
		
		System.out.println("-------------------------");
		
		System.out.println("Enter the employeer's ID whose salary you want to increase: ");
		int raiseId;
		
		while (true) {
			raiseId = sc.nextInt();
            
            if (empControl.contains(raiseId)) {
            	System.out.println("Enter the percentage: ");
        		int percentage = sc.nextInt();
        		
        		int vectRaiseId = empControl.indexOf(raiseId);
        		
        		vectEmp[vectRaiseId].giveARaise(percentage);
                break;
            } else {
                System.out.println("This ID does not exist!");
            }
		}
		
		
		System.out.println("-------------------------");
		System.out.println("List of employees: ");
		
		for (int i = 0; i < n; i++) {
			System.out.printf("%d, %s, %f, %n", vectEmp[i].getId(), vectEmp[i].getName(), vectEmp[i].getSalary());
			i++;
		}
		
		
		
		
			
		
		

	}

}
