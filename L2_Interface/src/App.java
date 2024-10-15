
public class App {
	
	public static void main(String[] args) {
		
		Square sq = new Square(10);
		
		sq.area();
		sq.peri();
		sq.display();
		
		Circle c = new Circle();
		c.area();
		
		Shape s = new Shape();
		s.area(); // area of shape class called
		
		Shape s1 = new Square(20);
		s1.area(); // area of square is called
		
		
	}

}
