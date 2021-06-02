package Assignment1;

import java.util.Scanner;

public class Inventory {	//1.3 user define class
	String itemCode, itemName;
	int totalFruit, totalVeggie, rottenItem, stock;	
	double price, cost; //1.2 pre-define class
	
	Scanner in=new Scanner(System.in);
	
	public Inventory() {		//1.4 constructor without argument
		itemRegist();
	}
	
	public Inventory(int s) {		//1.4 constructor with one argument
		stock=s;
		
		stockInfo();
	}
	
	public Inventory(double p, double c) {		//1.4 constructor with two arguments
		price=p;
		cost=c;
		
		inventoryCosts();
		
	}
	
	public void itemRegist() {
		System.out.println("===== REGISTER NEW ITEM ====="
				+"\nPlease enter corresponding info. ");
		System.out.print("Item name\t: ");
		itemName=in.next();
		System.out.print("Item code\t: ");
		itemCode=in.next();
		System.out.print("Price\t: ");
		price=in.nextDouble();
		System.out.print("Stock\t: ");
		stock=in.nextInt();
		
		System.out.println("New item has been registered. "
				+"\nItem name\t:"+itemName
				+"\nItem code\t: "+itemCode
				+"\nPrice\t: RM"+price
				+"\nStock\t: "+stock);
	}
	
	public void stockInfo() {
		System.out.println("===== UPDATE STOCK ====="
				+"\nPlease enter corresponding info. ");
		System.out.print("Total fruits amount\t: ");
		totalFruit=in.nextInt();
		System.out.print("Total vegetables amount\t: ");
		totalVeggie=in.nextInt();
		System.out.print("Total rotten item\t: ");
		rottenItem=in.nextInt();
		stock=totalFruit+totalVeggie;
		stock=stock-rottenItem;
		
		System.out.println("Updated stock amount\t: "+stock);
	}
	
	public void inventoryCosts() {
		System.out.println("===== INVENTORY COSTS ====="
				+"\nPlease enter corresponding info.");
		System.out.print("Total fruits amount\t: ");
		totalFruit=in.nextInt();
		System.out.print("Total vegetables amount\t: ");
		totalVeggie=in.nextInt();
		stock=totalFruit+totalVeggie;
		price=price*stock;
		cost=cost*stock;
		
		System.out.println("Total price\t: RM"+price
				+"\nTotal costs\t: RM"+cost);
	}
}
