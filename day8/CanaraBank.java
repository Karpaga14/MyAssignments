package week3.day8;

public abstract class CanaraBank implements Payments {
	
	public void cashOnDelivery()
	{
		System.out.println("Cash on Delivery");
	}
	
	public void upiPayments()
	{
		System.out.println("UPI Payments");
	}
	
	public void cardPayments()
	{
		System.out.println("Card Payment");
	}
	
	public void internetBanking()
	{
		System.out.println("Internet Banking");
	}
	public abstract void recordPaymentDetails();
}
