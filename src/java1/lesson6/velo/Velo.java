package java1.lesson6.velo;

public class Velo {
	private int geschwindigkeit = 0;
	private int gaenge = 1;

	public Velo(int geschwindigkeit, int gaenge) {	// Konstruktor
		this.geschwindigkeit = geschwindigkeit;
		this.gaenge = gaenge;
	}

	public void schaltung(int schaltWert) {
		geschwindigkeit = geschwindigkeit + schaltWert;

		if (geschwindigkeit < 0) {
			geschwindigkeit = 0;
		}
		System.out.println(geschwindigkeit);
	}

	public void setGaenge(int gaenge) {
		this.gaenge = gaenge;
	}

}
