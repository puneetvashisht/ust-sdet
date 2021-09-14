package mavendemo.tests;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


import mavendemo.util.MathUtils;


@RunWith(Parameterized.class)
public class ParametrizedTest {
	@Parameters(name = "Run #Square of : {0}^2={1}")
	public static Iterable<Object [] > data(){
		return Arrays.asList(new Object [][]{ {1,1}, {2,4}, {3,19}, {4,16}, {5,25} });
	}
	
	private final int input;
	private final int resultExpected;
	
	public ParametrizedTest(final int input, final int result){
		this.input = input;
		this.resultExpected = result;
	}
	
	@Test
	public void testUserMapping(){
		Assert.assertEquals(resultExpected, MathUtils.square(input));
	}

}
