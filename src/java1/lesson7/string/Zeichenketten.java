package java1.lesson7.string;

public class Zeichenketten {

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
		
		
	private static void wandleZeichenkette(String[] input) {
		System.out.println(); // Leerzeile in Konsole
		StringBuffer einZeiler = new StringBuffer();
		StringBuffer merZeiler = new StringBuffer();
			
		System.out.println("Wandle Zeichenkette:");
			
		for(int i = 0; i <= input.length-1; i++){
			einZeiler.append(input[i]);
			merZeiler.append(input[i]);
			merZeiler.append("\n");
		}
		einZeiler.append(input[0]);
		merZeiler.append(input[0]);
			
		System.out.println(einZeiler);
		System.out.println(merZeiler);
	}
		
	private static String liefereSubstring(String input){
		System.out.println();
		System.out.println("Liefere Substring");
		String teilText = "";
		
		int index = input.indexOf(" ");
		if(index >= 0){
			teilText = input.substring(index);
		}
		return teilText;
	}

}
