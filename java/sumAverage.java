public class sumAverage
{
	public static void main(String[] args)
	{
		//check the arguments
		if(args.length == 0)
		{
			System.out.println("Please provide numbers as command line arguments");
			return;
		}
		double sum = 0;
		for(int i=0;i<args.length;i++)
		{
			sum += Double.parseDouble(args[i]);
		}
		double average = sum / args.length;
		System.out.println("Sum: " + sum);
		System.out.println("Average: "+average);
	}
}
