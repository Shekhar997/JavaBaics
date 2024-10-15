package multilevel;

public class FullTimeEmployee extends Employee {
	
	int sal;
	
	public FullTimeEmployee() {
		
	}
	
	public FullTimeEmployee(int id, String name, int sal,String gender) {
		super(id,name,gender);
		this.sal = sal;
	}
	
	public void display() {
		super.display();
		System.out.println("Display of FTE called");
		System.out.println("++++++++++++++++++++++++++");
		System.out.println();
	}

}
