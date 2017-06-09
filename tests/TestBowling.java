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
	
	@Test
	public void testAkoNijeStrike() {
		Frame f=new Frame(5,5);
		assertFalse(f.isStrike());
	}
	
	@Test(expected=BowlingException.class)
	public void testPrilikomUnosaViseOdDozvoljenogBrojaFramova() throws BowlingException {
		BowlingGame game=new BowlingGame();
		for(int i=0;i<15;i++)
		{
			game.addFrame(new Frame(2,2));
		}
	}
	
	@Test
	public void testPrilikomUnosaFramova() throws BowlingException {
		BowlingGame game=new BowlingGame();
		for(int i=0;i<10;i++)
		{
			game.addFrame(new Frame(2,2));
		}
	}
	
	@Test
	public void testZaSetovanjeBonusa1() {
		BowlingGame game=new BowlingGame();
		game.setBonus(5, 0);
		assertEquals(5,game.getBonus().getFirstThrow());	
	}
	
	@Test
	public void testZaSetovanjeBonusa2() {
		BowlingGame game=new BowlingGame();
		game.setBonus(5, 7);
		assertEquals(7,game.getBonus().getSecondThrow());	
	}
	
	

}
