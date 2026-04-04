public class StringTest
{
	public static void main(String[] args)
	{
		String str = "This is Gitam University";	
		System.out.println("Original String: " + str);
		//Length method
		System.out.println("String length: " + str.length());
		//Upper Case Conversion
		System.out.println("String Upper Case: " + str.toUpperCase());
		//Lower Case Conversion
		System.out.println("String Lower Case: " + str.toLowerCase());
		//Character at the position
		System.out.println("Character Position: " + str.charAt(7));
//Substring 
		System.out.println("Substring: " + str.substring(8,12));
//Word Containing
		System.out.println("Contains \"Gitam\"?: " + str.contains("Gitam"));
//Replace
		System.out.println("Replace the word University: " + str.replace("University","College"));
	}
}

