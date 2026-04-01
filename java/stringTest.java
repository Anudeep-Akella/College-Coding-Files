class stringTest
  {
    public static void main(String[] args)
    {
      String str = "This is Gitam University";
      System.out.println("Original String: " + str);
      System.out.println("Length of string: " + str.length());
      System.out.println("UpperCase: " + str.toUpperCase());
      System.out.println("LowerCase: " + str.toLowerCase());
      System.out.println("A character position: " + str.charAt(8));
      System.out.println("Substring from 8 to 12 : " + str.substring(8,12));
      System.out.println("Word Contains: " + str.contains("Gitam"));
      System.out.println("Replace a word: " + str.replace("University","College"));
    }
  }
