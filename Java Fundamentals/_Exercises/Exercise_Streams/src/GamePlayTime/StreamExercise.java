package GamePlayTime;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class StreamExercise {
	
//	Create a program that reads a log about users that spent time playing some game. 
//	The format is {user hh:mm hh:mm ... hh:mm}.
//	gosho 2:12 3:15 8:21 7:12 0:12 0:21
//	Calculate the total time spent for each user and write it to another file 
//	total-played.txt
	
	private final static String INPUT_FILENAME = "input/users.txt";
	private final static String OUTPUT_FILENAME = "input/total-played.txt";
	private final static int FOR_24H = 1440;

	public static void main(String[] args) {
	    
		File fileIn = new File(INPUT_FILENAME);
		File fileOut = new File(OUTPUT_FILENAME);
		String userName = null; 
		int minutes = 0;
		int hours = 0;
		int totalTime = 0;
		String result = null;
		
		try(BufferedReader reader = new BufferedReader(new FileReader(fileIn));
		    FileWriter writer = new FileWriter(fileOut)){
			String line =reader.readLine();
			
			while(line != null){
				//process each line
				String [] lineInfos = line.split(" ");
				userName = lineInfos[0];
				int days = 0;
								
				for (int i = 1; i < lineInfos.length; i++) {
					String [] loggingTime = lineInfos[i].split(":");
					hours = Integer.parseInt(loggingTime[0]);
					minutes = Integer.parseInt(loggingTime[1]);
					totalTime += hours*60 + minutes;
									
				}
				days = totalTime / FOR_24H ;
				int remainingMinutes = totalTime % FOR_24H;
				hours = remainingMinutes / 60;
				minutes = remainingMinutes % 60;
				result = String.format("%s %d (%d days, %d hours, %d minutes) %n", userName, totalTime,days, hours, minutes);
				writer.write(result);
								
				//read next line - info for the next user - set the time to 0
				line = reader.readLine();
				totalTime = 0;
			}
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} 
		

	}
}
