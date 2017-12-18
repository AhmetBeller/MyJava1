package java1.lesson8.vererbung;

public class Getraenke {
	private double inhalt;
	private double preis;
	
	private String werbeText= "Getränke Online-Shop: 24 Stunden für Sie da.";

	// public Getraenke() {}

	public Getraenke(double inhalt, double preis) {
		this.inhalt = inhalt;
		this.preis = preis;
	}

	public String getText() {
		return werbeText;
	}

	public double getInhalt() {
		return inhalt;
	}

	public void setInhalt(double inhalt) {
		this.inhalt = inhalt;
	}

	public double getPreis() {
		return preis;
	}

	public void setPreis(double preis) {
		this.preis = preis;
	}

}
