package Assignment1;

import java.util.Scanner;

public class Finance {		//1.3 user define class
	String month, department;
	double expenditure, income, netIncome, laborCosts, adExpense, elecBills, dailyProfit, monthlyProfit, wages, totalWages, sales, capital, dailyProfit1;
	int employAm, days, soldItem, ch, soldFruit, soldVeggie; //1.2 pre-define class
	
	Scanner in=new Scanner(System.in);
	
	public Finance() {		//1.4 constructor without argument
		electricityBills();
	}
	
	public Finance(int a) {		//1.4 constructor with 1 argument
		employAm=a;
		totalWagesCosts();
	}
	
	public Finance(int d, String m) {		//1.4 constructor with 2 arguments
		days=d;
		month=m;
		
		monthlyProfit();
		dailyProfit();
		totalIncome();
		totalNetIncome();
		totalWagesCosts();
		totalMiscellanousCosts();
	}
	
	public Finance(int sf, int sv, double i) {
		soldFruit=sf;
		soldVeggie=sv;
		income=i;
		
		sales();
	}
	
	public void sales() {
		System.out.println("\n========== SALES ==========");
		System.out.println("Please enter the corresponding info. ");
		System.out.print("Sold amount of fruits\t: ");
		soldFruit=in.nextInt();
		System.out.print("Sold amount of vegetables\t: ");
		soldVeggie=in.nextInt();
		System.out.print("Total income per day\t: ");
		income=in.nextDouble();
		System.out.print("Total expense per day\t: ");
		expenditure=in.nextDouble();
		soldItem=soldFruit+soldVeggie;
		netIncome=income-expenditure;
		
		System.out.println("Net income\t: "+netIncome
							+"\nTotal sold item\t: "+soldItem);
	}
	
	public void electricityBills() {
		System.out.println("\n=========== ELECTRICITY BILLS ==========");
		System.out.println("Please enter the corresponding info. ");
		System.out.print("Department\t: ");
		department=in.next();
		System.out.print("Month\t: ");
		month=in.next();
		System.out.print("Electric bill\t: ");
		elecBills=in.nextDouble();
		
		System.out.println("\nYou've entered the following info");
		System.out.println("\nDepartment\t: "+department
				+"\nMonth\t: "+month
				+"\nElectric bill\t: "+elecBills);
	}
	
	public void totalWagesCosts() {
		System.out.println("\n========== WAGES ==========");
		System.out.println("Please enter the corresponding info. ");
		System.out.print("Total number of employees\t: ");
		employAm=in.nextInt();
		System.out.print("Wages per person\t\t: ");
		wages=in.nextDouble();
		totalWages=employAm*wages;
		
		System.out.println("You've entered the following info");
		System.out.println("\nTotal number of employees\t: "+employAm
				+"\nWages per person\t\t: RM"+wages);
		System.out.printf("Total wages costs is RM%.2f", totalWages);
	}
	
	public void monthlyProfit() {
		System.out.println("========== MONTHLY PROFIT ==========");
		System.out.println("Please enter the corresponding info. ");
		System.out.print("Month\t\t\t: ");
		month=in.next();
		System.out.print("Total items sold\t: ");
		soldItem=in.nextInt();
		System.out.print("Total sales\t\t: ");
		sales=in.nextDouble();
		System.out.print("Total capital\t\t: ");
		capital=in.nextDouble();
		monthlyProfit=sales-capital;
		
		System.out.println("You've entered the following info"
				+"\nTotal items sold\t: "+soldItem
				+"\nTotal sales\t\t: "+sales
				+"\nTotal capital\t\t: "+capital);
		System.out.printf("Monthly profit for "+month+" is RM%.2f", monthlyProfit);
	}
	
	public void dailyProfit() {
		System.out.println("\n========== DAILY PROFIT ==========");
		dailyProfit=monthlyProfit/30;
		dailyProfit1=monthlyProfit/31;
		System.out.println("\nEnter 1 for month with 30 days"
				+"\nEnter 2 for month with 31 days"
				+"\nPlease enter your selection -->");
		ch = in.nextInt();
		if(ch==1) {
			System.out.printf("Daily profit is RM%.2f", dailyProfit);
		} else {
			System.out.printf("Daily profit is RM%.2f", dailyProfit1);
		}
	}
	
	public void totalIncome() {
		System.out.println("\n========== TOTAL INCOME ==========");
		System.out.println("Please enter the corresponding info. ");
		System.out.print("Total items sold\t: ");
		soldItem=in.nextInt();
		System.out.print("Total sales\t\t: ");
		sales=in.nextDouble();
		System.out.print("Fruits sold\t\t: ");
		soldFruit=in.nextInt();
		System.out.print("Vegetables sold\t\t: ");
		soldVeggie=in.nextInt();
		
		System.out.println("\nTotal income is RM"+sales+" by selling "+soldFruit+" number of fruits and "+soldVeggie+" number of vegetables");
	}
	
	public void totalNetIncome() {
		System.out.println("\n========== TOTAL NET INCOME ==========");
		sales=7950;
		elecBills=134;
		adExpense=56.48;
		wages=4800;
		netIncome=sales-elecBills-adExpense-wages;
		System.out.println("\nTotal net income is RM"+netIncome);
	}
	
	public void totalMiscellanousCosts() {
		System.out.println("\n========== MISCELLANOUS COSTS ==========");
		elecBills=134;
		adExpense=56.48;
		wages=4800;
		expenditure=elecBills+adExpense+wages;
		System.out.println("\nTotal expenditure is RM"+expenditure);
		
	}
}


