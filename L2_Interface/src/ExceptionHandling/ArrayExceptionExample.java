package ExceptionHandling;

public class ArrayExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {1,2,3,4,5};
		
		try {
			System.out.println(a[4]);
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("Inside fianlly");
		}
		

	}

}
