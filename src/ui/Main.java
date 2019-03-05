package ui;

import model.Poem;
import threads.PoemThread;

public class Main {
	public static void main(String[] args) {
		Poem p1 = new Poem( "There is another sky",
							"Emily Dickinson",
							"Ever serene and fair\n"+
							"And there is another sunshine\n"+
							"Though it be darkness there");
		PoemThread pt1 = new PoemThread("p1",p1);
		
		Poem p2 = new Poem( "All the World's a Stage",
				"William Shakespeare, Bard of Avon",
				"And all the men and women merely player\n"+
				"They have their exits and their entrances");
		PoemThread pt2 = new PoemThread("p2",p2);
		
		pt1.start();
		pt2.start();
		
		System.out.println("The algorithms are poetry!");
	}
}

