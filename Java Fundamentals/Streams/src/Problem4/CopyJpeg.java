package Problem4;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyJpeg {
	
	//Write a program that copies the contents of a .jpg file to another using FileInputStream,
	
	private static final String INPUT_PATHNAME = "src/Problem4/input/file.jpg";
	private static final String OUTPUT_PATHNAME = "src/Problem4/input/file-copy.jpg";

	public static void main(String[] args) {
		
		try(BufferedInputStream in = new BufferedInputStream(new FileInputStream(new File(INPUT_PATHNAME)));
			BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(new File(OUTPUT_PATHNAME)))){
			byte [] buffer = new byte[in.available()];
			in.read(buffer);
			out.write(buffer);
			
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		

	}

}
