package Assignment2;

public abstract class GroceryStore {	//2.4 define superclass as abstract
	private String name, location; 
	int yearEstablished;
	long phoneNum;
	
	GroceryStore() {	//constructor with four arguments
		setName("UUM Grocery Store");
		setYear(2021);
		setLocation("Sintok");
		setPhoneNum(041234567);
		
		System.out.println("\n=========== GROCERY STORE INFO =========="
				+"\nGrocery store name\t: "+getName()
				+"\nYear established\t: "+getYear()
				+"\nGrocery location\t: "+getLocation()
				+"\nContact number\t\t: "+getPhone());
	}
	
	//2.3 setter method
	public void setName(String name) {
		this.name=name;
	}
	
	public void setYear(int yearEstablished) {
		this.yearEstablished=yearEstablished;
	}
	
	public void setLocation(String location) {
		this.location=location;
	}
	
	public void setPhoneNum(long i) {
		this.phoneNum=i;
	}
	
	//2.3 getter method
	public String getName() {
		return name;
	}
	
	public int getYear() {
		return yearEstablished;
	}
	
	public String getLocation() {
		return location;
	}
	
	public long getPhone() {
		return phoneNum;
	}
	
	
}
