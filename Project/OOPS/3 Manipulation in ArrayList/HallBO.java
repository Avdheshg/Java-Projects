import java.util.*;

public class HallBO {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		/*
			Def contact and address pair object
			Store them in AL of Contact
			Get them in CSV format
		*/

		ArrayList<Contact> alContact = new ArrayList<>();
		

		System.out.println("Enter the User detail");
		String userDetail = sc.nextLine();
		String userArr[] = userDetail.split(",");
		
		System.out.println("Enter the contact detail");
		String contactDetail = sc.nextLine();
		String contactArr[] = contactDetail.split(",");

		// Object of contact details
		ContactDetail contactObj = new ContactDetail(contactArr[0], contactArr[1], contactArr[2], contactArr[3], contactArr[4]);
		

		User userObj = new User(userArr[0],  contactObj, userArr[1], userArr[2]);

		System.out.print(userObj);

	}

	

}