package week3.day8;

public class JavaConnection implements DatabaseConnection {

	public static void main(String[] args) {
		JavaConnection java = new JavaConnection();
		java.connect();
		java.disconnect();
		java.executeUpdate();

	}

	public void connect() {
		System.out.println("Database Connected");
		
	}

	public void disconnect() {
		System.out.println("Database disconnected");
		
	}

	public void executeUpdate() {
		System.out.println("Execute the update");
		
	}

}
