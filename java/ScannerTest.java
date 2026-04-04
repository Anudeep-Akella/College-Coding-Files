import java.util.Scanner;

public class ScannerTest
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the name: ");
		String name = sc.nextLine();
		
		System.out.print("Enter the Account Number: ");
		int number = sc.nextInt();
		
		System.out.print("Enter the balance: ");
		float bal = sc.nextFloat();
	
		System.out.println("Accound Details");
		System.out.println("Name: " + name);
		System.out.println("Account Number: " + number);
		System.out.println("Balance: " + bal);
	}
}

