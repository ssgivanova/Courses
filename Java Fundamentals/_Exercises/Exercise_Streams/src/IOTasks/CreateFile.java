package IOTasks;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CreateFile {
	
	public static void main(String [] args){
		
		//create new file
		try{
			File file = new File("src/IOTasks/output/test.txt");
			if (file.createNewFile()){
				System.out.println("File is created");
			}else{
				System.out.println("File already exisits");
			}
		}catch (IOException e){
			e.printStackTrace();
		}
		
		//construct filepath
		try{
			String filename = "file.txt";
			String workingDirectory = System.getProperty("user.dir");
			
			//String absoluteFilePath = workingDirectory + File.separator + filename;
			//File file1 = new File(absoluteFilePath);
			
			File file1 = new File(workingDirectory,filename);
			file1.createNewFile();
			
			System.out.println("Final pathname : "+file1.getAbsolutePath());
			
			file1.setExecutable(false);
			file1.setReadOnly();
			
			if(file1.exists()){
				System.out.println("executable : "+ file1.canExecute());
				System.out.println("writable : "+ file1.canWrite());
			}
			
			file1.setWritable(true);
			
			File file2 = new File("src/IOTasks/input/file.jpg");
			
			long lastModifiedTime = file2.lastModified();
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY hh:mm:ss");
			System.out.println("Last modified : "+sdf.format(lastModifiedTime));
			
			String newLastModified = "31/01/2015 10:15:21";
			//convert to miliseconds in long
			Date newDate = sdf.parse(newLastModified);
			file2.setLastModified(newDate.getTime());
			
			long size = file2.length();
			System.out.println(size/1024 +" kB");
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		//get file size
		
	}

}
