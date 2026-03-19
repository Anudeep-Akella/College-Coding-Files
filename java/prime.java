import java.util.Scanner;

public class prime
{
	public static void main(String[] args)
	{
		int start,end,i,j;
		Scanner sc = new Scanner(System.in);
		System.out.println("Start and End values for prime numbers");
		System.out.println("Enter the range: ");
		start = sc.nextInt();
		end = sc.nextInt();
		for(i=start;i<end;i++)
		{
			if(i<=1) continue;
			for(j=2;j<i;j++)
			{
				if(i%j == 0) 
					break;
			}
			if(j==i)
				System.out.println(i);
		}
		
	}
}
