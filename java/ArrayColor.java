import java.util.ArrayList;

public class ArrayColor
{
	public static void main(String[] args)
	{
		ArrayList<String> col = new ArrayList<>();

		col.add("Green");
		col.add("Yellow");
		col.add("Purple");
		
		
		System.out.println("Array List Col: ");
for(String color:col)
{
		System.out.println(color);
}
	}
}

