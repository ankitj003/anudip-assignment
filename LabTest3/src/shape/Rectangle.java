package shape;

public class Rectangle extends Square
{
	int width;
	
	// Parameterized Constructor
	public Rectangle(int length, int w) 
	{
		super(length);
		this.width = w;
		
	}


	@Override
	public int area() {
		
		return length*width;
	}

}
