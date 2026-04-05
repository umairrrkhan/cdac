package fileio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Prb2 {
	
	static void cop(String sourcePath , String destPath) {
		try ( BufferedReader reader  = new BufferedReader ( new FileReader(sourcePath));
				BufferedWriter writer = new BufferedWriter(new FileWriter(destPath))){
			String line;
			
			while((line  = reader.readLine() )!= null){
				writer.write(line);
				writer.newLine();
			}
			
			System.out.println("file copied sucessfullly");
		}catch (IOException e) {
			System.out.println("error ");
		}
	}
	
	public static void main(String args[]) {
		
		Prb2.cop("test.txt", "new.txt");
		
	}

}
