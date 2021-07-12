public class Stall {

    public static void main(String[] args) {

    }
}

class Contact  {

    private int mobile;
    private int alernateMobile;
    private int landLine;
    private String email;
    private Address address;

    public Contact(int mobile, int alernateMobile, int landLine, String email) {
        this.mobile = mobile;
        this.alernateMobile = alernateMobile;
        this.landLine = landLine;
        this.email = email;
    }

    public int getMobile() {
        return mobile;
    }

    public void setMobile(int mobile) {
        this.mobile = mobile;
    }

    public int getAlernateMobile() {
        return alernateMobile;
    }

    public void setAlernateMobile(int alernateMobile) {
        this.alernateMobile = alernateMobile;
    }

    public int getLandLine() {
        return landLine;
    }

    public void setLandLine(int landLine) {
        this.landLine = landLine;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    // Overriding equals method
    public boolean equals(Object obj) {
        Contact c = (Contact) obj;

        if (this.mobile != c.mobile) {
            System.out.println("No contact with mobile 34567 found");
            return false;
        }

        System.out.println(c);
        return true;
    }

    public String toString() {
        return "Mobile:" + getMobile() + 
                "\nAlternate Mobile:" + getAlernateMobile() + 
                "\nLandline:" + getLandLine() +  
                "\nEmail:" + getEmail() +
                "\n" + getAddress();
    }

}

class Address {

    private String addressLine2;
    private String addressLine1;
    private String city;
    private String state;
    private int pincode;
    private Contact contact;

    public Address(String addressLine2, String addressLine1, String city, String state, int pincode) {
        this.addressLine2 = addressLine2;
        this.addressLine1 = addressLine1;
        this.city = city;
        this.state = state;
        this.pincode = pincode;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }
    
    public String toString() {
        return "Contact:" + getContact() + 
                "\nAddress Line1:" + getAddressLine1() + 
                "\nAddress Line2" +  getAddressLine2() + 
                "\nCity:" + getCity() +  
                "\nState:" + getState() + 
                "\nPincode:" + getPincode();
    }
}
