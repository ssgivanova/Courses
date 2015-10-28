package IOTasks;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {

	public static void main(String [] args){
		
		//write characters to file
		String content = "This is the content to write into file";
		File file = new File("src/IOTasks/output/content.txt");
		
		try(BufferedWriter br = new BufferedWriter(new FileWriter(file,true))){
			
			if(!file.exists()){
				file.createNewFile();
			}
			br.write(content);
			br.newLine();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//write raw bytes to file
		File file2 = new File("src/IOTasks/output/contentInBytes.txt");
		
		try(BufferedOutputStream fos = new BufferedOutputStream(new FileOutputStream(file2))){
			
			if(!file.exists()){
				file.createNewFile();
			}
			byte [] rawBytes = content.getBytes();
			fos.write(rawBytes);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
