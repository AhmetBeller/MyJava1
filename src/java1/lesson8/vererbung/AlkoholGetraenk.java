package java1.lesson8.vererbung;

public class AlkoholGetraenk extends Getraenke {

	private double alkoholGehalt;
	private String hinweisText = "Verkauf an Jugendliche verboten.";

	public AlkoholGetraenk(double inhalt, double preis, double alkoholGehalt) {
		super(inhalt, preis);
		this.alkoholGehalt = alkoholGehalt;
	}

	public String getText() {
		String hinweis = super.getText();
		return hinweis + " " + hinweisText;

	}

	public double getAlkoholGehalt() {
		return alkoholGehalt;
	}

	public void setAlkoholGehalt(double alkoholGehalt) {
		this.alkoholGehalt = alkoholGehalt;
	}

}
