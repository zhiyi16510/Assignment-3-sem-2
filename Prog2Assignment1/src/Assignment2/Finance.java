package Assignment2;

public class Finance extends Customer implements Payment{	//2.1 inheritance && 2.5 interface
	String month, department;
	double expenditure, income, netIncome, laborCosts, adExpense, elecBills, dailyProfit, monthlyProfit, wages, totalWages, sales, capital, dailyProfit1;
	int employAm, days, soldItem, ch, soldFruit, soldVeggie; //1.2 pre-define class
	
	public Finance() {
		super();
		System.out.println("\n=========== FINANCE ============");
		printInfo();
	}
	
	//2.3 setter method
	public void setSoldFruit(int soldFruit) {
		this.soldFruit=soldFruit;
	}
	
	public void setSoldVeggie(int soldVeggie) {
		this.soldVeggie=soldVeggie;
	}
	
	public void setIncome(double income) {
		this.income=income;
	}
	
	public void setExpenditure(double expenditure) {
		this.expenditure=expenditure;
	}
	
	public void setDepartment(String department) {
		this.department=department;
	}
	
	public void setMonth(String month) {
		this.month=month;
	}
	
	public void setElecBills(double elecBills) {
		this.elecBills=elecBills;
	}
	
	public void setEmployAm(int employAm) {
		this.employAm=employAm;
	}
	
	public void setWages(double wages) {
		this.wages=wages;
	}
	
	public void setSoldItem(int soldItem) {
		this.soldItem=soldItem;
	}
	
	public void setSales(double sales) {
		this.sales=sales;
	}
	
	public void setCapital(double capital) {
		this.capital=capital;
	}
	
	public void setAdExpense(double adExpense) {
		this.adExpense=adExpense;
	}
	
	//2.3 getter method
	public int getSoldFruit() {
		return this.soldFruit;
	}
	
	public int getSoldVeggie() {
		return this.soldVeggie;
	}
	
	public double getIncome() {
		return this.income;
	}
	
	public double getExpenditure() {
		return this.expenditure;
	}
	
	public String getDepartment() {
		return this.department;
	}
	
	public String getMonth() {
		return this.month;
	}
	
	public double getElecBills() {
		return this.elecBills;
	}
	
	public int getEmployAm() {
		return this.employAm;
	}
	
	public double getWages() {
		return this.wages;
	}
	
	public int getSoldItem() {
		return this.soldItem;
	}
	
	public double getSales() {
		return this.sales;
	}
	
	public double getCapital() {
		return this.capital;
	}
	
	public double getAdExpense() {
		return this.adExpense;
	}
	
	public double getPayment() {	//2.5 interface getPayment
		return 5643;
	}
	
	public void sales() {
		setSoldFruit(123);
		setSoldVeggie(50);
		setIncome(getPayment());
		setExpenditure(890);
		soldItem=soldFruit+soldVeggie;
		netIncome=income-expenditure;
		
		System.out.println("\n========== SALES INFO =========="
				+"\nSold amount of fruits\t: "+getSoldFruit()
				+"\nSold amount of vegetables\t: "+getSoldVeggie()
				+"\nTotal income per day\t: "+getIncome()
				+"\nTotal expense per day\t: "+getExpenditure()
				+"\nNet income\t: "+netIncome
				+"\nTotal sold item\t: "+soldItem);
		
	}
	
	public void electricityBills() {
		setDepartment("Produce");
		setMonth("June");
		setElecBills(65.42);
		
		System.out.println("\n========== ELECTRICITY BILLS =========="
				+"\nDepartment\t: "+getDepartment()
				+"\nMonth\t: "+getMonth()
				+"\nElectric bill\t: "+getElecBills());
	}
	
	public void totalWagesCosts() {
		setEmployAm(4);
		setWages(1100);
		
		totalWages=employAm*wages;
		System.out.println("\n========== WAGES =========="
							+"\nTotal number of employees\t: "+getEmployAm()
							+"\nWages per person\t\t: RM"+getWages());
		System.out.printf("Total wages costs is RM%.2f", totalWages);
	}
	
	public void monthlyProfit() {
		setSoldItem(390);
		setMonth("June");
		setSales(8946);
		setCapital(3750);
		
		monthlyProfit=getSales()-getCapital();
		System.out.println("\n========== MONTHLY PROFIT =========="
				+"\nTotal items sold\t: "+getSoldItem()
				+"\nTotal sales\t\t: "+getSales()
				+"\nTotal capital\t\t: "+getCapital());
		System.out.printf("Monthly profit for "+getMonth()+" is RM%.2f", monthlyProfit);
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
		setSales(8946);
		setSoldFruit(123);
		setSoldVeggie(50);
		
		System.out.println("\n========== TOTAL INCOME ==========");
		System.out.println("\nTotal income is RM"+getSales()+" by selling "+getSoldFruit()+" number of fruits and "+getSoldVeggie()+" number of vegetables");
	}
	
	public void totalNetIncome() {
		System.out.println("\n========== TOTAL NET INCOME ==========");
		setSales(7950);
		setElecBills(134);
		setAdExpense(56.48);
		setWages(4800);
		netIncome=getSales()-getElecBills()-getAdExpense()-getWages();
		System.out.println("\nTotal net income is RM"+netIncome);
	}
	
	public void totalMiscellanousCosts() {
		System.out.println("\n========== MISCELLANOUS COSTS ==========");
		setElecBills(134);
		setAdExpense(56.48);
		setWages(4800);
		expenditure=getElecBills()+getAdExpense()+getWages();
		System.out.println("\nTotal expenditure is RM"+expenditure);
		
	}
	
	public void printInfo() {	//2.2 printInfo method
		sales();
		electricityBills();
		totalWagesCosts();
		monthlyProfit();
		dailyProfit();
		totalIncome();
		totalNetIncome();
		totalMiscellanousCosts();
	}
}
