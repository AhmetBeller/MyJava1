package java1.lesson8.vererbung;

public class SuessGetraenk extends Getraenke {

	private double kalorien;

	public SuessGetraenk(double inhalt, double preis, double kalorien) {
		super(inhalt, preis);
		this.kalorien = kalorien;
	}

	public double getKalorien() {
		return kalorien;
	}

	public void setKalorien(double kalorien) {
		this.kalorien = kalorien;
	}

}
