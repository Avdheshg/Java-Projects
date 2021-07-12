import java.util.*;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		/*
		 * Def while loop and give options Add Replace Display Exit
		 * 
		 * Def switch for above operation Add : add(object o) Replace : al.set(int
		 * index, Object element) display : DisplayAll() boolean false
		 * 
		 */

		boolean isRunning = true;

		while (isRunning) {
			System.out.println("Enter an option:");
			System.out.println("1.Add \n2.Replace \n3.Display \n4.Exit");

			int choice = sc.nextInt();

			switch (choice) {
				case 1:

			}

			isRunning = false;
		}

		// Add

	}

	public static void add() {

		System.out.println("Enter the name of the hall:");
		String name = sc.nextLine();
		System.out.println("Enter the contact number of the hall:");
		String contactNumber = sc.nextLine();
		System.out.println("Enter the cost per day of the hall:");
		String costPerDay = sc.nextLine();
		System.out.println("Enter the owner name of the hall:");
		String ownerName = sc.nextLine();

		Hall obj = new Hall(name, contactNumber, Double.parseDouble("costPerDay"), ownerName);

		List<Hall> hallList = HallBO.getHallList();

		hallList.add(obj);

	}
}