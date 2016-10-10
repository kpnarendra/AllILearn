package pkgTest;

import static org.testng.Assert.*;
import org.testng.annotations.Test;

public class NewTest {
	@Test
	public void testPass() {
		String str = "This test case is passed";
		assertEquals("This test case is passed",str);
	}
  

	@Test
	public void testFail() {
		String str = "This test case if failed.";
	    assertEquals("This test case is failed",str);
	}
}
