package ro.ase.csie.cts.g1094.singleton.registry;

import java.util.Hashtable;

public class DbConnection {
	String connString;
	String schema;  //database name

	//part of the context
	private static Hashtable<String, DbConnection> connections = new Hashtable<>();
	
	private DbConnection() {
		System.out.println("Creating a connection object");
		System.out.println("Loading configuration.....");
		this.connString = "127.0.0.1:1443";
		this.schema = "cts";
	}

	
	//manadatory private -SINGLETON - constructors are PRIVATE
	//you are not allowed to create multiple objects
	private DbConnection(String connString, String schema) {
		super();
		this.connString = connString;
		this.schema = schema;
	}
	
	
	//conString is the key
	public static DbConnection getDbConnection(String connString, String schema) {
		DbConnection connection = connections.get(connString);
		if(connection == null) {
			connection = new DbConnection(connString, schema);
			connections.put(connString, connection);
		}
       return connection;
	}
	
}
