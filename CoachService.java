import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
//Allows us to bind the elements to Xml

@XmlRootElement
public class CoachService {

	private int id;
	private String companyName;
	private String tourName;
	private String leaveDate; 
	private String location;
	private int coachNum;
	private String destination;
	private String arrival; 
	//Private Attributes
	
	public CoachService(){
		setId(ServiceFactory.getIdCount());
		//static functino counts how many objects exist
	}
	
	public int getId(){
		return id;
	}
	
	public String getCompanyName(){
		return companyName;
	}
	
	public String getTourName(){
		return tourName;
	}
	
	public String getLeaveDate(){
		return leaveDate;
	}
	public String getLocation(){
		return location;
	}
	public int getCoachNum(){
		return coachNum;
	}
	public String getArrival(){
		return arrival;
	}
	public String getDestination(){
		return destination;
	}
	//Get Functions return attributes
	
	@XmlElement
	public void setId(int id){
		this.id = id;
	}
	
	@XmlElement
	public void setCompanyName(String name){
		this.companyName = name;
	}
	
	@XmlElement
	public void setTourName(String name){
		this.tourName = name;
	}
	
	@XmlElement
	public void setLeaveDate(String leaveDate){
		this.leaveDate = leaveDate;
	}
	
	@XmlElement
	public void setLocation(String location){
		this.location = location;
	}
	
	@XmlElement
	public void setCoachNum(int coachNum){
		this.coachNum = coachNum;
	}
	
	@XmlElement
	public void setArrival(String arrivalTime){
		this.arrival = arrivalTime;
	}
	
	@XmlElement
	public void setDestination(String dest){
		this.destination = dest;
	}
	//Xml annotated Setters, which set attributes
	
}
