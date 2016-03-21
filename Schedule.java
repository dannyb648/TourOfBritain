import java.util.*;
//Imports all of Utilities

public class Schedule {
	private static List<CoachService> mainSchedule = new ArrayList<CoachService>();
	//list of CoachService objects.
	
	public static void addService(CoachService e){
		mainSchedule.add(e); //add to list.
		System.out.println("Added Service!");
		//success debugging message.
	}
}
