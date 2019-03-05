package ui;
import model.Poem;
import threads.PoemThread;

public class Main {
	public static void main(String[] args) throws InterruptedException {
		Poem p1 = new Poem( "When You Come",
							"Maya Angelou",
							"When you come to me, unbidden\n" + 
							"Beckoning me\n" + 
							"To long-ago rooms\n" + 
							"Where memories lie.");
		PoemThread pt1 = new PoemThread("p1",p1);
		Poem p2 = new Poem( "It is Here",
				"Harold Pinter",
				"What sound was that?\n" + 
				"I turn away, into the shaking room.");
		PoemThread pt2 = new PoemThread("p2",p2);
		pt1.start();
		pt2.start();
		pt1.join();
		System.out.println("The algorithms are poetry?");
	}
}

