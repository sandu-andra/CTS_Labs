package ro.ase.csie.cts.g1094.testing.tests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import ro.ase.csie.cts.g1094.testing.exceptions.WrongAgeException;
import ro.ase.csie.cts.g1094.testing.exceptions.WrongGradesException;
import ro.ase.csie.cts.g1094.testing.exceptions.WrongNameException;
import ro.ase.csie.cts.g1094.testing.models.Student;

public class TestStudent {

	//test fixture
	static Student student = null;
	static ArrayList<Integer> grades = null;
	static int initialAge = 19;
	static String initialName = "John Doe";
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		//executed once before unit tests
		
		grades = new ArrayList<>();
		grades.add(5);
		grades.add(9);
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		//executed once after unit tests
		grades.clear();
		grades = null;
	}

	@Before
	public void setUp() throws Exception {
		//executed each time before each unit test
		student = new Student(initialName, initialAge, grades);
	}

	@After
	public void tearDown() throws Exception {
		//executed each time after each unit test
		student = null;
	}

	@Ignore  //dezactivezi testul for this moment
	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	//varianta cu throws
	@Test
	public void testSetNameRightValue() throws WrongNameException {		
		String newName = "Alice";		
		student.setName(newName);	
		assertEquals("Testing with a right name", newName, student.getName());
	}

	//varianta cu try catch
	@Test
	public void testSetAgeRightValue() {
        int newAge = initialAge + 1; //in order to avoid having the same value
	    try {
			student.setAge(newAge);
			assertEquals("Test for right value", newAge, student.getAge());
		} catch (WrongAgeException e) {
			fail("We got an exception for a right value");
		}
	}
	
	//with try catch
	@Test
	public void testSetAgeWrongValue() {
		int newAge = initialAge * -1;
		try {
			student.setAge(newAge);
			fail("We didn't got an exception for a negative age");
		} catch (WrongAgeException e) {
			assertTrue(true);
		}
	}
	
	//with throws
	@Test(expected = WrongAgeException.class )
	public void testSetAgeWrongValueGraterThanMax() throws WrongAgeException {
		int newAge = Student.MAX_AGE + 1000;
		student.setAge(newAge);
	}
	
	@Test
	public void testGetGradesAverageAscendingOrder() throws WrongGradesException {
		ArrayList<Integer> sortedGrades = new ArrayList<>();
		sortedGrades.add(7);
		sortedGrades.add(8);
		sortedGrades.add(9);
		sortedGrades.add(10);
		student.setGrades(sortedGrades);
		
		float expectedAverage = 8.5f;
		float computedAverage = student.getGradesAverage();
		
		assertEquals("Testing with an ascending sorted set of grades", 
		             expectedAverage, computedAverage, 0); //0 - precision
		
	}
	
	@Test
	public void testGetGradesAverageCardinalityZero() throws WrongGradesException {
		ArrayList<Integer> grades = new ArrayList<>();
		student.setGrades(grades);
		
		float expectedAverage = 0;
		float computedAverage = student.getGradesAverage();
		
		assertEquals("Testing with an empty set of grades",
				expectedAverage, computedAverage, 0);
	}
	
	@Test
	public void testGetGradesAverageCardinalityOne() throws WrongGradesException {
		ArrayList<Integer> grades = new ArrayList<>();
		int theGrade = 10;
		grades.add(theGrade);
		
		student.setGrades(grades);
		
		float expectedAverage = theGrade;
		float computedAverage = student.getGradesAverage();
		
		assertEquals("Testing with one grade",
				expectedAverage, computedAverage, 0);
	}
}
