package sandu.andra.g1094.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import sandu.andra.g1094.singleton.ServerSingleton;

public class TestServerSingleton {
	

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
	public void testRightSingleton() {
		
		ServerSingleton server1 = ServerSingleton.getServer();
		ServerSingleton server2 = ServerSingleton.getServer();
		boolean expectedResult = true;
		boolean actualResult = false;
		
		if(server1 == server2)
			actualResult = true;
		
		assertEquals("Testing if singleton is correct", expectedResult, actualResult);
	}
	
	
}
