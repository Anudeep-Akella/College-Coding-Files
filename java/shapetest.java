class Rectangle
{
	double length,width;
	Rectangle(double length,double width)
	{
		this.length = length;
		this.width = width;
	}
	double getArea()
	{
		return length * width;
	}
	double getPerimeter()
	{
		return 2 * (length + width);
	}

}

//Child class
class Box extends Rectangle
{
	double depth;
	Box(double length,double width,double depth)
	{
		//'super' calls the parent Rectangle constructor
		super(length,width);
		this.depth = depth;
	}
	//take the area from Rectangle
	//Surface Area = (lw + wd + ld)
	double getSurfaceArea()
	{
		return 2 * (super.getArea() + (width * depth) + (length * depth));
	}
	// In 3D box Perimeter refers to sum of all the edges
	double getEdgeSum()
	{
		return 4 * (length + width + depth);
	}
}

public class shapetest
{
	public static void main(String[] args)
	{
		Rectangle rect = new Rectangle(12,8);
		System.out.println("------Rectangle-----");
		System.out.println("Area: " + rect.getArea());
		System.out.println("Perimeter: " + rect.getPerimeter());
		

		Box bx = new Box(12,8,5);
		System.out.println("\n-------Box------");
		System.out.println("Box Area: " + bx.getArea());
		System.out.println("Surface Area: " + bx.getSurfaceArea());
		System.out.println("Edge Sum: " + bx.getEdgeSum());
	}
}

