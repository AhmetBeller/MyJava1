package java1.lesson7.Enum;

public class Waehrung {	// Lösung
	
	enum GueltigeWaehrungen {EUR, USD, GBP};
	
	private static double waehrungsUmrechnung(GueltigeWaehrungen waehrung, double betrag) {
		double umrechnungsBetrag = 0;
		switch (waehrung) {
		case EUR:
			umrechnungsBetrag = betrag * 1.20;
			break;
		case USD:
			umrechnungsBetrag = betrag * 0.91;
			break;
		case GBP:
			umrechnungsBetrag = betrag * 1.45;
			break;
		}

		return umrechnungsBetrag;

	}
	public static void main(String[] args) {
		double betrag = 10;
		
		GueltigeWaehrungen waehrung = GueltigeWaehrungen.EUR;
		double umrechnungsBetrag = waehrungsUmrechnung(waehrung, betrag);
		System.out.println("Währung: " + waehrung + ", Betrag: " + umrechnungsBetrag);
		
		waehrung = GueltigeWaehrungen.GBP;
		umrechnungsBetrag = waehrungsUmrechnung(waehrung, betrag);
		System.out.println("Währung: " + waehrung + ", Betrag: " + umrechnungsBetrag);
		
		waehrung = GueltigeWaehrungen.USD;
		umrechnungsBetrag = waehrungsUmrechnung(waehrung, betrag);
		System.out.println("Währung: " + waehrung + ", Betrag: " + umrechnungsBetrag);
	}
}
