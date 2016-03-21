import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
//Above imports allow XML Marshalling

public class JDBC {

	private static final String XML = "file.xml";
	//name of XML file, constant

	public static void addtoxml(CoachService service) throws IOException {
		//static function which takes a CoachService object and
		//adds it to a XML file. (also passes an IOException)

		try { //Trys to run its actual functionality
			JAXBContext context = JAXBContext.newInstance(CoachService.class);
			//make new Marshaller
			Marshaller m = context.createMarshaller();
			//set marshaller object up.
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			//pass marshal the file.
			m.marshal(service, new File(XML));
			System.out.println(); //debugging
			System.out.println("Output from our XML File: ");
			Unmarshaller um = context.createUnmarshaller();
			//unlink marshaller.
			CoachService service2 = (CoachService) um.unmarshal(new FileReader(XML));
			} 
		catch (JAXBException e) //if it cant write to file
		{
			e.printStackTrace();
		} 
		catch (IOException e) //if it cant write to file
		{
			e.printStackTrace();
		}
	}
} 
