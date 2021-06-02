package Assignment1;

import java.util.Scanner;

public class ProductDescription {		//1.3 user define class
	String itemCode, itemCategory;		//1.2 pre-define class
	
	Scanner in=new Scanner(System.in);
	
	public ProductDescription() {		//1.4 constructor without argument
		System.out.println("========== PRODUCE SECTION =========="
				+"\nProduce section includes products like fresh fruits and vegetables. "
				+"\nPlease input your selection between these two segment -->"
				+"\n1. Fruits\t2. Vegetables");
		itemCategory=in.next();
		System.out.println("Your selection is "+itemCategory);
	}
	
	public ProductDescription(String c) {		//1.4 constructor with one argument
		itemCategory=c;
		System.out.println("========== PRODUCT DESCRIPTION =========="
				+"\nYour selected product category is "+itemCategory);
		if(itemCategory=="Fruits") {
			fruitsInfo();
		} else if(itemCategory=="Vegetables") {
			veggieInfo();
		} 
	}
	
	public ProductDescription(String c, String co) {		//1.4 constructor with two arguments
		itemCategory=c;
		itemCode=co;
		
		System.out.println("========== PRODUCT DESCRIPTION =========="
				+"\nYour selected product category is "+itemCategory
				+"\nYour selected product code is "+itemCode);
		if(c=="Fruits" && co=="AP") {
			apple();
		} else if(c=="Fruits" && co=="ML") {
			melon();
		} else if(c=="Vegetables" && co=="PO") {
			potato();
		} else if(c=="Vegetables" && co=="YA") {
			yam();
		} else if(c=="Vegetables" && co=="LE") {
			lettuce();
		} else if(c=="Vegetables" && co=="SP") {
			spinach();
		}
	}
	
	public void spinach() {
		System.out.println("========== PRODUCT DETAILS ==========\n"
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
		System.out.println("========== PRODUCT DETAILS ==========\n"
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
		System.out.println("========== PRODUCT DETAILS ==========\n"
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
		System.out.println("========== PRODUCT DETAILS ==========\n"
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
		System.out.println("========== PRODUCT DETAILS ==========\n"
				+"Item code\t: ML-GAL\n"
				+"Item name\t: Galia Melon\n"
				+"Item type\t: Melon\n"
				+"Item colour\t: Yellow\n"
				+"Item country\t: Israel\n"
				+"Item grade\t: A\n"
				+"Item price\t: RM10.50\n"
				+ "==================================\n");
		System.out.println("========== PRODUCT DETAILS ==========\n"
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
		System.out.println("========== PRODUCT DETAILS ==========\n"
				+"Item code\t: AP-GS\n"
				+"Item name\t: Granny Smith\n"
				+"Item type\t: Apple\n"
				+"Item colour\t: Green\n"
				+"Item country\t: Australia\n"
				+"Item grade\t: A\n"
				+"Item price\t: RM1.70\n"
				+ "==================================\n");
		System.out.println("========== PRODUCT DETAILS ==========\n"
				+"Item code\t: AP-FJ\n"
				+"Item name\t: Fuji\n"
				+"Item type\t: Apple\n"
				+"Item colour\t: Red\n"
				+"Item country\t: Japan\n"
				+"Item grade\t: A\n"
				+"Item price\t: RM1.96\n"
				+ "==================================\n");

		System.out.println("========== PRODUCT DETAILS ==========\n"
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
		System.out.println("========== PRODUCT DETAILS ==========\n"
				+"Item name\t: Granny Smith\n"
				+"Item type\t: Apple\n"
				+"Item colour\t: Green\n"
				+"Item country\t: Australia\n"
				+"Item grade\t: A\n"
				+"Item price\t: RM1.70\n"
				+ "==================================\n");

		System.out.println("========== PRODUCT DETAILS ==========\n"
				+"Item name\t: Fuji\n"
				+"Item type\t: Apple\n"
				+"Item colour\t: Red\n"
				+"Item country\t: Japan\n"
				+"Item grade\t: A\n"
				+"Item price\t: RM1.96\n"
				+ "==================================\n");

		System.out.println("========== PRODUCT DETAILS ==========\n"
				+"Item name\t: Opal\n"
				+"Item type\t: Apple\n"
				+"Item colour\t: Yellow\n"
				+"Item country\t: Czech\n"
				+"Item grade\t: B\n"
				+"Item price\t: RM9.90\n"
				+ "==================================\n");

		System.out.println("========== PRODUCT DETAILS ==========\n"
				+"Item name\t: Galia Melon\n"
				+"Item type\t: Melon\n"
				+"Item colour\t: Yellow\n"
				+"Item country\t: Israel\n"
				+"Item grade\t: A\n"
				+"Item price\t: RM10.50\n"
				+ "==================================\n");

		System.out.println("========== PRODUCT DETAILS ==========\n"
				+"Item name\t: Cantaloupe\n"
				+"Item type\t: Melon\n"
				+"Item colour\t: Green\n"
				+"Item country\t: Armenia\n"
				+"Item grade\t: B\n"
				+"Item price\t: RM15.90\n"
				+ "==================================\n");
	}
	
	public void veggieInfo() {
		System.out.println("========== PRODUCT DETAILS ==========\n"
				+"Item name\t: Russet\n"
				+"Item type\t: Potato\n"
				+"Item colour\t: Brown\n"
				+"Item country\t: United States\n"
				+"Item grade\t: B\n"
				+"Item price\t: RM5.99\n"
				+ "==================================\n");

		System.out.println("========== PRODUCT DETAILS ==========\n"
				+"Item name\t: Ube\n"
				+"Item type\t: Yam\n"
				+"Item colour\t: Purple\n"
				+"Item country\t: Australia\n"
				+"Item grade\t: A\n"
				+"Item price\t: RM11.00\n"
				+ "==================================\n");

		System.out.println("========== PRODUCT DETAILS ==========\n"
				+"Item name\t: Butterhead Lettuce\n"
				+"Item type\t: Lettuce\n"
				+"Item colour\t: Green\n"
				+"Item country\t: Roman\n"
				+"Item grade\t: B\n"
				+"Item price\t: RM4.99\n"
				+ "==================================\n");

		System.out.println("========== PRODUCT DETAILS ==========\n"
				+"Item name\t: Semi-savoy Spinach\n"
				+"Item type\t: Spinach\n"
				+"Item colour\t: Yellow\n"
				+"Item country\t: China\n"
				+"Item grade\t: A\n"
				+"Item price\t: RM1.51\n"
				+ "==================================\n");
	}
}
