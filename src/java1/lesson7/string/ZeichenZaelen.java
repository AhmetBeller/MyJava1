package java1.lesson7.string;

public class ZeichenZaelen {

	private static void zaehleBestimmteZeichen(char[] zeichen, String text){
		System.out.println("\nEs wird folgender Text analysiert: "+ text);
		for(int i = 0; i < zeichen.length; i++ ){
			int counter = 0;
			for(int j = 0; j < text.length(); j++ ){
				
				char textBuchstabe;
				textBuchstabe = text.charAt(j);	// text.charAt(j) übergiebt den Buchstaben an der Stelle j
				if(textBuchstabe == zeichen[i]){
				counter ++;
				}
			}
			System.out.println("Anzahl " + zeichen[i] + ": " + counter);
		}
	}
	
	public static void main(String[] args) {

		char[] zeichen1 = { 'a', 'f', 'r' };
		String text1 = "dies ist ein normaler text";
		zaehleBestimmteZeichen(zeichen1, text1);
		
		char[] zeichen2 = { 'a', 'g', 'i', 'o' };
		String text2 = "wie viele Buchstaben giebt es?";
		zaehleBestimmteZeichen(zeichen2, text2);
	}
}
