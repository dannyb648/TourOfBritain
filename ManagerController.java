import java.io.IOException;
//handles exception

public class ManagerController {
	
	public static void setService(String comName, String touName, 
									String locName, String destName, 
									String arrName, int coachNum, 
									String lvDate, String arrDate)
	//pass variables from user
	{
		CoachService service = ServiceFactory.createService(comName, touName, 
															locName, destName, 
															arrName, coachNum, 
															lvDate, arrDate);
		//make a CoachService Object with these variables
		
		Schedule.addService(service);
		//add service to schedule list
		
		try //try and add to Database
		{
			JDBC.addtoxml(service);
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}//error catching
	}
}
