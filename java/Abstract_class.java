//Abstract Class
abstract class Shape{
	abstract void draw();
}

//Concrete subclass
class Circle extends Shape
{
	void draw()
	{
		System.out.println("Drawing a Circle");
	}
}

class Rectangle extends Shape
{
	void draw()
	{
		System.out.println("Drawing a Rectangle");
	}
}

//Main Class
public class Abstract_class
{
	public static void main(String[] args)
	{
		Shape circle = new Circle();
		Shape rectangle = new Rectangle();
		circle.draw();
		rectangle.draw();
	}
}
