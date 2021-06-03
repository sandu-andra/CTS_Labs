package sandu.andra.g1094.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import sandu.andra.g1094.prototype.ServerPrototype;

public class TestServerPrototype {

	//test fixture
		static String serverIpAddress = "192.168.0.1";
		static int serverPort = 80;
		static int maximumConnections = 3;
		static boolean isConnected = true;
		
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Ignore
	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testRightPrototype() {
		
		ServerPrototype server1 = new ServerPrototype(serverIpAddress, serverPort, 
				                                   maximumConnections, isConnected);
		try {
			ServerPrototype server2 = (ServerPrototype) server1.clone();
			assertEquals("Testing if prototype is correct", server2.getClass(), server1.getClass());
		} catch (CloneNotSupportedException e) {
			fail("We got an exception");
		}
	
	}
	@Test
	public void testRightPrototypeIpAddress() throws CloneNotSupportedException {
		
		ServerPrototype server1 = new ServerPrototype(serverIpAddress, serverPort,
				                                       maximumConnections, isConnected);
		ServerPrototype server2 = (ServerPrototype) server1.clone();
		assertEquals("Testing if the clone method works fine", server1.getIpAddress(), server2.getIpAddress());
		
	}
}
