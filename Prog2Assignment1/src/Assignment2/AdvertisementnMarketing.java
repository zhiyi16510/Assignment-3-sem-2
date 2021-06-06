package Assignment2;

public class AdvertisementnMarketing extends GroceryStore{
	String socialMedia, voucher;
	double discount;		//1.2 pre-define class
	
	public AdvertisementnMarketing() {		//1.4 constructor without argument
		super();
		setSocialMedia("Facebook");
		setVoucher("RM10 Voucher");
		setDiscount(20);
		
		advertisementAppeal();
		printInfo();
		tradAdvert();
		digitalAdvert();
	}
	
	public AdvertisementnMarketing(String sc) {		//1.4 constructor with one argument
		socialMedia=sc;
		
		printInfo();
	}
	
	public AdvertisementnMarketing(String v, double d) {		//1.4 constructor with two arguments
		voucher=v;
		discount=d;
		
		tradAdvert();
		digitalAdvert();
	}
	
	//2.3 setter method
	public void setSocialMedia(String socialMedia) {
		this.socialMedia=socialMedia;
	}
	
	public void setVoucher(String voucher) {
		this.voucher=voucher;
	}
	
	public void setDiscount(double discount) {
		this.discount=discount;
	}
	
	//2.3 getter method
	public String getSocialMedia() {
		return this.socialMedia;
	}
	
	public String getVoucher() {
		return this.voucher;
	}
	
	public double getDiscount() {
		return this.discount;
	}
	
	public void advertisementAppeal() {
		System.out.println("\n========== ADVERTISEMENT ========== "
				+"\nAdvertisement appeal are chose severely"
				+"\nWe mainly used rational advertising appeals for marketing"
				+"\nSuch as providing facts and logic reasoning");
	}
	
	public void printInfo() {
		if(socialMedia=="Facebook") {
			System.out.println("\n========== FACEBOOK =========="
					+"\nAn ad on Facebook costs about RM15.34"
					+"\nWe mainly post on Facebook per week"
					+"\n**** POSTING EXAMPLE ****"
					+"\nWe're holding a giveaway event !! "
					+"\nAN APPLE A DAY KEEPS THE DOCOR AWAY"
					+"\nBuy up to RM100 apple from our shop and stand a chance to win the new Apple iPhone"
					+"\nThe winner will be announced on both our Facebook page and Twitter page");
		} else {
			System.out.println("\n========== TWITTER =========="
					+"\nAn ad on Twitter costs about RM12.67"
					+"\nWe mainly post on Twitter per week"
					+"\n**** POSTING EXAMPLE ****"
					+"\nWe're going live on Twitter tonight on 9pm !!"
					+"\nDo join us to win mysterious prizes during livestream"
					+ "\nThe winner will be announced during the livestream");
		}
	}
	
	public void tradAdvert() {
		System.out.println("\n========== TRADITIONAL AD =========="
				+"\nTraditional advertising means delivering promotional messages through mass media"
				+ "\nSuch as newspaper, printed magazines, and flyers"
				+ "\n**** POSTING EXAMPLE ****"
				+ "\nOur grocery store is expanding"
				+ "\nTo celebrate, we gift these vouchers to those who would support us in the future"
				+ "\nThis "+voucher+" could be used until 11 July 2021");
	}
	
	public void digitalAdvert() {
		System.out.println("\n========== DIGITAL AD =========="
				+"\nDigital advertising relies on internet for more curated audiences"
				+ "\nSuch as paid search advertising, social media advertising, and display advertising"
				+ "\n**** POSTING EXAMPLE ****"
				+ "\nTo celebrate Mother's Day of the year"
				+ "\nWe have decided to giveaway a discount code of "+discount+"%"
				+ "\nThe discount code can only be used on Mother's Day of 2021");
	}
	
}


