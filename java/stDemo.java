import java.util.StringTokenizer;

public class stDemo
{
	public static void main(String[] args)
	{
		String s = "This is a String Tokenizer Example";
	
		StringTokenizer st = new StringTokenizer(s,"s ");
		
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}
	}
}	

