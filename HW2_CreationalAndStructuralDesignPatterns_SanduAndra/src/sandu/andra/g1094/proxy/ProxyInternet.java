package sandu.andra.g1094.proxy;

public class ProxyInternet implements ClinicInternetArea {

	private Internet internet;
	private String userName;
	private int accountTypeId;
	

	public ProxyInternet(String userName, int accountTypeId) {
		super();
		this.userName = userName;
		this.accountTypeId = accountTypeId;
		System.out.println("Checking credentials...Waiting...");	
	}


	@Override
	public void getInternetConnection() {
		if(accountTypeId>3 || accountTypeId < 0) {
			System.out.println("You do not have access "+ this.userName + ". Ask the admin for more info!");
		}
		else {
			internet = new Internet(userName);
			internet.getInternetConnection();
		}
		
	}
	
	

}
