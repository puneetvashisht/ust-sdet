package mavendemo.tests;



import java.util.ArrayList;
import java.util.List;

import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.StringDescription;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;


public class HamcrestExamples {

	@Test
	public void testAssertions() {
		String first = new String("Ginger");
		String second = new String("Ginger");
		assertThat(first, equalTo(second) );
	}
	
	@Test
	   public void assertThat1(){
	       String str="test";
	       assertThat(str, not(equalTo("anotherTest")));
	   }
	
	@Test
	public void assertThat2(){
		double d = 1.3;
		assertThat(d, is(1.3));
		assertThat(d, is(not(1.4)));
	}
	
	@Test
	public void assertThatCollections1(){
		List<String> list = new ArrayList<String>(){
			{
				add("one");
				add("two");
				add("three");
			}
		};
		
		assertThat(list, hasItem("two"));
		assertThat(list, not(hasItem("four")));
			
		}
	
	@Test
	public void ArithmeticEqual(){
		assertThat(2 + 2, is(equalTo(4)));
	}
	
	@Test
	public void isAllUse(){
		assertThat("Hello", is(allOf(notNullValue(), instanceOf(String.class), equalTo("Hello"))));
	}
	
	@Test
	public void isAllUse1(){
		assertThat("Hello", is(not(allOf(notNullValue(), instanceOf(Integer.class)))));
	}
	
	@Test
	public void anyExample(){
		assertThat("Hello", is(any(String.class)));
	}
	
	@Test
	  public void anyExample2() throws Exception {
	    assertThat("Hello", is(anyOf(nullValue(), instanceOf(String.class), equalTo("Goodbye"))));
	  }
	@Test
	  public void anyExample3() throws Exception {
	    assertThat("Hello", is(not(anyOf(nullValue(), instanceOf(Integer.class), equalTo("Goodbye")))));
	  }
	
	@Test
	  public void anyExample4() throws Exception {
	    assertThat("Hello", is(anything()));
	  }
	
}

