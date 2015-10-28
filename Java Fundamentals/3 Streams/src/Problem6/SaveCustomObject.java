package Problem6;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Course implements Serializable{
	private String name;
	private int numberStudents;
	
	public Course(String name,int numberStudents){
		this.name = name;
		this.numberStudents = numberStudents;
	}
	
	public String getName(){
		return this.name;
	}
	
	public int getNumberOfStudents(){
		return this.numberStudents;
	}
	
	@Override
	public String toString() {
		return String.format("Coursename : %s, Students: %d",this.name,this.numberStudents);
	}	
}

public class SaveCustomObject {
	
	private static final String FILENAME = "src/Problem6/input/course.save";
		
//	Write a program that saves and loads the information from a custom Object that you have created to a file using
//	ObjectInputStream, ObjectOutputStream. Create a class Course that has a String field containing the name
//	and an integer field containing the number of students attending the course. Set the name of the new file as
//	course.save.

	public static void main(String[] args) {
		
		Course courseJava = new Course("Java Fundamentals",500);
		Course courseCSharp = new Course("C# Fundamentals",1000);
		Course courseDatabases = new Course("Databases",300);
		
		Course [] courses = new Course[3];
		courses[0] = courseJava;
		courses[1] = courseCSharp;
		courses[2] = courseDatabases;
		
		saveCourse(courses);
		loadCourseFromFile();
	}
	
	public static void saveCourse(Course[] courses){
		File file = new File(FILENAME);	
		try(ObjectOutputStream oos = new ObjectOutputStream(
				new BufferedOutputStream(new FileOutputStream(file)))){
				oos.writeObject(courses);
				
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Courses are saved to file");
	}
	
	public static void loadCourseFromFile(){
		File file = new File(FILENAME);
		System.out.println("Courses loaded");
		try( ObjectInputStream ois = new ObjectInputStream(
				new BufferedInputStream(new FileInputStream(file)))){
				Course [] courses = (Course[]) ois.readObject();
				for (Course course : courses) {
					System.out.println(course);
				}						
			
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}		
	}
}
