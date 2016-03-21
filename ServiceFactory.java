public class ServiceFactory {
	private static int idCount;
	//counts how many objects are created
	
	public static CoachService createService(String comName, String touName, 
			String locName, String destName, 
			String arrName, int coachNum, 
			String lvDate, String arrDate) //pass all of the inputted variavles
	
	{
		CoachService service = new CoachService(); //create new service
		service.setCompanyName(comName);
		service.setTourName(touName);
		service.setLeaveDate(lvDate);
		service.setLocation(locName);
		service.setCoachNum(coachNum);
		service.setArrival(arrName);
		service.setDestination(destName);
		//add user inputted vars into attributes
		idCount++;
		//increment idCount
		return service;
		//returns the object
	}
	
	public static int getIdCount(){
		return idCount;
		//get idcount
	}
}
