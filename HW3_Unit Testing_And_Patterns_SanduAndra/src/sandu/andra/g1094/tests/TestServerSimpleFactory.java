package sandu.andra.g1094.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import sandu.andra.g1094.ServerInterface;
import sandu.andra.g1094.simplefactory.ApplicationServer;
import sandu.andra.g1094.simplefactory.ServerFactory;
import sandu.andra.g1094.simplefactory.ServerType;

public class TestServerSimpleFactory {

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
	public void testRightSimpleFactory() {
		
		ServerInterface server1 = 
				ServerFactory.getServer(ServerType.applicationServer,serverIpAddress, serverPort,
                                        maximumConnections, isConnected);

		assertEquals("Testing if simple factory is correct", server1.getClass().getName(), 
				ApplicationServer.class.getName());
	}

	@Test
	public void testRightSimpleFactoryUsingInstance() {
		
		ServerInterface server1 = 
				ServerFactory.getServer(ServerType.clientServer,serverIpAddress, serverPort,
                        maximumConnections, isConnected);
		
		assertTrue(server1 instanceof ServerInterface);
	}


}
