import java.util.Scanner;
public class UpperCase
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of characters: ");
		int n = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter " + n + " Characters: ");
		String input = sc.nextLine();
		if(input.length() > n)
		{
			input = input.substring(0,n);
		}
		String upper = input.toUpperCase();
		System.out.println("UpperCase Conversion: " + upper);
		sc.close();
	}
}
