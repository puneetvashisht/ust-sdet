package mavendemo.tests;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class OrderedTestCases {

	@Test
	public void secondTest(){
		System.out.println("Executing secondTest() here...");
	}
	
	@Test
	public void firstTest(){
		System.out.println("Executing firstTest() here...");
	}
	
	@Test
	public void thirdTest(){
		System.out.println("Executing thirdTest() here...");
	}
	
	@Test
	public void fourthTest(){
		System.out.println("Executing fourthTest() here...");
	}
	
	
	@Test
	public void fifthTest(){
		System.out.println("Executing fifthTest() here...");
	}
	
	
	@Test
	public void sixthTest(){
		System.out.println("Executing sixthTest() here...");
	}

}
