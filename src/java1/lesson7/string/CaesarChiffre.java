package java1.lesson7.string;

public class CaesarChiffre {

	private static String chiffre(String text, int faktor) {
		String ergebnis = "";
		char abc[] = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's',
				't', 'u', 'v', 'w', 'x', 'y', 'z' };

		for (int i = 0; i < text.length(); i++) {
			char c = text.charAt(i);
			int j = 0;
			while (c != abc[j]) {
				j++;

			}
			ergebnis = ergebnis + abc[((j + faktor) % 26)];

		}

		return ergebnis;
	}

	public static void main(String[] args) {

		String original = "bauzaun";
		int verschiebung = 8;

		System.out.println(CaesarChiffre.chiffre(original, verschiebung));
	}

}
