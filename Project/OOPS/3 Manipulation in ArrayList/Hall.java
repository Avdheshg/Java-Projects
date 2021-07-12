public class Hall {
	//write your code here	

	private String name;
	private String contactNumber;
	private String ownerName;
	private double costPerDay;

	public Hall(String name, String contactNumber, String ownerName, double costPerDay) {
		this.name = name;
		this.contactNumber = contactNumber;
		this.ownerName = ownerName;
		this.costPerDay = costPerDay;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public void setCostPerDay(double costPerDay) {
		this.costPerDay = costPerDay;
	}

	public String getName() {
		return name;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public double getCostPerDay() {
		return costPerDay;
	}
}
