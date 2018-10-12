import java.io.IOException;

public class PersonMain {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Person one = new Person("Fred Bloggs", "10 King Street, Perth", 34);
	
		Person two = new Person("Anne Smith", "6 High Street, Inverness", 35);
		
		one.displayDetails();
		two.displayDetails();
		
	}
	
}