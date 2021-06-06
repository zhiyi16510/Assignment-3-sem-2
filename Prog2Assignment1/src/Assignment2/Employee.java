package Assignment2;

public class Employee extends GroceryStore implements Payment{
	String employeeName, position;
	int age;
	char gender;
	long employeeID, phoneNumber;
	double salary, salaryPYear, balance;			//1.2 pre-define class
	
	public Employee() {
		super();
		System.out.println("\n========== EMPLOYEE ==========");
		printInfo();
	}
	
	//2.2 setter method
	public void setEmployeeName(String employeeName) {
		this.employeeName=employeeName;
	}
	
	public void setGender(char gender) {
		this.gender=gender;
	}
	
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber=phoneNumber;
	}
	
	public void setAge(int age) {
		this.age=age;
	}
	
	public void setPosition(String position) {
		this.position=position;
	}
	
	public void setEmployeeID(long employeeID) {
		this.employeeID=employeeID;
	}
	
	public void setSalary(double salary) {
		this.salary=salary;
	}
	
	//2.2 getter method
	public String getEmployeeName() {
		return this.employeeName;
	}
	
	public char getGender() {
		return this.gender;
	}
	
	public long getPhoneNumber() {
		return this.phoneNumber;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public String getPosition() {
		return this.position;
	}
	
	public long getEmployeeID() {
		return this.employeeID;
	}
	
	public double getSalary() {
		return this.salary;
	}
	
	public void employeeInfo() {
		setEmployeeName("ZY");
		setGender('F');
		setPhoneNumber(01234567);
		setAge(21);
		setPosition("Cashier");
		setEmployeeID(0012);
		
		System.out.println("\n========== EMPLOYEE INFO ==========");
		System.out.println("\nHere are the info -->"
				+"\nName\t\t: "+getEmployeeName()
				+"\nGender\t\t: "+getGender()
				+"\nPhone number\t: "+getPhoneNumber()
				+"\nAge\t\t: "+getAge()
				+"\nPosition\t: "+getPosition()
				+"\nEmployee ID\t: "+getEmployeeID());
	}
	
	public void salary() {
		setEmployeeName("ZY");
		setPosition("Cashier");
		setSalary(1200);
		
		balance=getPayment()-getSalary();
		salaryPYear=salary*12;
		System.out.println("\n========== EMPLOYEE SALARY INFO ==========");
		System.out.println("\nHere are the info -->"
				+"\nName\t\t\t: "+getEmployeeName()
				+"\nPosition\t\t: "+getPosition()
				+"\nSalary\t\t\t: RM"+getSalary()
				+"\nBalance after payment\t: RM"+balance
				+"\nSalary per year\t\t: RM"+salaryPYear);
	}
	
	public void printInfo() {	//2.2 printInfo method
		employeeInfo();
		salary();
	}
	
	public double getPayment() {	//2.5 interface getPayment
		return 5000;
	}
}
