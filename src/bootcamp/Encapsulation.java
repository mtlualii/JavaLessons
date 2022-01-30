package bootcamp;

class SalaryCalc{
	
	private double salary;
	
	
	public double getSalary() {
		return salary;
	}
	
	
	public void setSalary(double salary) {
		
		if(salary < 0) {
			return;
		}
		
		this.salary = salary;
	}
	
	
}


public class Encapsulation {

	
	
}
