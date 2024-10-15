package ExceptionHandling;

public class Person {
	
	int age;
	String name,email;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) throws InvalidAgeException{
		if (age<18) {
			throw new InvalidAgeException(age+" can't be less then 18");
		}
		this.age = age;
	}
	
	
}
