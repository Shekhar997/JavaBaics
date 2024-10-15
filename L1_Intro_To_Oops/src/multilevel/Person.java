package multilevel;

public class Person {
	
	String name;
	String gender;
	
	public Person() {
		
	}
	
	public Person(String name, String gender) {
		this.name = name;
		this.gender = gender;
	}
	
	public void display() {
		System.out.println("Display of person called");
	}

}
