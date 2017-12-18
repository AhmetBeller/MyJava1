package java1.lesson7.string;

public class loesungZeichenZaelen {


	public static void main(String[] args) {
		char[] zeichen1 = { 'a', 'f', 'r' };
		String text1 = "dies ist ein normaler text";
		zaehleBestimmteZeichen(zeichen1, text1);
		char[] zeichen2 = { 'a', 'g', 'i', 'o' };
		String text2 = "wie viele Buchstaben gibt es?";
		zaehleBestimmteZeichen(zeichen2, text2);
	}

	/**
	 * Bestimmt, wie oft ein einzelnes Zeichen aus zeichen in text vorkommt.
	 * 
	 * @param zeichen
	 * @param text
	 */
	private static void zaehleBestimmteZeichen(char[] zeichen, String text) {
		if (zeichen != null && text != null) {
			// fuer jedes Element in zeichen gibt es einen eigenen buffer
			StringBuffer[] zeichenZaehler = new StringBuffer[zeichen.length];
			// alle Elemente initialisieren, da sie null sind
			for (int i = 0; i < zeichen.length; i++) {
				zeichenZaehler[i] = new StringBuffer();
			}
			System.out.println(); // Leerzeile in Konsole
			System.out.println("Es wird folgender Text analyisert: " + text);
			for (int i = 0; i < zeichen.length; i++) {
				char einzelnesZeichen = zeichen[i];
				// pruefe, ob das einzelne Zeichen vorkommt
				int index = text.indexOf(einzelnesZeichen);
				while (index >= 0) {
					// Zeichen gefunden, im dazugehoerigen StringBuffer
					// hinzufuegen
					zeichenZaehler[i].append(einzelnesZeichen);
					// das naechste Zeichen wird ab dem aktuellen Index gesucht
					index = text.indexOf(einzelnesZeichen, index + 1);
				}
			}
			// die laenge eines StringBuffers entspricht der Anzahl gefundener
			// Zeichen
			for (int i = 0; i < zeichen.length; i++) {
				System.out.println("Anzahl " + zeichen[i] + ": "
						+ zeichenZaehler[i].length());
			}
		}
	}
}
