package ExceptionHandling;

public class ThrowsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		divide(10,0);
		System.out.println("System.ou.ptintln working");

	}
	
	public static double divide(int num, int deno) throws ArithmeticException {
		return num/deno;
	}

}
