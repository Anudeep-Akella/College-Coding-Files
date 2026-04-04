
import java.util.HashSet;

public class setDemo
{
	public static void main(String[] args)
	{
		HashSet<String> set = new HashSet<>();
		
		set.add("Hello");
		set.add("World");

		System.out.println(set.hashCode());
		
		System.out.println("The content inside the set are:");
		System.out.println(set);
		for(String i:set)
		{
			System.out.println(i);
		}
	}
}

