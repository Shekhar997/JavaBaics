
public interface Area {
	
	//variables
	
	double pi = 3.14;
	
	public static final double  PI = 3.14;
	public void area();
	
	default void display() {
		System.out.println("Defalt method of the area interface");
	}

}
