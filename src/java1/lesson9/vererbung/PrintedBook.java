package java1.lesson9.vererbung;

public class PrintedBook extends Book{
	int pages;
	boolean isPaperback;
	
	public PrintedBook(String author, String language, String title, int pages, boolean isPaperback){
		super(author, language, title);
		this.pages = pages;
		this.isPaperback =isPaperback;
	}
	
	
	
	public void copy(){
		
	}
}
