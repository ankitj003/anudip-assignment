package shape;

public class ShapeMain {

	public static void main(String[] args) {
		
		//Objects Square and Rectangle
		Square s = new Square(8);
		Rectangle r = new Rectangle(4,8);
		
		//Printing 
		System.out.println("Area of square : "+s.area());
		System.out.println("Area of rectangle : "+r.area());
	}

}
