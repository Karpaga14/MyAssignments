package week3.day8;

/*Requirements: Create an Interface Payments with the following abstract methods: - cashOnDelivery() - upiPayments() - cardPayments() - internetBanking() Create an Abstract Class CanaraBank that implements Payments interface and adds `recordPaymentDetails()` for payment specifics.
Create a Concrete Class Amazon that inherits CanaraBank, implementing methods.*/
public interface Payments {
	public void cashOnDelivery();
	public void upiPayments();
	public void cardPayments();
	public void internetBanking();
	
}
