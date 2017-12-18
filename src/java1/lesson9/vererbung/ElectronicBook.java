package java1.lesson9.vererbung;

public class ElectronicBook extends Book{
	int fileSize;
	String format;
	
	public ElectronicBook(String author, String language, String title, int fileSize, String format){
		super(author, language, title);
		this.fileSize = fileSize;
		this.format =format;
	}
	
	public void save(){
		
	}
}
