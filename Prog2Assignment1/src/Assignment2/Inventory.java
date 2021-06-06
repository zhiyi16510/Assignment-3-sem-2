package Assignment2;

public class Inventory extends GroceryStore implements Payment{	//2.1 inheritance
	String itemCode, itemName;
	int totalFruit, totalVeggie, rottenItem, stock;	
	double price, cost, balance; //1.2 pre-define class

	public Inventory() {
		super();
		System.out.println("\n========== INVENTORY ==========");
		printInfo();
	}
	
	//2.2 setter method
	public void setItemName(String itemName) {
		this.itemName=itemName;
	}
	
	public void setItemCode(String itemCode) {
		this.itemCode=itemCode;
	}
	
	public void setPrice(double price) {
		this.price=price;
	}
	
	public void setStock(int stock) {
		this.stock=stock;
	}
	
	public void setTotalFruit(int totalFruit) {
		this.totalFruit=totalFruit;
	}
	
	public void setTotalVeggie(int totalVeggie) {
		this.totalVeggie=totalVeggie;
	}
	
	public void setRottenItem(int rottenItem) {
		this.rottenItem=rottenItem;
	}
	
	public void setCosts(double cost) {
		this.cost=cost;
	}
	
	//2.2 getter method
	public String getItemName() {
		return this.itemName;
	}
	
	public String getItemCode() {
		return this.itemCode;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public int getStock() {
		return this.stock;
	}
	
	public int getTotalFruit() {
		return this.totalFruit;
	}
	
	public int getTotalVeggie() {
		return this.totalVeggie;
	}
	
	public int getRottenItem() {
		return this.rottenItem;
	}
	
	public double getCosts() {
		return this.cost;
	}
	
	public double getPayment() {	//2.5 implement
		return 10000;
	}
	
	public void itemRegist() {
		setItemName("Blackcurrant");
		setItemCode("BLC");
		setPrice(8.79);
		setStock(50);
		
		System.out.println("\n========== REGISTER NEW ITEM ==========");
		System.out.println("\nNew item has been registered. "
				+"\nItem name\t: "+getItemName()
				+"\nItem code\t: "+getItemCode()
				+"\nPrice\t\t: RM"+getPrice()
				+"\nStock\t\t: "+getStock());
	}
	
	public void stockInfo() {
		setTotalFruit(560);
		setTotalVeggie(472);
		setRottenItem(89);
		
		stock=getTotalFruit()+getTotalVeggie();
		stock=stock-getRottenItem();
		System.out.println("\n========== UPDATE STOCK INFO ==========");
		System.out.println("\nTotal fruits\t\t: "+getTotalFruit()
		+"\nTotal vegetables\t: "+getTotalVeggie()
		+"\nTotal rotten item\t: "+getRottenItem()
		+"\nUpdated stock amount\t: "+stock);
	}
	
	public void inventoryCosts() {
		setTotalFruit(560);
		setTotalVeggie(472);
		setPrice(4213.60);
		setCosts(2154.87);
		
		balance=getPayment()-getCosts();
		stock=getTotalFruit()+getTotalVeggie();
		System.out.println("\n========== INVENTORY COSTS ==========");
		System.out.println("Total fruits amount\t: "+getTotalFruit()
		+"\nTotal vegetables amount\t: "+getTotalVeggie()
		+"\nTotal price\t\t: "+getPrice()
		+"\nTotal stock\t\t: "+stock
		+"\nTotal costs\t\t: "+getCosts()
		+"\nCapital\t\t\t: "+balance);
	}
	
	public void printInfo() {	//2.2 use method printInfo
		itemRegist();
		stockInfo();
		inventoryCosts();
	}
	
}
