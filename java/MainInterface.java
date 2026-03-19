interface Shape
{
	void draw();
}
class Circle implements Shape
{
	public void draw()
	{
		System.out.println("Drawing a Circle");
	}
}
public class MainInterface
{
	public static void main(String[] args)
	{
		Shape s = new Circle();
		s.draw();
	}
}
