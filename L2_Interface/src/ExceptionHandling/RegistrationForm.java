	package ExceptionHandling;

public class RegistrationForm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			register("Shekhar",20);
		}
		catch(InvalidAgeException e) {
			e.printStackTrace();
		}
		

	}
	
	public static void register(String name, int age) throws InvalidAgeException{
		
		
		if(age > 18) {
			
		}
		else {
			throw new InvalidAgeException(age + " can't be less then 18");
		}
	}

}
