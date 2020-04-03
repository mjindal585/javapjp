import static org.junit.Assert.*;

import org.junit.Test;

public class Demo1Test {

	@Test
	public void StrTest() {
		Demo1 demo = new Demo1();
		assertEquals("HelloWorld",demo.stringConcat("Hello", "World"));
	}

}
