package test.com.tkhts.mockito;

import static org.junit.Assert.assertSame;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;

import com.tkhts.mockito.Math;

public class Test04_MathMockMulTest {
	Math mathObj;
	
	@Before
	public void create(){
		mathObj= mock(Math.class);
		//Multiply any number with zero. The function should return zero
		when(mathObj.mul(anyInt(), eq(0))).thenReturn(0); 	}
	
	@Test
	public void testMul() {
		assertSame(mathObj.mul(1,0),0);
		assertSame(mathObj.mul(0,1),0);
	}

}
