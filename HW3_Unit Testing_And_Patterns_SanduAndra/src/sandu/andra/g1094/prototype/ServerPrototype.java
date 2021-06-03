package sandu.andra.g1094.prototype;
import sandu.andra.g1094.ServerInterface;

public class ServerPrototype implements ServerInterface, Cloneable{

	String serverIpAddress;
	int serverPort;
	int maximumConnections;
	boolean isConnected;
	
	
	public ServerPrototype(String serverIpAddress, int serverPort, int maximumConnections, 
			boolean isConnected) {	
		this.serverIpAddress = serverIpAddress;
		this.serverPort = serverPort;
		this.maximumConnections = maximumConnections;
		this.isConnected = isConnected;
		
		System.out.println("The server is loading....Please wait...");
	
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("The server is ready!");
	
	}
	
	private ServerPrototype() {
		
	}

	@Override
	public String getIpAddress() {
		return this.serverIpAddress;
	}

	@Override
	public int getPort() {
		return this.serverPort;
	}

	@Override
	public int getMaxConnections() {
		return this.maximumConnections;
	}

	@Override
	public boolean connect() {
		System.out.println("The server is connected.");
		return true;
	}

	@Override
	public boolean disconnect() {
		System.out.println("The server is disconnected.");
		return false;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		
		ServerPrototype copyServer = new ServerPrototype();
		copyServer.serverIpAddress = this.serverIpAddress;
		copyServer.serverPort = this.serverPort;
		copyServer.maximumConnections = this.maximumConnections;
		copyServer.isConnected = this.isConnected;
		return copyServer;
	}
	
	

}
