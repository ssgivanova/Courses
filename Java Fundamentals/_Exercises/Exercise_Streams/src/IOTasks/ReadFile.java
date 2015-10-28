package IOTasks;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

	public static void main(String [] args){
		try(BufferedReader reader = new BufferedReader(new FileReader("src/IOTasks/input/test.txt"))){
			String line=null;
			while((line = reader.readLine())!=null){
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
