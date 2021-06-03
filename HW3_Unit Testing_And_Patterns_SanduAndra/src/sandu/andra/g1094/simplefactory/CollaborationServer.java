package sandu.andra.g1094.simplefactory;

import sandu.andra.g1094.ServerInterface;

public class CollaborationServer implements ServerInterface{

	String serverName;
	String serverIpAddress;
	int serverPort;
	int maximumConnections;
	boolean isConnected;
	
	public CollaborationServer(String serverIpAddress, int serverPort, int maximumConnections,
			boolean isConnected) {
		super();
		this.serverName = "Collaboration Server";
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

}

