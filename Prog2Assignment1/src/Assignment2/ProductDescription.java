package Assignment2;

import java.util.Scanner;

public class ProductDescription extends GroceryStore{	//2.1 inheritance
String itemCode, itemCategory;		//1.2 pre-define class
	
	Scanner in=new Scanner(System.in);
	
	//2.3 setter method
	public void setItemCategory(String itemCategory) {
		this.itemCategory=itemCategory;
	}
	
	public void setItemCode(String itemCode) {
		this.itemCode=itemCode;
	}
	
	//2.3 getter method
	public String getCategory() {
		return this.itemCategory;
	}
	
	public String getCode() {
		return this.itemCode;
	}
	
	public ProductDescription() {		
		super();
		System.out.println("\n========== PRODUCE SECTION =========="
				+"\nProduce section includes products like fresh fruits and vegetables. "
				+"\nPlease input your selection between these two segment -->"
				+"\n1. Fruits\t2. Vegetables");
		setItemCategory("Fruits");
		setItemCode("ML");
		printInfo();
	}
	
	public ProductDescription(String c, String co) {		
		this.itemCategory=c;
		this.itemCode=co;
		System.out.println("\n========== PRODUCT DESCRIPTION =========="
				+"\nYour selected product category is "+getCategory());
		if(getCategory()=="Fruits") {
			fruitsInfo();
		} else if(getCategory()=="Vegetables") {
			veggieInfo();
		} 
	}
	
	public void printInfo() {		//2.2 method printInfo
		System.out.println("\n========== PRODUCT DESCRIPTION =========="
				+"\nYour selected product category is "+getCategory()
				+"\nYour selected product code is "+getCode());
		if(getCategory()=="Fruits" && getCode()=="AP") {
			apple();
		} else if(getCategory()=="Fruits" && getCode()=="ML") {
			melon();
		} else if(getCategory()=="Vegetables" && getCode()=="PO") {
			potato();
		} else if(getCategory()=="Vegetables" && getCode()=="YA") {
			yam();
		} else if(getCategory()=="Vegetables" && getCode()=="LE") {
			lettuce();
		} else if(getCategory()=="Vegetables" && getCode()=="SP") {
			spinach();
		}
	}
	
	public void spinach() {
		System.out.println("\n========== PRODUCT DETAILS ==========\n"
				+"Item code\t: SP-SMS\n"
				+"Item name\t: Semi-savoy Spinach\n"
				+"Item type\t: Spinach\n"
				+"Item colour\t: Yellow\n"
				+"Item country\t: China\n"
				+"Item grade\t: A\n"
				+"Item price\t: RM1.51\n"
				+ "==================================\n");
	}
	
	public void lettuce() {
		System.out.println("\n========== PRODUCT DETAILS ==========\n"
				+"Item code\t: LE-BTL\n"
				+"Item name\t: Butterhead Lettuce\n"
				+"Item type\t: Lettuce\n"
				+"Item colour\t: Green\n"
				+"Item country\t: Roman\n"
				+"Item grade\t: B\n"
				+"Item price\t: RM4.99\n"
				+ "==================================\n");
	}
	
	public void yam() {
		System.out.println("\n========== PRODUCT DETAILS ==========\n"
				+"Item code\t: YA-UBE\n"
				+"Item name\t: Ube\n"
				+"Item type\t: Yam\n"
				+"Item colour\t: Purple\n"
				+"Item country\t: Australia\n"
				+"Item grade\t: A\n"
				+"Item price\t: RM11.00\n"
				+ "==================================\n");
	}
	
	public void potato() {
		System.out.println("\n========== PRODUCT DETAILS ==========\n"
				+"Item code\t: PO-RST\n"
				+"Item name\t: Russet\n"
				+"Item type\t: Potato\n"
				+"Item colour\t: Brown\n"
				+"Item country\t: United States\n"
				+"Item grade\t: B\n"
				+"Item price\t: RM5.99\n"
				+ "==================================\n");
	}
	
	public void melon() {
		System.out.println("\n========== PRODUCT DETAILS ==========\n"
				+"Item code\t: ML-GAL\n"
				+"Item name\t: Galia Melon\n"
				+"Item type\t: Melon\n"
				+"Item colour\t: Yellow\n"
				+"Item country\t: Israel\n"
				+"Item grade\t: A\n"
				+"Item price\t: RM10.50\n"
				+ "==================================\n");
		System.out.println("\n========== PRODUCT DETAILS ==========\n"
				+"Item code\t: ML-CANTL\n"
				+"Item name\t: Cantaloupe\n"
				+"Item type\t: Melon\n"
				+"Item colour\t: Green\n"
				+"Item country\t: Armenia\n"
				+"Item grade\t: B\n"
				+"Item price\t: RM15.90\n"
				+ "==================================\n");
	}
	
