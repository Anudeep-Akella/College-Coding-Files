import java.util.Random;

public class rand
{
	public static void main(String[] args)
	{
		Random rand = new Random();
		
		int randint = rand.nextInt(100);
		System.out.println("Random Integer: " + randint);

		double randdouble = rand.nextDouble();
		System.out.println("Random Double: " + randdouble);
		
		boolean randbool = rand.nextBoolean();
		System.out.println("Random Boolean: " + randbool);
	}
}

