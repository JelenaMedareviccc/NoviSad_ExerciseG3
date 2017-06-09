import static org.junit.Assert.*;

import org.junit.Test;

public class TestBowling {

	@Test
	public void testZaKonstruktor1() {
		Frame f=new Frame(5,2);
		assertEquals(5,f.getFirstThrow());
	}

}
