import java.io.IOException;

public class Person {

	private String personsName;
	private String personsAddress;
	private int personsAge;

	
	public Person(String a, String b, int c)  {
		getPersonDetails(a,b,c);
	}
	
	public void getPersonDetails(String gName, String gAddress, int gAge)  {
		  personsName = gName;
		  personsAddress = gAddress;
		  personsAge = gAge;
		}
	
	public void displayDetails() throws IOException {
		  System.out.println("Persons name is : "+personsName);
		  System.out.println("Persons address is : "+personsAddress);
		  System.out.println("Persons age is : "+personsAge);
		}
}
