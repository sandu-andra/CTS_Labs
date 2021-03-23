package ro.ase.csie.cts.g1094.singleton.staticref;


public class DbConnection {
	
	String connString;
	String schema;  //database name
	
	
	//can only be read - private final static
	//eager-instantation (at the beggining, dont' wait) =! lazy (that waits someone to create the object)
	public final static DbConnection connection = new DbConnection();
	
	//static class initializer
	static {
		//called only once before the class is loaded by the JVM
		System.out.println("Hello, DbConnection is loaded");
		connection.connString = "10.0.0.1:1443";
		connection.schema = "tempData";
	}
	
	//constructor initializer
	{
		//called every time before any constructor call
		System.out.println("Building an object");
	}
	
	//if you don't define it, you get the free public version of it
	private DbConnection() {
		System.out.println("Creating a connection object");
		System.out.println("Loading configuration.....");
		this.connString = "127.0.0.1:1443";
		this.schema = "cts";
	}


}
