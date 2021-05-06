package sandu.andra.g1094.proxy;

public class Internet  implements ClinicInternetArea{

	public String userName;
	
	
	public Internet(String userName) {
		super();
		this.userName = userName;	
	}


	@Override
	public void getInternetConnection() {		
		System.out.println("Internet access permission for " + this.userName +"!");		
	}

}
