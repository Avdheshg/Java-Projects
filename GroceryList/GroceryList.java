import java.util.*;

public class GroceryList {
    
    private ArrayList<String> groceryList = new ArrayList<>(); 

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }
    
    public void addGroceryItem(String itemName) {
        groceryList.add(itemName);
    }

    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items in your list");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i+1) + ". " + groceryList.get(i));
        }
    }

    /* Method overloading */
    public void modifyGroceryList(String oldItem, String newItem) {
        int position = findItem(oldItem);
        modifyGroceryList(position, newItem);
    }

    private void modifyGroceryList(int position, String newItem) {

        if (position >= 0 && position < groceryList.size()) {
            groceryList.set(position, newItem);
            System.out.println(newItem + " has been updated at "+ (position + 1));
        } else {
            System.out.println(position + " doesn't exists in the list or have entered wrong index");
        }
    }

    /* Method Overloading */
    public void removeGroceryItem(String delItem) {
        int position = findItem(delItem);
        boolean isDeleted = removeGroceryItem(position);

        if (isDeleted) {
            System.out.println(delItem + " has been removed from the list");
        } else {
            System.out.println(delItem + " is not present in the list");
        }
    }
    private boolean removeGroceryItem(int itemPosition) {
        if (itemPosition != -1) {
            groceryList.remove(itemPosition);
            return true;
        }
        return false;
    }

    public boolean onFile(String itemName) {
        if (findItem(itemName) >= 0) {
            return true;
        }
        return false;
    }

    private int findItem(String findItem) {
        return groceryList.indexOf(findItem);
    }

    public int size() {
        return groceryList.size();
    }
    
}
