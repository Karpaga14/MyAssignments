package week3.day8;
//Requirements: - Create an interface DatabseConnection with the following abstract methods: - connect() - disconnect() - executeUpdate() - Implement the interface in a Concrete class. - Provide concrete implementations for the abstract methods in the Concrete class.
public interface DatabaseConnection {
	public void connect();
	public void disconnect();
	public void executeUpdate();
	
}
