package newpackage;

public class Circle
{
	private double radius;
	public Circle(double radius)
	{
		this.radius = radius;
	}
	public double getCircumference()
	{
		return Math.PI*2*radius;
	}
}
