import java.util.*;

public class Contacts {
    
    private String name;
    private String number;

    Contacts(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    // A method which will create a new object of Contact class and return it
    // This is a factory method and it is used here so that we 
    public static Contacts createContact(String name, String number) {
        return new Contacts(name, number);
    }

}




