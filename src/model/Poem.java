package model;

public class Poem {
	private String author;
	private String title;
	private String[] text;
	public Poem(String tt, String at, String tx) {
		title = tt;
		author = at;
		text = tx.split("\n");
	}
	
	public void printTitle() {
		System.out.println(title.toUpperCase());
	}
	
	public void printAuthor() {
		System.out.println("by "+author);		
	}
	
	public void printLine(int i) {
		System.out.println(text[i]);
	}
	
	public boolean isTitleLargerThanAuthor() {
		return title.length()>author.length();
	}
}

