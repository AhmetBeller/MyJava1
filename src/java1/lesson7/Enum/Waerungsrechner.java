package java1.lesson7.Enum;

public class Waerungsrechner { // Eigene Lösung

	public enum GueltigeWaerungen {
		EUR, USD, GBP
	};

	public Waerungsrechner(GueltigeWaerungen gueltigeWaerungen, double betrag) {	// Konstruktor
		System.out.println("Währung: " + gueltigeWaerungen + ", Betrag: " + waehrungsUmrechnung(gueltigeWaerungen, betrag));
	}
	
	private static double waehrungsUmrechnung(GueltigeWaerungen gueltigeWaerungen, double betrag) {
		double resultat = 0;
		switch (gueltigeWaerungen)
		{
		case EUR: {
			resultat = betrag * 1.20;
			break;
		}
		case USD: {
			resultat = betrag * 0.91;
			break;
		}
		case GBP: {
			resultat = betrag * 1.45;
			break;
		}

		}
		return resultat;
		
	}

	public static void main(String[] args) {

		Waerungsrechner Aufgabe1 = new Waerungsrechner(GueltigeWaerungen.EUR, 10.0);
		Waerungsrechner Aufgabe2 = new Waerungsrechner(GueltigeWaerungen.USD, 10.0);
		Waerungsrechner Aufgabe3 = new Waerungsrechner(GueltigeWaerungen.GBP, 10.0);
		
		System.out.println("Währung: EUR, Betrag: " + waehrungsUmrechnung(GueltigeWaerungen.EUR, 10.));
	}
}
