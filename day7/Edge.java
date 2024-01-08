package week3.day7;

public class Edge extends Browser {
	String browserName = "Edge";
	public static void main(String[] args) {
		Edge edge = new Edge();
		edge.takeSnap();
		edge.clearCookies();
		edge.closeBrowser();
		edge.navigateBack();
	}
	public void takeSnap()
	{
		System.out.println("Snap taken in "+browserName+"browser");
	}
	public void clearCookies()
	{
		System.out.println("Cookies cleared in "+browserName+"browser");
	}

}
