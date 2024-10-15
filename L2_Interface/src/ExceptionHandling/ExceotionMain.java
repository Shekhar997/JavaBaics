package ExceptionHandling;

public class ExceotionMain {
	
	public static void main(String[] args) {
		
		int a = 10;
		int[] arr = {1,2,3,4};
		try {
			//Files, Calculation, working database. Anything which could have some error use exceptionHandling
			int c = a/0;
			System.out.println(arr[4]);
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		System.out.println("outside finish");
	}

}
