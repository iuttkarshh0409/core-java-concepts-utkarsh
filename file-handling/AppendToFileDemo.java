//to append data to file
import java.io.*;
public class AppendToFileDemo{
	public static void main(String args[]){
		try{
			FileWriter fw= new FileWriter("sample.txt",true); //true= append mode
			fw.write("\n This line is appended...");
			fw.close();
			System.out.println("Data appended to file...");
		}
		
		catch(IOException e){
			System.out.println("Error Caught..."+e.getMessage());
		}
	}
}