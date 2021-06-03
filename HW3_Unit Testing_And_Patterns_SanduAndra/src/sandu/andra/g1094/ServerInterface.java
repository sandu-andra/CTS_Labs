package sandu.andra.g1094;

public interface ServerInterface {
	
	    public String getIpAddress();
	    public int getPort();
	    public int getMaxConnections();

	    public boolean connect();
	    public boolean disconnect();

}
