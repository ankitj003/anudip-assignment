package shape;

public class Square implements Shape
{
	
	int length;
	
	 
	Square(int l) 
	{
		this.length = l;
	}


	@Override
	public int area() {
	
		return length*length;
	}

}
