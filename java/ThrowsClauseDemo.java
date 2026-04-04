
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class ThrowsClauseDemo{
	//Method declares that it may throw IOException
	public static void readFile(String fileName) throws IOException{
		BufferedReader br = new BufferedReader(new FileReader(fileName));
		String line;
		while ((line = br.readLine()) != null){
			System.out.println(line);
		}
		br.close();
	}
	
	public static void main(String[] args){
		try{
			readFile("sample.txt"); //Caller must handle IOExceptuon
		}
		catch (IOException e){
			System.out.println("Exception caught: " + e.getMessage());
		}
	}
}

