package multilevel;

public class MultilevelInheritanceMain {
	
	public static void main(String[] args) {
		
		Person p = new Person();
		
		Employee emp = new Employee(1,"ABC","male");
		emp.display();
		
		FullTimeEmployee fte = new FullTimeEmployee();
		fte.display();
		
		Employee emp2 = new FullTimeEmployee();
		emp2.display();
		
		Person p2 = new FullTimeEmployee();
	}

}
