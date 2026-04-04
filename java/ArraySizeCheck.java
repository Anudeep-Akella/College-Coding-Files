import java.util.Scanner;

public class ArraySizeCheck{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int size = sc.nextInt();
		try{
			if (size<0){
				//Throw an exception if size is negative
				throw new NegativeArraySizeException("Array size cannot be negative");
			}
			// Create array id size is valid
			int[] arr = new int[size];
			System.out.println("Array of size " + size + " created successfully");
		}
		catch (NegativeArraySizeException e){
			//Handle the exception 
			System.out.println("Exception caught: "+e.getMessage());
			}
	}
}

