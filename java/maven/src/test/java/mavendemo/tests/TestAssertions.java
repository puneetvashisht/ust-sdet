package mavendemo.tests;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAssertions {

	@Test
	public void testAssertions(){
		String str1 = new String("abc");
		String str2 = new String("abc");
		String str3 = null;
		String str4 = "abc";
		String str5 = "abc";
		
		int val1 = 5;
		int val2 = 6;
		
		String[] expectedArray = {"one", "two", "three"};
		String[] resultArray = {"one", "two", "three"};
		// Reference comparision
		// assertSame(str1, str2);
		// Equality check --- equals
		assertEquals(str1, str2);
		assertTrue(val1 < val2);
		assertFalse("Value 1 should be greater than value 2", val1 > val2);
		
		assertNotNull(str1);
		assertNull(str3);
		assertSame(str4, str5);
		assertNotSame(str1, str3);
		assertArrayEquals(expectedArray, resultArray);
	}

}
