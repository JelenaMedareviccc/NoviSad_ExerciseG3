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
	public void testZaScore() throws BowlingException{
		Frame f=new Frame(5,2);
		int expected=5+2;
		assertEquals(expected,f.score());
	}
	
	@Test(expected=BowlingException.class)
	public void testZaScoreSaGreskom() throws BowlingException {
		Frame f=new Frame(5,10);
		int expected=5+10;
		assertEquals(expected,f.score());
	}
	
	@Test
	public void testAkojeSpare() {
		Frame f=new Frame(5,5);
		assertTrue(f.isSpare());
	}
	
	@Test
	public void testAkoNijeSpare() {
		Frame f=new Frame(3,5);
		assertFalse(f.isSpare());
	}
	
	@Test
	public void testAkojeStrike() {
		Frame f=new Frame(10,0);
		assertTrue(f.isStrike());
	}
	

}
