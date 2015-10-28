package Problem5;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ArrayListOfDoubles {
	
	private final static String FILENAME = "src/Problem5/input/doubles.list";
	
//	Write a program that saves and loads the information from an ArrayList to a file using 
//	ObjectInputStream, ObjectOutputStream. 
//	Set the name of the new file as doubles.list
	
	public static void main(String[] args){
		
		
		List<Double> doublesList = new ArrayList<Double>();
		doublesList.add(1.5);
		doublesList.add(2.8);
		doublesList.add(22.7);
		doublesList.add(90.3);
		
		saveToFile(doublesList);
		loadFromFile();
	}
	
	public static void saveToFile(List<Double> list){
		File output = new File(FILENAME);
		try(ObjectOutputStream out = new ObjectOutputStream(
				new BufferedOutputStream(new FileOutputStream(output)))){
				out.writeObject(list);
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Array list is saved");
	}
	
	public static void loadFromFile(){
		File output = new File(FILENAME);
		List<Double> doubles = new ArrayList<Double>();
		try (ObjectInputStream in = new ObjectInputStream(
				new BufferedInputStream(new FileInputStream(output)))){
				doubles = (List<Double>)in.readObject();
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("File is loaded");
		for (Double element : doubles) {
			System.out.print(element + " ");
		}
		
		
	}

}