	public void apple() {
		System.out.println("\n========== PRODUCT DETAILS ==========\n"
				+"Item code\t: AP-GS\n"
				+"Item name\t: Granny Smith\n"
				+"Item type\t: Apple\n"
				+"Item colour\t: Green\n"
				+"Item country\t: Australia\n"
				+"Item grade\t: A\n"
				+"Item price\t: RM1.70\n"
				+ "==================================\n");
		System.out.println("\n========== PRODUCT DETAILS ==========\n"
				+"Item code\t: AP-FJ\n"
				+"Item name\t: Fuji\n"
				+"Item type\t: Apple\n"
				+"Item colour\t: Red\n"
				+"Item country\t: Japan\n"
				+"Item grade\t: A\n"
				+"Item price\t: RM1.96\n"
				+ "==================================\n");

		System.out.println("\n========== PRODUCT DETAILS ==========\n"
				+"Item code\t: AP-OPL\n"
				+"Item name\t: Opal\n"
				+"Item type\t: Apple\n"
				+"Item colour\t: Yellow\n"
				+"Item country\t: Czech\n"
				+"Item grade\t: B\n"
				+"Item price\t: RM9.90\n"
				+ "==================================\n");
	}
	
	public void fruitsInfo(){
		System.out.println("\n========== PRODUCT DETAILS ==========\n"
				+"Item name\t: Granny Smith\n"
				+"Item type\t: Apple\n"
				+"Item colour\t: Green\n"
				+"Item country\t: Australia\n"
				+"Item grade\t: A\n"
				+"Item price\t: RM1.70\n"
				+ "==================================\n");

		System.out.println("\n========== PRODUCT DETAILS ==========\n"
				+"Item name\t: Fuji\n"
				+"Item type\t: Apple\n"
				+"Item colour\t: Red\n"
				+"Item country\t: Japan\n"
				+"Item grade\t: A\n"
				+"Item price\t: RM1.96\n"
				+ "==================================\n");

		System.out.println("\n========== PRODUCT DETAILS ==========\n"
				+"Item name\t: Opal\n"
				+"Item type\t: Apple\n"
				+"Item colour\t: Yellow\n"
				+"Item country\t: Czech\n"
				+"Item grade\t: B\n"
				+"Item price\t: RM9.90\n"
				+ "==================================\n");

		System.out.println("\n========== PRODUCT DETAILS ==========\n"
				+"Item name\t: Galia Melon\n"
				+"Item type\t: Melon\n"
				+"Item colour\t: Yellow\n"
				+"Item country\t: Israel\n"
				+"Item grade\t: A\n"
				+"Item price\t: RM10.50\n"
				+ "==================================\n");

		System.out.println("\n========== PRODUCT DETAILS ==========\n"
				+"Item name\t: Cantaloupe\n"
				+"Item type\t: Melon\n"
				+"Item colour\t: Green\n"
				+"Item country\t: Armenia\n"
				+"Item grade\t: B\n"
				+"Item price\t: RM15.90\n"
				+ "==================================\n");
	}
	
	public void veggieInfo() {
		System.out.println("\n========== PRODUCT DETAILS ==========\n"
				+"Item name\t: Russet\n"
				+"Item type\t: Potato\n"
				+"Item colour\t: Brown\n"
				+"Item country\t: United States\n"
				+"Item grade\t: B\n"
				+"Item price\t: RM5.99\n"
				+ "==================================\n");

		System.out.println("\n========== PRODUCT DETAILS ==========\n"
				+"Item name\t: Ube\n"
				+"Item type\t: Yam\n"
				+"Item colour\t: Purple\n"
				+"Item country\t: Australia\n"
				+"Item grade\t: A\n"
				+"Item price\t: RM11.00\n"
				+ "==================================\n");

		System.out.println("\n========== PRODUCT DETAILS ==========\n"
				+"Item name\t: Butterhead Lettuce\n"
				+"Item type\t: Lettuce\n"
				+"Item colour\t: Green\n"
				+"Item country\t: Roman\n"
				+"Item grade\t: B\n"
				+"Item price\t: RM4.99\n"
				+ "==================================\n");

		System.out.println("\n========== PRODUCT DETAILS ==========\n"
				+"Item name\t: Semi-savoy Spinach\n"
				+"Item type\t: Spinach\n"
				+"Item colour\t: Yellow\n"
				+"Item country\t: China\n"
				+"Item grade\t: A\n"
				+"Item price\t: RM1.51\n"
				+ "==================================\n");
	}
}
