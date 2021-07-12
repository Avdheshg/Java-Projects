import java.util.*;

public class Main {
    
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]) throws Exception{
        
        // Obj of HallBO
        HallBO objHallBO = new HallBO();

        List<Hall> hallAl = objHallBO.getHallList();

        boolean isRunning = true;
        
        while (isRunning) {
            System.out.println("Enter an option:");
            System.out.println("1.Add" + 
                               "\n2.Replace" + 
                               "\n3.Display" + 
                               "\n4.Exit");
            
            int input = sc.nextInt();
            sc.nextLine();

            switch (input) {
                case 1:
                    add(hallAl);
                    break;
                case 2: 
                    replace(hallAl);
                    break;
                case 3:
                    objHallBO.displayAll(hallAl);
                    break;
                case 4:
                    isRunning = false;
                    
                    break;
            }

            System.out.println("Exiting Application");
            
        }
        
	}

    public static List<Hall> add(List<Hall> al) {
        System.out.println("Enter the name of the hall:");
        String name = sc.nextLine();

        System.out.println("Enter the contact number of the hall:");
        String contactNumber = sc.nextLine();

        System.out.println("Enter the cost per day of the hall:");
        double costPerDay = sc.nextDouble();
        sc.nextLine();
        
        System.out.println("Enter the owner name of the hall:");
        String ownerName = sc.nextLine();

        Hall objHall = new Hall(name, contactNumber, costPerDay, ownerName);

        al.add(objHall);
        
        System.out.println("Hall added successfully");

        new HallBO().displayAll(al);
        return al;
    } 

    public static List<Hall> replace(List<Hall> al) {
        System.out.println("Enter the hall number which should be replaced:");
        int replacedNum = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter the name of the replacement hall:");
        String name = sc.nextLine();

        System.out.println("Enter the contact number of the replacement hall:");
        String contactNumber = sc.nextLine();

        System.out.println("Enter the cost per day of the replacement hall:");
        double costPerDay = sc.nextDouble();
        sc.nextLine();
        
        System.out.println("Enter the owner name of the replacement hall:");
        String ownerName = sc.nextLine();

        Hall objHall = new Hall(name, contactNumber, costPerDay, ownerName);

        al.set(replacedNum, objHall);

        new HallBO().displayAll(al);

        return al;
    }








}

