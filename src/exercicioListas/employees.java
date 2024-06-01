package exercicioListas;

public class employees {
	
		private int id;
		private String name;
		private double salary;
		
		public employees(int id, String name, double salary) {
			this.id = id;
			this.name = name;
			this.salary = salary;
		}

		public int getId() {
			return id;
		}

		public String getName() {
			return name;
		}

		public double getSalary() {
			return salary;
		}

		public void giveARaise(double percentage) {
			this.salary += salary*percentage/100;
		}
		
		
	

}
