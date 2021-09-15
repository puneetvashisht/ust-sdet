package test.com.tkhts.mockito;

import static org.junit.Assert.assertSame;

import org.junit.Before;
import org.junit.Test;

import com.tkhts.mockito.Math;

public class Test02_MathAddTestWithOutMock {
	Math mathObj; 

	@Before
	public void create() {
		mathObj = new Math();//create a math object
	}

	@Test
	public void testAdd() {
		assertSame(3, mathObj.add(1, 2)); // Assert that math object return 3
	}

}
