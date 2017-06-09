import java.util.ArrayList;
import java.util.List;

// Before you commit and push write your student ID and finish time here.
// Finish time:
// Student ID:

public class BowlingGame {
	//a bowling game is made of (at least) 10 frames
	private List<Frame> frames = new ArrayList<Frame>();
	private Frame bonus;
	

	public BowlingGame(){
		bonus=new Frame(0,0);
	}
	
	// adds a frame to the game
	public void addFrame(Frame frame) throws BowlingException{
		if(frames.size()>10)
			throw new BowlingException("Broj cijelina ne smije biti veci od 10!");
		else
			frames.add(frame);
	}
	
	// Sets the bonus throws at the end of the game
	public void setBonus(int firstThrow, int secondThrow) {
		bonus.setFirstThrow(firstThrow);
	}
	
	// Returns the game score
	public int score(){
		//to be implemented: should return game score 
		return 0;
	}
	
	public Frame getBonus() {
		return bonus;
	}

}
