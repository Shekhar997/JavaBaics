public class Square extends Shape implements Area,Perimeter{

	int side;
	
	public Square(int side) {
		this.side = side;
	}
	
	@Override
	public void area() {
		// TODO Auto-generated method stub
		int a = side * side;
		
		System.out.println("Area of square is "+ a);
		
	}
	
	public void area(int num) {
		// TODO Auto-generated method stub
		int a = side * side;
		
		System.out.println("Area of square is "+ a);
		//return a;
		
	}

	@Override
	public void peri() {
		// TODO Auto-generated method stub
		int p = 4 * side;
		
		System.out.println("Perimeter of square is "+p);
		
	}
	
	
	

}
