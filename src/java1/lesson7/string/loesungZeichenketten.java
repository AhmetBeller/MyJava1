package java1.lesson7.string;

public class loesungZeichenketten {

	public static void main(String[] args) {
		String[] texte1 = { "text zeile 1", "text zeile 2", "text zeile 3" };
		wandleZeichenkette(texte1);
		String[] texte2 = { "dies ist ", "ein ganz", " normaler ", "text" };
		wandleZeichenkette(texte2);

		String text1 = "dies ist ein text mit leerzeichen";
		String teilText1 = liefereSubstring(text1);
		System.out.println(teilText1);
		String text2 = "diesIstEinTextOhneLeerzeichen";
		String teilText2 = liefereSubstring(text2);
		System.out.println(teilText2);
	}

	private static void wandleZeichenkette(String[] texte) {
		System.out.println(); // Leerzeile in Konsole
		System.out.println("Wandle Zeichenkette");
		if (texte != null && texte.length > 0) {
			StringBuilder eineZeile = new StringBuilder();
			StringBuilder mehrereZeilen = new StringBuilder();
			for (int i = 0; i < texte.length; i++) {
				eineZeile.append(texte[i]);
				mehrereZeilen.append(texte[i]);
				mehrereZeilen.append("\n");
			}
			eineZeile.append(texte[0]);
			mehrereZeilen.append(texte[0]);
			System.out.println(eineZeile.toString());
			System.out.println(mehrereZeilen.toString());
		}
	}

	private static String liefereSubstring(String text) {
		System.out.println();
		System.out.println("Liefere Substring");
		String teilText = "";
		int index = text.indexOf(" ");
		if (index >= 0) {
			teilText = text.substring(index);
		}
		return teilText;
	}
}
