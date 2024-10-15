package ExceptionHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowsExample2 {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		try {
			divide("/");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("System.ou.ptintln working");

	}
	
	public static void divide(String path) throws FileNotFoundException {
		
		FileReader f = new FileReader(path);
		BufferedReader b = new BufferedReader(f);
		//return num/deno;
	}

}
