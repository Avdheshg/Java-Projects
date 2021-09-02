import java.util.*;

public class Main {
    
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("0052 32344");
    
    public static void main(String[] args) {
        
        /*
            Focus only on functions 
                How they are executing themselves
                Which is private, public and why
                How they are working together
                    Whom is calling whom
                    What is the need of calling other function 
                How and why functions are named so
                How parameters are named
        */

        boolean quit = false;
        int choice = 0;
        startPhone();
        printActions();

        while (!quit) {
            
            System.out.println("Enter your choice: (1 to show available actions)");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    printActions();
                    break;
                case 2:
                    mobilePhone.printContacts();
                    break;
                case 3:
                    addNewContact();
                    break;
                case 4:
                    updateContact();
                    break;
                case 5:
                    removeContact();
                    break;
                case 6:
                    queryContact();
                    break;
                case 7:
                    quit = true;
                    System.out.println("Exiting....");
                    break;
            }
        }


    }


    private static void startPhone() {
        System.out.println("Starting phone");
    }

    // Printing options for the user
    public static void printActions() {
        System.out.println("Enter");

        System.out.println("\t1. List of all options \n" +
                            "\t2. List of all contacts of the contact list \n" + 
                            "\t3. For adding a new contact \n" + 
                            "\t4. For modifying the contact \n" + 
                            "\t5. For removing the contact \n" + 
                            "\t6. For query a contact names \n" + 
                            "\t7. Quit the application \n");

    }

    public static void addNewContact() {
        System.out.println("Enter new contact name");
        String name = scanner.nextLine();

        System.out.println("Enter phone number");
        String phone = scanner.nextLine();

        Contacts newContact = Contacts.createContact(name, phone);

        if (mobilePhone.addNewContact(newContact)) {
            System.out.println(name + " added successfully. Name : " + name + ", phone : " + phone);
        } else {
            System.out.println("Cannot add, " + name + " already on file");
        }
    }

    private static void updateContact() {
        System.out.println("Enter existing contact name");
        String name = scanner.nextLine();
        Contacts existingContactRecord = mobilePhone.queryContact(name);

        if (existingContactRecord == null) {
            System.out.println("Contact not found");
            return;
        }

        System.out.println("Enter new contact name");
        String newName = scanner.nextLine();
        System.out.println("Enter new contact phone number");
        String newNumber = scanner.nextLine();

        Contacts newContact = Contacts.createContact(newName, newNumber);

        if (mobilePhone.updateContact(existingContactRecord, newContact)) {
            System.out.println("Successfully updated record");
        } else {
            System.out.println("Error updating record");
        }
    }

    private static void removeContact() {
        System.out.println("Enter existing contact name");
        String name = scanner.nextLine();
        Contacts existingContactRecord = mobilePhone.queryContact(name);

        if (existingContactRecord == null) {
            System.out.println("Contact not found");
            return;
        }

        if (mobilePhone.removeContact(existingContactRecord)) {
            System.out.println("Successfully deleted");
        } else {
            System.out.println("Error deleting contact");
        }

    }

    private static void queryContact() {
        System.out.println("Enter existing contact name");
        String name = scanner.nextLine();
        Contacts existingContactRecord = mobilePhone.queryContact(name);

        if (existingContactRecord == null) {
            System.out.println("Contact not found");
            return;
        }

        System.out.println("Name : " + existingContactRecord.getName() + ", phone number is : " + existingContactRecord.getNumber());
    }


















    

}
