package threads;

import model.Poem;

public class PoemThread extends Thread{
	private Poem poem;
	public PoemThread(String name, Poem pm) {
		super(name);
		poem = pm;
	}
	
	public void run() {
		if(poem.isTitleLargerThanAuthor()) {
			poem.printTitle();
			poem.printAuthor();
			poem.printLine(0);
		}else {
			poem.printTitle();
			poem.printLine(0);
			poem.printAuthor();
		}
	}
}

