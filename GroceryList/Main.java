import java.util.*;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();
    private static int size = groceryList.size();

    public static void main(String[] args) {
    
       boolean quit = false;
       int choice = 0;
       printInstructions();

       while (!quit) {
            System.out.println("Please enter you choice");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1: 
                    printInstructions();
                    break;
                case 2:
                    printGroceryList();
                    break;
                case 3: 
                    addItem();
                    break;
                case 4: 
                    modifyItem();
                    break;
                case 5:
                    removeItem();
                    break;
                case 6:
                    searchForItem();
                    break;
                case 7:
                    processAl();
                    break;
                case 8: 
                    quit = true;
                    break;
            }
       }
   

    }

    public static void printInstructions() {
        System.out.println("Press");
        System.out.println("\t1.To print choice options");
        System.out.println("\t2.To print Grocery list items");
        System.out.println("\t3.For adding item in the grocery list");
        System.out.println("\t4.To modify the grocery list item");
        System.out.println("\t5.To remove item from the list");
        System.out.println("\t6.For searching an item in the list");
        System.out.println("\t7.Quit the appication");
    }

    public static void printGroceryList() {
        groceryList.printGroceryList();
    }

    public static void addItem() {
        System.out.println("Enter item to add in grocery list");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    public static void modifyItem(){
        System.out.println("Enter item to be replaced");
        String oldItem = scanner.nextLine();
        scanner.nextLine();

        System.out.println("Enter new item for replacement");
        String newItem = scanner.nextLine();

        groceryList.modifyGroceryList(oldItem, newItem);
    }

    public static void removeItem() {
        System.out.println("Enter item name");
        groceryList.removeGroceryItem(scanner.nextLine());
    }

    public static void searchForItem() {
        System.out.println("Enter item name");
        String searchItem = scanner.nextLine();

        if (groceryList.onFile(searchItem)) {
            System.out.println(searchItem + " found in the grocery list");
        } else {
            System.out.println(searchItem + " not found in the grocery list");
        }
    }

    public static void processAl() {

        // Copying one to another
        ArrayList<String> newAl = new ArrayList<>();
        newAl.addAll(groceryList.getGroceryList());

            // Method 2
        ArrayList<String> newAl2 = new ArrayList<String>(groceryList.getGroceryList());

        // Converting Al to array
        String[] arr = new String[size];
        groceryList.getGroceryList().toArray(arr);
    }

}