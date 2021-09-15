package test.com.tkhts.mockito;

import static org.junit.Assert.assertSame;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;

import com.tkhts.mockito.Math;

public class Test03_MathMockAddTest {
	Math mathObj; //The object that needs to mocked
	
	@Before
	public void create(){
		mathObj= mock(Math.class); //Create Math mock Object
		when(mathObj.add(1, 2)).thenReturn(3); // Configure it to return 3 when arguments passed are 1,2
	}
	
	@Test
	public void testAdd() {
		assertSame(3, mathObj.add(1,2)); //Assert that math object return 3
	}

}
