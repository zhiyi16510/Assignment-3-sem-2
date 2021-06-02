package Assignment1;

import java.util.Scanner;

public class Employee {		//1.3 user define class
	String employeeName, position;
	int age;
	char gender;
	long employeeID, phoneNumber;
	double salary, salaryPYear;			//1.2 pre-define class
	
	Scanner in=new Scanner(System.in);
	
	public Employee() {		//1.4 constructor without argument
		employeeInfo();
	}
	
	public Employee(String p) {		//1.4 constructor with one argument
		position=p;
		
		employeeInfo();
	}
	
	public Employee(String p, double s) {		//1.4 constructor with two arguments
		position=p;
		salary=s;
		
		employeeInfo();
		salary();
	}
	
	public void employeeInfo() {
		System.out.println("========== EMPLOYEE INFO ==========");
		System.out.print("Name\t\t: ");
		employeeName=in.next();
		System.out.print("Gender\t\t: ");
		gender=in.next().charAt(0);
		System.out.print("Phone number\t: ");
		phoneNumber=in.nextLong();
		System.out.print("Age\t\t: ");
		age=in.nextInt();
		System.out.print("Position\t: ");
		position=in.next();
		System.out.print("Employee ID\t: ");
		employeeID=in.nextLong();
		
		System.out.println("Here are the info -->"
				+"\nName\t\t: "+employeeName
				+"\nGender\t\t: "+gender
				+"\nPhone number\t: "+phoneNumber
				+"\nAge\t\t: "+age
				+"\nPosition\t: "+position
				+"\nEmployee ID\t\t: "+employeeID);
	}
	
	public void salary() {
		System.out.println("========== SALARY INFO ==========");
		salaryPYear=salary*12;
		System.out.println("Please insert the corresponding info -->");
		System.out.print("Name\t\t: ");
		employeeName=in.next();
		System.out.print("Position\t: ");
		position=in.next();
		System.out.print("Salary\t\t: ");
		salary=in.nextDouble();
		
		System.out.println("Here are the info -->"
				+"\nName\t\t: "+employeeName
				+"\nPosition\t: "+position
				+"\nSalary\t\t: "+salary
				+"\nSalary per year: "+salaryPYear);
	}
	
	
}
