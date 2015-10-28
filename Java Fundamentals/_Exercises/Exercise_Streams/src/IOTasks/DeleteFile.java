package IOTasks;

import java.io.File;
import java.io.FilenameFilter;

class GenericExtensionFilter implements FilenameFilter{
	
	private String extension;
	
	public GenericExtensionFilter(String extension) {
		this.extension= extension;
	}

	@Override
	public boolean accept(File dir, String name) {
		return (name.endsWith(extension));
	}
	
}

public class DeleteFile {
	
	private final static String DIRECTORY = "src/IOTasks/input";
	private final static String EXTENSION = ".jpg";

	public static void main(String [] args){
		File file = new File("src/IOTasks/input/test.txt");
		
		if (file.delete()){
			System.out.println(file.getName()+" is deleted");
		}else{
			System.out.println("Deleting failed");
		}
		
		//delete file with specific extension - .jpg
		//with class that FilenameFilter & @override accept()
		
		findFilesByExtension(DIRECTORY, EXTENSION);
		
		deleteFile(DIRECTORY, EXTENSION);
		
	}
	
	public static void deleteFile(String folder, String extension){
		GenericExtensionFilter filter = new GenericExtensionFilter(EXTENSION);
		File dir = new File(DIRECTORY);
		String [] files = dir.list(filter);
		
		if (files.length == 0 ) {return;}
		
		File fileDelete;
		
		System.out.println("Deleting...");
		for (String file : files) {
			String temp = new StringBuffer(DIRECTORY).append(File.separator).append(file).toString();
			fileDelete = new File(temp);
			boolean isDeleted = fileDelete.delete();
			System.out.printf("File %s is deleted - %b%n",temp,isDeleted);
		}
	}
	
	public static void findFilesByExtension(String folder,String extension){
		GenericExtensionFilter filter = new GenericExtensionFilter(EXTENSION);
		File dir = new File(DIRECTORY);
		String [] files = dir.list(filter);
		
		if (files.length == 0){
			System.out.printf("No files with *%s",EXTENSION);
		}else{
			System.out.println(files.length +" Files found");
			for (String file : files) {
				String filename = new StringBuffer(DIRECTORY).append(File.separator)
								.append(file).toString();
				System.out.println(filename);
			}
		}
		
		
	}
	
}
