package test.com.tkhts.mockito;

import static org.junit.Assert.assertSame;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;

import com.tkhts.mockito.Math;

public class Test07_MathMockVerfiyTest {
	Math mathObj;
	
	@Before
	public void create(){
		mathObj= mock(Math.class);
		when(mathObj.add(1,2)).thenReturn(3); 
	}
	
	@Test
	public void test() {
		//call the add function with 1,2 as arguments
		assertSame(mathObj.add(1,2),3);
		
		//Verify whether add method is tested with arguments 1,2 
		verify(mathObj).add(eq(1), eq(2));
		
		//Verify whether add method is called only once
		verify(mathObj,times(1)).add(1,2);
	}

}
