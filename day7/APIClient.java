package week3.day7;

public class APIClient {
	/*
	 * Requirements: - Inside the APIClient class, define the sendRequest method
	 * with multiple overloaded versions. - One version should accept one input
	 * argument: a String for the endpoint. - Another version of the sendRequest
	 * method should accept three input arguments: a String for the endpoint, a
	 * String for the requestBody, and a boolean parameter requestStatus to verify
	 * whether the request is successful. - Create a main method to demonstrate the
	 * usage of the overloaded sendRequest method. - Inside the main method, create
	 * an object of the APIClient class. - Call both versions of the sendRequest
	 * method on the APIClient object with different sets of input arguments to
	 * showcase method overloading.
	 */
	public static void main(String[] args) {
		APIClient api = new APIClient();
		api.sendRequest("https://platform.testleaf.com/#/");
		api.sendRequest("https://platform.testleaf.com/#/","UserName", true);
	}
	public void sendRequest(String endpoint)
	{
		System.out.println("API endpoint is "+endpoint);
	}
	public void sendRequest(String endpoint,String requestBody,boolean requestStatus)
	{
		System.out.println("Endpoint : "+endpoint+" Request Body: "+requestBody+" Request Status : "+requestStatus);
	}

}
