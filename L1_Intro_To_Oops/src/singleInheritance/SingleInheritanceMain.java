package singleInheritance;

public class SingleInheritanceMain {
	
	public static void main(String[] args) {
		
		Employee emp = new Employee(1,"ABC");
		emp.display();
		
		FullTimeEmployee fte = new FullTimeEmployee();
		fte.display();
		
		Employee emp2 = new FullTimeEmployee();
		emp2.display();
	}

}
