package sandu.andra.g1094.simplefactory;

import sandu.andra.g1094.ServerInterface;

public class ServerFactory {
	
	 public static ServerInterface getServer(ServerType serverType, String serverIpAddress, int serverPort, 
			 int maximumConnections, boolean isConnected) {
  	   
	   ServerInterface server = null;
	   
  	   switch(serverType) {
  	   case applicationServer:
  		 server = new ApplicationServer(serverIpAddress, serverPort, maximumConnections, isConnected);
  		 break;
  	   case collaborationServer:
  		 server = new CollaborationServer(serverIpAddress, serverPort, maximumConnections, isConnected);
  		 break;
  	   case clientServer:
  		 server = new ClientServer(serverIpAddress, serverPort, maximumConnections, isConnected);
  		 break;
  	   default:
  		   throw new UnsupportedOperationException("This server type does not exist!");
  	   } 	   
  	   return server;
     }
}
