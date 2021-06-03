package sandu.andra.g1094.singleton;

import sandu.andra.g1094.ServerInterface;

public class ServerSingleton implements ServerInterface{

	String serverIpAddress;
	int serverPort;
	int maximumConnections;
	boolean isConnected;
	
	private static ServerSingleton server = null;
	
	private ServerSingleton() {
		System.out.println("Please wait....Loading...");
		this.serverIpAddress = "169.229.50.5";
		this.serverPort = 3124;
		this.maximumConnections = 3;
		this.isConnected = true;
	}
	
	
	private ServerSingleton(String serverIpAddress, int serverPort, int maximumConnections, 
			boolean isConnected) {
		this.serverIpAddress = serverIpAddress;
		this.serverPort = serverPort;
		this.maximumConnections = maximumConnections;
		this.isConnected = isConnected;
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
	
	public static ServerSingleton getServer() {
		if(ServerSingleton.server == null) {
			server = new ServerSingleton();
		}
		return ServerSingleton.server;
	}

}
