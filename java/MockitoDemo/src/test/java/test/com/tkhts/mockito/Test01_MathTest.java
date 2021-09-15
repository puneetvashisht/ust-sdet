package test.com.tkhts.mockito;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.tkhts.mockito.Math;

public class Test01_MathTest {

	Math mathObj;
	@Before
	public void create(){
		mathObj= new Math();
	}
	
	@Test
	public void testAdd() {
		int result = mathObj.add(1, 2);
		int expectedResult = 3;
		assertSame(expectedResult, result);
	}

}
