import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//imports SWING


public class UserInterface extends JFrame implements ActionListener 
//UI with Buttons and Panels
{
	Container contentPane = getContentPane();
	//main window
	JPanel grid = new JPanel( new GridLayout(8,2));
	//window layout design
	JPanel pnl = new JPanel();
	JLabel comNameLbl = new JLabel("     Company Name");
	JTextField comNameTxt = new JTextField("Characters Only", 40);
	//label and input window, with input restrictions
	
	JLabel touNameLbl = new JLabel("     Tour Name");
	JTextField touNameTxt = new JTextField("Characters Only",40);
	
	JLabel locNameLbl = new JLabel("     Location");
	JTextField locNameTxt = new JTextField("Characters Only",40);
	
	JLabel coachNumLbl = new JLabel("     Coach Number");
	JTextField coachNumTxt = new JTextField("Numbers Only",10);
	
	JLabel destLbl = new JLabel("    Destination");
	JTextField destTxt = new JTextField("Characters Only",40);
	
	JLabel arrLbl = new JLabel("    Arrival Time");
	JTextField arrTxt = new JTextField("Characters / Numbers Only",10);
	
	JLabel lvDateLbl = new JLabel("    Leave Date");
	JTextField lvDateTxt = new JTextField("dd/MM/yyyy");
	
	JLabel arrDateLbl = new JLabel("    Arrival Date");
	JTextField arrDateTxt = new JTextField("dd/MM/yyyy");
		
	JButton btn = new JButton("Submit Service");
	//button

	
	public UserInterface() //CONSTRUCTOR
	{
		super( "Tour of Britain");
		setSize(500,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		add(pnl);
		grid.add(comNameLbl);
		grid.add(comNameTxt);
		grid.add(touNameLbl);
		grid.add(touNameTxt);
		grid.add(locNameLbl);
		grid.add(locNameTxt);
		grid.add(coachNumLbl);
		grid.add(coachNumTxt);
		grid.add(destLbl);
		grid.add(destTxt);
		grid.add(arrLbl);
		grid.add(arrTxt);
		grid.add(lvDateLbl);
		grid.add(lvDateTxt);
		grid.add(arrDateLbl);
		grid.add(arrDateTxt);
		btn.addActionListener(this);		
		pnl.add(btn);	
		contentPane.add("North",grid);
		contentPane.add("South",pnl);
		//add elements to the actual grid
		setVisible(true);
	}
	
	public boolean isAlpha(String s){
		//validation for only alpha
	    String pattern= "^[a-zA-Z]*$";
	        if(s.matches(pattern)){
	            return true;
	        }
	        return false;   
	}
	
	public boolean isAlphaNum(String s){
		//validation for alphanumneric chars.
	    String pattern= "^[a-zA-Z0-9]*$";
	        if(s.matches(pattern)){
	            return true;
	        }
	        return false;   
	}
	
	public boolean isNum(String s)
	//validation for intergers
	{
	    String pattern= "^[a-zA-Z0-9]*$";
	        if(s.matches(pattern))
	        {
	            return true;
	        }
	        return false;   
	}
	
	public void actionPerformed ( ActionEvent event) 
	//is button pressed? pull text if validates
	{
		String comName = comNameTxt.getText();
		String touName = touNameTxt.getText();
		String locName = locNameTxt.getText();
		String destName = destTxt.getText();
		String arrName = arrTxt.getText();
		String s = coachNumTxt.getText();
		String lvDate = lvDateTxt.getText();
		String arrDate = arrDateTxt.getText();	
		if(isAlpha(comName) == true && isAlpha(touName) == true && isAlpha(locName) == true && isAlpha(destName) == true && isAlphaNum(arrDate) == true && isNum(s) == true)
			//validation for important error creating inputs
		{
			int coachNum = Integer.parseInt(s);
			ManagerController.setService(comName, touName, locName, destName, arrName, coachNum, lvDate, arrDate);
			final JFrame parent = new JFrame();
		//success window
			JLabel lbl10 = new JLabel("Success!.");
	        parent.add(lbl10);
	        parent.pack();
	        parent.setVisible(true);

		}
		else 
		{
			final JFrame parent = new JFrame();
			JLabel lbl10 = new JLabel("Please only enter valid options.");
			//error message
	        parent.add(lbl10);
	        parent.pack();
	        parent.setVisible(true);
	   }
	}
	public static void main(String[] args)
	{
		UserInterface gui = new UserInterface();
		//Run!
	}
}
