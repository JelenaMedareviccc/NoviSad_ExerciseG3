import static org.junit.Assert.*;

import org.junit.Test;

public class TestBowling {

	@Test
	public void testZaKonstruktor1() {
		Frame f=new Frame(5,2);
		assertEquals(5,f.getFirstThrow());
	}
	
	@Test
	public void testZaKonstruktor2() {
		Frame f=new Frame(5,2);
		assertEquals(2,f.getSecondThrow());
	}
	
	@Test
	public void testZaScore() {
		Frame f=new Frame(5,2);
		int expected=5+2;
		assertEquals(expected,f.score());
	}
	

}
