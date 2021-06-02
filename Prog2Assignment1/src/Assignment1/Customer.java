package Assignment1;

import java.util.Scanner;

public class Customer {		//1.3 user define class
	String customerName, customerAddress, orderItem, customerType;
	int quantityItem;
	long phoneNumber; 	//1.2 pre-define class
	
	Scanner in=new Scanner(System.in);
	
	public Customer() {		//1.4 constructor without argument
		System.out.println("Welcome to our grocery store"
				+"\nHave fun buying fresh produced products ! ");
	}
	
	public Customer(String t) {		//1.4 constructor with one argument 
		customerType=t;
		System.out.println("You're a "+t+" customer");
		if(t=="Walk-in") {
			customerOrder();
		} else if(t=="Online") {
			customerRegist();
		}
	}
	
	public Customer(String t, String i) {		//1.4 constructor with two arguments
		customerType=t;
		orderItem=i;
	
		customerInfo();
	}
	
	public void customerRegist() {
		System.out.println("Hi and welcome to our grocery store ! "
				+"\nPlease do key in your info as first-time registration -->");
		System.out.print("Name\t\t: ");
		customerName=in.next();
		System.out.print("Address\t\t: ");
		customerAddress=in.next();
		System.out.print("Phone number\t: ");
		phoneNumber=in.nextLong();
		
		System.out.println("Here are your info -->"
				+"\nName\t\t: "+customerName
				+"\nAddress\t\t: "+customerAddress
				+"\nPhone number\t: "+phoneNumber);
	}
	
	public void customerInfo() {
		System.out.println("Please enter the corresponding info -->");
		System.out.print("Name\t: ");
		customerName=in.next();
		System.out.print("Walk-in or online\t: ");
		customerType=in.next();
		System.out.print("Bought item\t: ");
		orderItem=in.next();
		System.out.print("Bought quantity\t: ");
		quantityItem=in.nextInt();
		
		System.out.println("Here are the info -->"
				+"\nName\t: "+customerName
				+"\nCustomer type\t: "+customerType
				+"\nBought item\t: "+orderItem
				+"\nBought quantity\t: "+quantityItem);
	}
	
	public void customerOrder() {
		System.out.println("Welcome to our grocery store ! ");
		System.out.print("Bought item\t: ");
		orderItem=in.next();
		System.out.print("Bought quantity\t: ");
		quantityItem=in.nextInt();
		
		System.out.println("Bought item\t: "+orderItem
				+"\nBought quantity\t: "+quantityItem);
	}
	
}
