import java.util.Scanner;

public class simpleInterest
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Principal Amount: ");
		double principal = sc.nextDouble();
		System.out.println("Enter the Rate of Interest: ");
		double rate = sc.nextDouble();
		System.out.println("Enter the time: ");
		double time = sc.nextDouble();
		double si = (principal * rate * time) / 100;
		System.out.println("Simple Interest: " + si);
	}
}
