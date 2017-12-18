package java1.lesson2.Datentypen;

public class datentypen {

	public static void main(String[] args) {
		System.out.println("Gamzzahlige Typen: byte, schort, int, Long");	
		byte age = 10;
		System.out.println("byte\t 8 Bits "+ Byte.MIN_VALUE + "\t\t\t- " + Byte.MAX_VALUE + "\t\t\t\t\tBeispiel: Schulkind ist " + age + " Jahre alt.");
		short temp = -420;
		System.out.println("short\t16 Bits "+ Short.MIN_VALUE + "\t\t\t- " + Short.MAX_VALUE +"\t\t\t\t\tBeispiel: Es wurde eine Temperatur von "+ temp +"° erreicht");
		int weightInGramm = 2000013;
		System.out.println("int\t32 Bits "+ Integer.MIN_VALUE + "\t\t- " + Integer.MAX_VALUE +"\t\t\t\tGewicht Mehlsack: " + weightInGramm + " g");
		long langeZahl = 12345678912345L;
		System.out.println("long\t64 Bits "+ Long.MIN_VALUE + "\t- " + Long.MAX_VALUE + langeZahl + "\tHinter der Zahl muss ein L gesetzt werden!\n");			

		System.out.println("Gleitkomatypen: float, double");
		float weightInKilos = 2000.013f;
		System.out.println("float\t32 Bits "+ Float.MIN_VALUE + "\t\t\t- " + Float.MAX_VALUE +"\t\t\t\tGewicht Mehlsack: " + weightInKilos + " kg");
		double distanceMarathon = 41.192;
		System.out.println("double\t64 Bits "+ Double.MIN_VALUE + "\t\t- " + Double.MAX_VALUE +"\t\tDistanz Marathon: " + distanceMarathon + " km\n");

		System.out.println("Zeichentyp: char, string");
		char c = 'a';
		System.out.println("char\t16 Bits "+ Character.MIN_VALUE + " - " + Character.MAX_VALUE + "\t\t\tNur ein Zeichen! ASCII Tabelle / Unicode" );		
		String carNrWithKanton = "ZH 112233";
		System.out.println("String beliebige Anzahl Zeichen.\tBeispiel: Autonummer inkl. Kanton: " + carNrWithKanton + "\n");
		
		System.out.println("Logischertyp: boolean");
		boolean ergebnis = false;
		
		System.out.println("boolean ? Bits\t\t"+ ergebnis + "\n");
		
		
		// ==================================================================
		// Aufgabe 2
		// Ueberlauf von short-Werten
		// ==================================================================
		System.out.println("Übung schort Überlauf: 30000 + 30000");	
		short value1 = 30000;
		short value2 = 30000;
		short result = (short) (value1 + value2);
		System.out.println("Resultat Ueberlauf: " + result);
		
	}

}