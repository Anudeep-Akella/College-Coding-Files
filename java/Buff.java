public class Buff
{
	public static void main(String[] args)
	{
		StringBuffer strbuf = new StringBuffer("GITAM");		
		strbuf.append(" University");
		System.out.println("After Appending: " + strbuf);
		strbuf.insert(15," GSS ");
		System.out.println("After Insert: " + strbuf);
		strbuf.replace(8,14," Gitam Technology ");
		System.out.println("After Replace: " + strbuf);
		strbuf.reverse();
		System.out.println("Reverse of String Buffer: " + strbuf);
		System.out.println();
		//String Builder
		StringBuilder strbui = new StringBuilder("Shell");
		strbui.append(" Scripting");
		System.out.println("String Builder Append: " + strbui);
		strbui.insert(10," Python");
		System.out.println("String insersted: " + strbui);
		strbui.reverse();
		System.out.println("String Reverse: " + strbui);
	}
}

