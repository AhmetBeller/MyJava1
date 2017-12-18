package java1.lesson4.Punkt;

public class Punkt {
	// Beginn Klassenrumpf
	private int xKoordinate;
	private int yKoordinate;

	public int getXKoordinate() { // Zum Lesen fon x
		return xKoordinate;
	}

	public void setXKoordinate(int x) { // Zum Schreiben fon x
		xKoordinate = x;
	}

	public int getYKoordinate() { // Zum Lesen fon x
		return yKoordinate;
	}

	public void setYKoordinate(int y) { // Zum Schreiben fon x
		yKoordinate = y;
	}

	public void verschiebe(int xRichtung, int yRichtung) { // Zum Verschieben
		xKoordinate = xKoordinate + xRichtung;
		yKoordinate = yKoordinate + yRichtung;
	}

	public void ausgabe() {
		System.out.println("Punkt X:" + xKoordinate + "  Punkt Y:"
				+ xKoordinate);
	}
	

} // Ende Klassenrumpf

