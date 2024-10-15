package singleInheritance;

public class FullTimeEmployee extends Employee {
	
	int sal;
	
	public FullTimeEmployee() {
		
	}
	
	public FullTimeEmployee(int id, String name, int sal) {
		super(id,name);
		this.sal = sal;
	}
	
	public void display() {
		super.display();
		System.out.println("Display of FTE called");
		System.out.println("++++++++++++++++++++++++++");
		System.out.println();
	}

}
