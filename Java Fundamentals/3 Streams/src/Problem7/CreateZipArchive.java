package Problem7;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class CreateZipArchive {
	
	//Write a program that reads three txt files words.txt, count-chars.txt and lines.txt and 
	//create a zip archive named text-files.zip. Use FileOutputStream, ZipOutputStream, and FileInputStream.
	
	private static final String DIRECTORY = "src/Problem7/input/";
	private static final String FILENAME = "src/Problem7/input/text-files.zip";
	
	public static void main(String[]args){
		
		File fileZip = new File(FILENAME);
	
		File dir = new File(DIRECTORY);
		byte[] buffer = new byte[1024];
		String[] filesNames = dir.list();
		File [] files = new File[filesNames.length];
		
		for (int i = 0; i < files.length; i++) {
			files[i] = new File(DIRECTORY+filesNames[i]);
		}
		
		
		try(ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(fileZip))){
			for (int i = 0; i < files.length; i++) {
				//read each file and put it in the archive
				File file = files[i];
				BufferedInputStream fin = new BufferedInputStream(new FileInputStream(file));
				zos.putNextEntry(new ZipEntry(file.getName()));
				int length;
				while((length = fin.read(buffer))!= -1){
					zos.write(buffer,0,length);
				}
				zos.closeEntry();
				fin.close();
			}
			
			System.out.println("Zip file created");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
