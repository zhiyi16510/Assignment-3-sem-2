package Assignment2;

import java.util.Scanner;

public class Customer extends GroceryStore implements Payment{	//2.1 inheritance && 2.5 interface

	String customerName, customerAddress, orderItem, customerType;
	int quantityItem;
	long phoneNumber;
	double price, totalPrice, balance;//1.2 pre-define class
	
	Scanner in=new Scanner(System.in);
	
	public Customer() {
		super();
		
		System.out.println("\n========== CUSTOMER ==========");
		printInfo();
	}
	
	//2.3 setter method
	public void setCustomerType(String customerType) {
		this.customerType=customerType;
	}
	
	public void setCustomerName(String customerName) {
		this.customerName=customerName;
	}
	
	public void setOrderItem(String orderItem) {
		this.orderItem=orderItem;
	}
	
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress=customerAddress;
	}
	
	public void setQuantity(int quantityItem) {
		this.quantityItem=quantityItem;
	}
	
	public void setPhone(long phoneNumber) {
		this.phoneNumber=phoneNumber;
	}
	
	public void setPrice(double price) {
		this.price=price;
	}
	
	//2.3 getter method
	public String getCustomerType() {
		return this.customerType;
	}
	
	public String getCustomerName() {
		return this.customerName;
	}
	
	public String getOrderItem() {
		return this.orderItem;
	}
	
	public String getCustomerAddress() {
		return this.customerAddress;
	}
	
	public int getQuantity() {
		return this.quantityItem;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public long getPhone() {
		return this.phoneNumber;
	}
	
	public void customerRegist() {
		setCustomerName("ZY");
		setCustomerAddress("Pangsapuri Quantra");
		setPhone(01234567);
		
		System.out.println("\n========== CUSTOMER REGISTRATION ==========");
		System.out.println("\nHere are your info -->"
				+"\nName\t\t: "+getCustomerName()
				+"\nAddress\t\t: "+getCustomerAddress()
				+"\nPhone number\t: "+getPhone());
	}
	
	public void customerInfo() {
		setCustomerName("ZY");
		setCustomerType("Online");
		setOrderItem("Melon");
		setQuantity(2);
		setPrice(12.60);
		
		balance=getPayment()-totalPrice;
		totalPrice=getPrice()*getQuantity();
		System.out.println("\n========== ONLINE CUSTOMER ORDER INFO ==========");
		System.out.println("\nHere are the info -->"
				+"\nName\t: "+getCustomerName()
				+"\nCustomer type\t: "+getCustomerType()
				+"\nBought item\t: "+getOrderItem()
				+"\nBought quantity\t: "+getQuantity()
				+"\nPrice per each\t: "+getPrice()
				+"\nTotal price\t: "+totalPrice
				+"\nBalance after payment\t: "+balance);
	}
	
	public void customerOrder() {
		setOrderItem("Potato");
		setQuantity(12);
		setPrice(1.45);
		
		balance=getPayment()-totalPrice;
		totalPrice=getPrice()*getQuantity();
		System.out.println("\n========== WALK-IN CUSTOMER ORDER INFO ==========");
		System.out.println("\nBought item\t: "+getOrderItem()
							+"\nBought quantity\t: "+getQuantity()
							+"\nPrice per each\t: "+getPrice()
							+"\nTotal Price\t: "+totalPrice
							+"\nBalance after payment\t: "+balance);
	}
	
	public void printInfo() {	//2.2 printInfo method
		customerRegist();
		customerInfo();
		customerOrder();
	}
	
	public double getPayment() {
		return 50;	//2.5 interface getPayment()
		
	}

}
