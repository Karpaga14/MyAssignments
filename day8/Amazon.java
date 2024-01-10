package week3.day8;

public class Amazon extends CanaraBank {
	public void recordPaymentDetails()
	{
		System.out.println("Record the payment details");
	}
	public static void main(String[] args) {
		
		Amazon amazon = new Amazon();
		amazon.cardPayments();
		amazon.cashOnDelivery();
		amazon.upiPayments();
		amazon.internetBanking();
		amazon.recordPaymentDetails();
	}

}
