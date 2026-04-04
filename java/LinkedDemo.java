import java.util.LinkedList;

public class LinkedDemo
{
	public static void main(String[] args)
	{
		LinkedList<Integer> list = new LinkedList<>();
		
		list.add(64);
		list.add(45);
		
		System.out.println("Elements in the list: ");
		System.out.println(list);
		for(int item:list)
		{
			System.out.println(item);
		}
	}
}

